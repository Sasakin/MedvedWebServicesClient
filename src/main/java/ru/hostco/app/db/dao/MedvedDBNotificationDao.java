package ru.hostco.app.db.dao;

import ru.hostco.app.db.model.MedvedDBNotification;

import java.util.List;

public interface MedvedDBNotificationDao {
    void saveMedvedDBNotification(MedvedDBNotification medvedDBNotification);

    List<MedvedDBNotification> findAllMedvedDBNotifications();

    void deleteMedvedDBNotificationById(int id);

    MedvedDBNotification findMedvedDBNotificationById(int id);

    MedvedDBNotification findMedvedDBNotificationByRowId(String rowId);

    void updateMedvedDBNotification(MedvedDBNotification medvedDBNotification);

}
