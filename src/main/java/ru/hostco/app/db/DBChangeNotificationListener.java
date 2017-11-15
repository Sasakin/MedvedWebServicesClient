package ru.hostco.app.db;

import oracle.jdbc.OracleConnection;
import oracle.jdbc.OracleDriver;
import oracle.jdbc.dcn.DatabaseChangeEvent;
import oracle.jdbc.dcn.DatabaseChangeListener;
import oracle.jdbc.dcn.RowChangeDescription;
import oracle.jdbc.dcn.TableChangeDescription;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import ru.hostco.app.RequestManager;
import ru.hostco.app.confiquration.AppConfig;
import ru.hostco.app.db.model.MedvedDBNotification;
import ru.hostco.app.db.service.MedvedDBNotificationService;
import ru.hostco.portal.Portal;
import ru.hostco.portal.PortalImpl;

import java.sql.SQLException;
import java.util.Properties;

public class DBChangeNotificationListener implements DatabaseChangeListener {

    private DBChangeNotification demo;
    private AbstractApplicationContext context;
    private MedvedDBNotificationService service;
    private RequestManager requestManager;


    DBChangeNotificationListener(DBChangeNotification dem) {
        demo = dem;
        context = new AnnotationConfigApplicationContext(AppConfig.class);
        service = (MedvedDBNotificationService) context.getBean("medvedDBNotificationService");
        requestManager = new RequestManager();
    }

    public void onDatabaseChangeNotification(DatabaseChangeEvent e) {
        Thread t = Thread.currentThread();
        System.out.println("DCNDemoListener: got an event (" + this + " running on thread " + t + ")");
        System.out.println(e.toString());
        String rowId = ((RowChangeDescription[]) ((TableChangeDescription[]) e.getTableChangeDescription())[0].getRowChangeDescription())[0].getRowid().toString();
        MedvedDBNotification medvedDBNotification = service.findMedvedDBNotificationByRowId(rowId);
        sendRequestOnMedvedWebServis(medvedDBNotification);
        service.deleteMedvedDBNotificationById(medvedDBNotification.getId());

        synchronized (demo) {
            demo.notify();
        }
    }


    private void sendRequestOnMedvedWebServis(MedvedDBNotification notificationData) {
        notificationData.setStatus(1);                                          // 1. Начало обработки - задаем статус 1
        service.updateMedvedDBNotification(notificationData);
        requestManager.sendRequest(notificationData.getEventType());
    }
}
