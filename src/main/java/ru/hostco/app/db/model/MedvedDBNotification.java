package ru.hostco.app.db.model;
/******************************************************************************
 * Module:  MEDVED_DB_NOTIFICATION.java
 * Author:  Sasakin
 * Date:    10.11.2017
 * Purpose: Defines the Class MEDVED_DB_NOTIFICATION
 ******************************************************************************/
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDate;

@Entity
@Table(name="INETUSER.MEDVED_DB_NOTIFICATION")
public class MedvedDBNotification {

    @Id
    @Column(name = "ID", nullable = false, unique = true)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "CREATEDATE", nullable = true)
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private LocalDate CreateDate;
    @Column(name = "UPDATEDATE", nullable = true)
    @Type(type="org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
    private LocalDate UpdateDate;
    @Column(name = "EVENT_TYPE", nullable = true)
    private String EventType;
    @Column(name = "STATUS", nullable = true)
    private Integer Status;
    @Column(name = "SOURCE_ID", nullable = true)
    private Integer SourceId;
    @Column(name = "ROWID", insertable = false, updatable = false, unique = true)
    private String rowId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(LocalDate createDate) {
        CreateDate = createDate;
    }

    public LocalDate getUpdateDate() {
        return UpdateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        UpdateDate = updateDate;
    }

    public String getEventType() {
        return EventType;
    }

    public void setEventType(String eventType) {
        EventType = eventType;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer status) {
        Status = status;
    }

    public Integer getSourceId() {
        return SourceId;
    }

    public void setSourceId(Integer sourceId) {
        SourceId = sourceId;
    }

    public String getRowId() {
        return rowId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MedvedDBNotification that = (MedvedDBNotification) o;

        if (!id.equals(that.id)) return false;
        if (CreateDate != null ? !CreateDate.equals(that.CreateDate) : that.CreateDate != null) return false;
        if (UpdateDate != null ? !UpdateDate.equals(that.UpdateDate) : that.UpdateDate != null) return false;
        if (EventType != null ? !EventType.equals(that.EventType) : that.EventType != null) return false;
        if (Status != null ? !Status.equals(that.Status) : that.Status != null) return false;
        return SourceId != null ? SourceId.equals(that.SourceId) : that.SourceId == null;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (CreateDate != null ? CreateDate.hashCode() : 0);
        result = 31 * result + (UpdateDate != null ? UpdateDate.hashCode() : 0);
        result = 31 * result + (EventType != null ? EventType.hashCode() : 0);
        result = 31 * result + (Status != null ? Status.hashCode() : 0);
        result = 31 * result + (SourceId != null ? SourceId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MedvedDBNotification{" +
                "id=" + id +
                ", CreateDate=" + CreateDate +
                ", UpdateDate=" + UpdateDate +
                ", EventType='" + EventType + '\'' +
                ", Status=" + Status +
                ", SourceId=" + SourceId +
                ", rowId='" + rowId + '\'' +
                '}';
    }
}
