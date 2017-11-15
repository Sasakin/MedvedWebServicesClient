
package ru.hostco.types;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * ������� ������ � ���������� � �����
 * 
 * <p>Java class for SlotListElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SlotListElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="timeInterval" type="{http://www.hostco.ru/types}TimeIntervalType"/&gt;
 *         &lt;element name="slotType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="slotTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="slotInfo" type="{http://www.hostco.ru/types}SlotInfoDistricts"/&gt;
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="appointment" type="{http://www.hostco.ru/types}AppointmentType"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SlotListElement", propOrder = {
    "timeInterval",
    "slotType",
    "slotTypeName",
    "slotInfo",
    "appointment"
})
@XmlSeeAlso({
    SlotListElementDistrict.class,
    AppointmentSlotElement.class
})
public class SlotListElement {

    @XmlElement(required = true)
    protected TimeIntervalType timeInterval;
    protected int slotType;
    protected String slotTypeName;
    @XmlElement(required = true)
    protected SlotInfoDistricts slotInfo;
    protected List<AppointmentType> appointment;

    /**
     * Gets the value of the timeInterval property.
     * 
     * @return
     *     possible object is
     *     {@link TimeIntervalType }
     *     
     */
    public TimeIntervalType getTimeInterval() {
        return timeInterval;
    }

    /**
     * Sets the value of the timeInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeIntervalType }
     *     
     */
    public void setTimeInterval(TimeIntervalType value) {
        this.timeInterval = value;
    }

    /**
     * Gets the value of the slotType property.
     * 
     */
    public int getSlotType() {
        return slotType;
    }

    /**
     * Sets the value of the slotType property.
     * 
     */
    public void setSlotType(int value) {
        this.slotType = value;
    }

    /**
     * Gets the value of the slotTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlotTypeName() {
        return slotTypeName;
    }

    /**
     * Sets the value of the slotTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlotTypeName(String value) {
        this.slotTypeName = value;
    }

    /**
     * Gets the value of the slotInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SlotInfoDistricts }
     *     
     */
    public SlotInfoDistricts getSlotInfo() {
        return slotInfo;
    }

    /**
     * Sets the value of the slotInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SlotInfoDistricts }
     *     
     */
    public void setSlotInfo(SlotInfoDistricts value) {
        this.slotInfo = value;
    }

    /**
     * Gets the value of the appointment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appointment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppointment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppointmentType }
     * 
     * 
     */
    public List<AppointmentType> getAppointment() {
        if (appointment == null) {
            appointment = new ArrayList<AppointmentType>();
        }
        return this.appointment;
    }

}
