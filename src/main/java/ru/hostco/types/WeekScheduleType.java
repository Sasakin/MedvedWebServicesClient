
package ru.hostco.types;

import ru.hostco.portal.types.UpdateMuInfoRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * ���������� �� ������
 * 
 * <p>Java class for WeekScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeekScheduleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="workMonday" type="{http://www.hostco.ru/types}TimeIntervalType" minOccurs="0"/&gt;
 *         &lt;element name="workTuesday" type="{http://www.hostco.ru/types}TimeIntervalType" minOccurs="0"/&gt;
 *         &lt;element name="workWednesday" type="{http://www.hostco.ru/types}TimeIntervalType" minOccurs="0"/&gt;
 *         &lt;element name="workThursday" type="{http://www.hostco.ru/types}TimeIntervalType" minOccurs="0"/&gt;
 *         &lt;element name="workFriday" type="{http://www.hostco.ru/types}TimeIntervalType" minOccurs="0"/&gt;
 *         &lt;element name="workSaturday" type="{http://www.hostco.ru/types}TimeIntervalType" minOccurs="0"/&gt;
 *         &lt;element name="workSunday" type="{http://www.hostco.ru/types}TimeIntervalType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeekScheduleType", propOrder = {
    "workMonday",
    "workTuesday",
    "workWednesday",
    "workThursday",
    "workFriday",
    "workSaturday",
    "workSunday"
})
@XmlSeeAlso({
    UpdateMuInfoRequest.class,
    MuInfoType.class
})
public class WeekScheduleType {

    protected TimeIntervalType workMonday;
    protected TimeIntervalType workTuesday;
    protected TimeIntervalType workWednesday;
    protected TimeIntervalType workThursday;
    protected TimeIntervalType workFriday;
    protected TimeIntervalType workSaturday;
    protected TimeIntervalType workSunday;

    /**
     * Gets the value of the workMonday property.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalType }
     *     
     */
    public TimeIntervalType getWorkMonday() {
        return workMonday;
    }

    /**
     * Sets the value of the workMonday property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalType }
     *     
     */
    public void setWorkMonday(TimeIntervalType value) {
        this.workMonday = value;
    }

    /**
     * Gets the value of the workTuesday property.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalType }
     *     
     */
    public TimeIntervalType getWorkTuesday() {
        return workTuesday;
    }

    /**
     * Sets the value of the workTuesday property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalType }
     *     
     */
    public void setWorkTuesday(TimeIntervalType value) {
        this.workTuesday = value;
    }

    /**
     * Gets the value of the workWednesday property.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalType }
     *     
     */
    public TimeIntervalType getWorkWednesday() {
        return workWednesday;
    }

    /**
     * Sets the value of the workWednesday property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalType }
     *     
     */
    public void setWorkWednesday(TimeIntervalType value) {
        this.workWednesday = value;
    }

    /**
     * Gets the value of the workThursday property.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalType }
     *     
     */
    public TimeIntervalType getWorkThursday() {
        return workThursday;
    }

    /**
     * Sets the value of the workThursday property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalType }
     *     
     */
    public void setWorkThursday(TimeIntervalType value) {
        this.workThursday = value;
    }

    /**
     * Gets the value of the workFriday property.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalType }
     *     
     */
    public TimeIntervalType getWorkFriday() {
        return workFriday;
    }

    /**
     * Sets the value of the workFriday property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalType }
     *     
     */
    public void setWorkFriday(TimeIntervalType value) {
        this.workFriday = value;
    }

    /**
     * Gets the value of the workSaturday property.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalType }
     *     
     */
    public TimeIntervalType getWorkSaturday() {
        return workSaturday;
    }

    /**
     * Sets the value of the workSaturday property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalType }
     *     
     */
    public void setWorkSaturday(TimeIntervalType value) {
        this.workSaturday = value;
    }

    /**
     * Gets the value of the workSunday property.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalType }
     *     
     */
    public TimeIntervalType getWorkSunday() {
        return workSunday;
    }

    /**
     * Sets the value of the workSunday property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalType }
     *     
     */
    public void setWorkSunday(TimeIntervalType value) {
        this.workSunday = value;
    }

}
