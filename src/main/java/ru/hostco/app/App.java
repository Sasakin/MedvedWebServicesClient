package ru.hostco.app;

import oracle.jdbc.OracleTypes;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import ru.hostco.app.confiquration.AppConfig;
import ru.hostco.app.db.DBChangeNotification;
import ru.hostco.app.db.dao.AbstractDao;
import ru.hostco.app.db.dao.MedvedDBNotificationDaoImpl;
import ru.hostco.app.db.model.MedvedDBNotification;
import ru.hostco.app.db.service.DepartmentTypeService;
import ru.hostco.app.db.service.MedvedDBNotificationService;

import java.sql.SQLException;
import java.util.List;

public class App {

    public static void main(String[] argv)
    {
        DBChangeNotification demo = new DBChangeNotification();
        try
        {
            demo.run();
        }
        catch(SQLException mainSQLException )
        {
            mainSQLException.printStackTrace();
        }
    }
}
