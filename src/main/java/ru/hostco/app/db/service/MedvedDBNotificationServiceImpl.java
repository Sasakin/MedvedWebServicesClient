package ru.hostco.app.db.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.hostco.app.db.dao.MedvedDBNotificationDao;
import ru.hostco.app.db.model.MedvedDBNotification;


@Service("medvedDBNotificationService")
@Transactional
public class MedvedDBNotificationServiceImpl implements MedvedDBNotificationService {

    @Autowired
    private MedvedDBNotificationDao dao;

    public void saveMedvedDBNotification(MedvedDBNotification medvedDBNotification) {
        dao.saveMedvedDBNotification(medvedDBNotification);
    }

    public List<MedvedDBNotification> findAllMedvedDBNotifications() {
        return dao.findAllMedvedDBNotifications();
    }

    public void deleteMedvedDBNotificationById(int id) {
        dao.deleteMedvedDBNotificationById(id);
    }

    public MedvedDBNotification findMedvedDBNotificationById(int id) {
        return dao.findMedvedDBNotificationById(id);
    }

    public MedvedDBNotification findMedvedDBNotificationByRowId(String rowId) {
        return dao.findMedvedDBNotificationByRowId(rowId);
    }

    public void updateMedvedDBNotification(MedvedDBNotification medvedDBNotification) {
        dao.updateMedvedDBNotification(medvedDBNotification);
    }

}
