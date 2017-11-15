package ru.hostco.app.db;

import oracle.jdbc.OracleConnection;
import oracle.jdbc.OracleDriver;
import oracle.jdbc.OracleStatement;
import oracle.jdbc.dcn.*;
import org.hibernate.Session;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import ru.hostco.app.confiquration.AppConfig;
import ru.hostco.app.db.model.MedvedDBNotification;
import ru.hostco.app.db.service.MedvedDBNotificationService;
import ru.hostco.portal.Portal;
import ru.hostco.portal.Portal_Service;
import ru.hostco.portal.types.GetMuInfoRequest;
import ru.hostco.portal.types.GetMuInfoResponse;
import ru.hostco.portal.types.UpdateMuInfoRequest;

import javax.sql.DataSource;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DBChangeNotification
{

   public void run() throws SQLException
    {
        AbstractApplicationContext context = context = new AnnotationConfigApplicationContext(AppConfig.class);
        DataSource source = (DataSource) context.getBean("dataSource");
        OracleConnection conn = (OracleConnection) source.getConnection();

        // first step: create a registration on the server:
        Properties prop = new Properties();

        prop.setProperty(OracleConnection.DCN_IGNORE_DELETEOP, "true");
        prop.setProperty(OracleConnection.DCN_IGNORE_UPDATEOP, "true");
        prop.setProperty(OracleConnection.DCN_NOTIFY_ROWIDS,"true");

        DatabaseChangeRegistration dcr = conn.registerDatabaseChangeNotification(prop);

        try
        {
            // add the listenerr:
            DBChangeNotificationListener listener = new DBChangeNotificationListener(this);
            dcr.addListener(listener);

            // second step: add objects in the registration:
            Statement stmt = conn.createStatement();
            // associate the statement with the registration:
            ((OracleStatement)stmt).setDatabaseChangeRegistration(dcr);
            ResultSet rs = stmt.executeQuery("select * from inetuser.medved_db_notification");
            while (rs.next())
            {

            }

            String[] tableNames = dcr.getTables();
            for (String tableName : tableNames) System.out.println(tableName + " is part of the registration.");
            rs.close();
            stmt.close();
        }
        catch(SQLException ex)
        {
            // if an exception occurs, we need to close the registration in order
            // to interrupt the thread otherwise it will be hanging around.
            if(conn != null)
                conn.unregisterDatabaseChangeNotification(dcr);
            throw ex;
        }
        finally
        {
            try
            {
                // Note that we close the connection!
                conn.close();
            }
            catch(Exception innerex){ innerex.printStackTrace(); }
        }

        while(true) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException ie) {
                }
            }
        }

        // At the end: close the registration (comment out these 3 lines in order
        // to leave the registration open).
        /*OracleConnection conn3 = connect();
        conn3.unregisterDatabaseChangeNotification(dcr);
        conn3.close();*/
    }

}
