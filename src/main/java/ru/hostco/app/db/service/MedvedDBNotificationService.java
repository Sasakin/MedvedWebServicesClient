package ru.hostco.app.db.service;

import ru.hostco.app.db.model.MedvedDBNotification;

import java.util.List;

public interface MedvedDBNotificationService {
    void saveMedvedDBNotification(MedvedDBNotification medvedDBNotification);

    List<MedvedDBNotification> findAllMedvedDBNotifications();

    void deleteMedvedDBNotificationById(int id);

    MedvedDBNotification findMedvedDBNotificationById(int id);

    MedvedDBNotification findMedvedDBNotificationByRowId(String rowId);

    void updateMedvedDBNotification(MedvedDBNotification medvedDBNotification);

}
