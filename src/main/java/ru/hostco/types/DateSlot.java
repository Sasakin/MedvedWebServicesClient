
package ru.hostco.types;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * ����� �� ������������ ����
 * 
 * <p>Java class for DateSlot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateSlot"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ScheduleDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="ScheduleInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SlotList" type="{http://www.hostco.ru/types}SlotListElements" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateSlot", propOrder = {
    "scheduleDate",
    "scheduleInfo",
    "slotList"
})
public class DateSlot {

    @XmlElement(name = "ScheduleDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar scheduleDate;
    @XmlElement(name = "ScheduleInfo")
    protected String scheduleInfo;
    @XmlElement(name = "SlotList")
    protected SlotListElements slotList;

    /**
     * Gets the value of the scheduleDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleDate() {
        return scheduleDate;
    }

    /**
     * Sets the value of the scheduleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleDate(XMLGregorianCalendar value) {
        this.scheduleDate = value;
    }

    /**
     * Gets the value of the scheduleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleInfo() {
        return scheduleInfo;
    }

    /**
     * Sets the value of the scheduleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleInfo(String value) {
        this.scheduleInfo = value;
    }

    /**
     * Gets the value of the slotList property.
     * 
     * @return
     *     possible object is
     *     {@link SlotListElements }
     *     
     */
    public SlotListElements getSlotList() {
        return slotList;
    }

    /**
     * Sets the value of the slotList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SlotListElements }
     *     
     */
    public void setSlotList(SlotListElements value) {
        this.slotList = value;
    }

}
