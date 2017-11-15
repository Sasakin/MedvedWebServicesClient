
package ru.hostco.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * ����� �� �������, �������������� ������� ����� ��� ������ ������
 *       
 * 
 * <p>Java class for SlotListResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SlotListResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="slotInfo" type="{http://www.hostco.ru/types}SlotInfoPatient" maxOccurs="unbounded"/&gt;
 *           &lt;element name="schedule" type="{http://www.hostco.ru/types}ScheduleElementType" minOccurs="0"/&gt;
 *           &lt;element name="slot" type="{http://www.hostco.ru/types}SlotListElement" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element ref="{http://www.hostco.ru/types}portalServiceResponse"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SlotListResponseType", propOrder = {
    "slotInfo",
    "schedule",
    "slot",
    "portalServiceResponse"
})
public class SlotListResponseType {

    protected List<SlotInfoPatient> slotInfo;
    protected ScheduleElementType schedule;
    protected SlotListElement slot;
    protected PortalServiceResponseType portalServiceResponse;

    /**
     * Gets the value of the slotInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the slotInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSlotInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SlotInfoPatient }
     * 
     * 
     */
    public List<SlotInfoPatient> getSlotInfo() {
        if (slotInfo == null) {
            slotInfo = new ArrayList<SlotInfoPatient>();
        }
        return this.slotInfo;
    }

    /**
     * Gets the value of the schedule property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleElementType }
     *     
     */
    public ScheduleElementType getSchedule() {
        return schedule;
    }

    /**
     * Sets the value of the schedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleElementType }
     *     
     */
    public void setSchedule(ScheduleElementType value) {
        this.schedule = value;
    }

    /**
     * Gets the value of the slot property.
     * 
     * @return
     *     possible object is
     *     {@link SlotListElement }
     *     
     */
    public SlotListElement getSlot() {
        return slot;
    }

    /**
     * Sets the value of the slot property.
     * 
     * @param value
     *     allowed object is
     *     {@link SlotListElement }
     *     
     */
    public void setSlot(SlotListElement value) {
        this.slot = value;
    }

    /**
     * Gets the value of the portalServiceResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PortalServiceResponseType }
     *     
     */
    public PortalServiceResponseType getPortalServiceResponse() {
        return portalServiceResponse;
    }

    /**
     * Sets the value of the portalServiceResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortalServiceResponseType }
     *     
     */
    public void setPortalServiceResponse(PortalServiceResponseType value) {
        this.portalServiceResponse = value;
    }

}
