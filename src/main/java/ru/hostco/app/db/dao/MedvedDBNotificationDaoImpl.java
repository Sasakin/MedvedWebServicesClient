package ru.hostco.app.db.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import oracle.jdbc.OracleTypes;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.jdbc.ReturningWork;
import org.springframework.stereotype.Repository;
import ru.hostco.app.db.model.MedvedDBNotification;
import ru.hostco.types.DepartmentType;

@Repository("medvedDBNotificationDao")
public class MedvedDBNotificationDaoImpl extends AbstractDao implements MedvedDBNotificationDao {

    public void saveMedvedDBNotification(MedvedDBNotification medvedDBNotification) {
        persist(medvedDBNotification);
    }

    @SuppressWarnings("unchecked")
    public List<MedvedDBNotification> findAllMedvedDBNotifications() {
        Criteria criteria = getSession().createCriteria(MedvedDBNotification.class);
        return (List<MedvedDBNotification>) criteria.list();
    }

    public void deleteMedvedDBNotificationById(int id) {
        Query query = getSession().createSQLQuery("delete from  INETUSER.MEDVED_DB_NOTIFICATION where id = :id");
        query.setInteger("id", id);
        query.executeUpdate();
    }

    public MedvedDBNotification findMedvedDBNotificationById(int id) {
        Criteria criteria = getSession().createCriteria(MedvedDBNotification.class);
        criteria.add(Restrictions.eq("id",id));
        return (MedvedDBNotification) criteria.uniqueResult();
    }

    public MedvedDBNotification findMedvedDBNotificationByRowId(String rowId) {
        Criteria criteria = getSession().createCriteria(MedvedDBNotification.class);
        criteria.add(Restrictions.eq("rowId",rowId));
        return (MedvedDBNotification) criteria.uniqueResult();
    }

    public void updateMedvedDBNotification(MedvedDBNotification medvedDBNotification) {
        getSession().update(medvedDBNotification);
    }

}
