
package ru.hostco.portal.types;

import ru.hostco.types.PortalServiceResponseType;
import ru.hostco.types.ScheduleElementType;
import ru.hostco.types.SlotListElementDistrict;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * ����� �� ������ �� ��������� ���������� � ����������
 *       
 * 
 * <p>Java class for ScheduleInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="scheduleInfo"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *                   &lt;element name="schedule"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.hostco.ru/types}ScheduleElementType"&gt;
 *                           &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
 *                             &lt;element name="slot" type="{http://www.hostco.ru/types}SlotListElementDistrict"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "ScheduleInfoResponse", propOrder = {
    "scheduleInfo",
    "portalServiceResponse"
})
public class ScheduleInfoResponse {

    protected ScheduleInfoResponse.ScheduleInfo scheduleInfo;
    @XmlElement(namespace = "http://www.hostco.ru/types")
    protected PortalServiceResponseType portalServiceResponse;

    /**
     * Gets the value of the scheduleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleInfoResponse.ScheduleInfo }
     *     
     */
    public ScheduleInfoResponse.ScheduleInfo getScheduleInfo() {
        return scheduleInfo;
    }

    /**
     * Sets the value of the scheduleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleInfoResponse.ScheduleInfo }
     *     
     */
    public void setScheduleInfo(ScheduleInfoResponse.ScheduleInfo value) {
        this.scheduleInfo = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
     *         &lt;element name="schedule"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.hostco.ru/types}ScheduleElementType"&gt;
     *                 &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
     *                   &lt;element name="slot" type="{http://www.hostco.ru/types}SlotListElementDistrict"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "schedule"
    })
    public static class ScheduleInfo {

        protected List<ScheduleInfoResponse.ScheduleInfo.Schedule> schedule;

        /**
         * Gets the value of the schedule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the schedule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSchedule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ScheduleInfoResponse.ScheduleInfo.Schedule }
         * 
         * 
         */
        public List<ScheduleInfoResponse.ScheduleInfo.Schedule> getSchedule() {
            if (schedule == null) {
                schedule = new ArrayList<ScheduleInfoResponse.ScheduleInfo.Schedule>();
            }
            return this.schedule;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.hostco.ru/types}ScheduleElementType"&gt;
         *       &lt;sequence maxOccurs="unbounded" minOccurs="0"&gt;
         *         &lt;element name="slot" type="{http://www.hostco.ru/types}SlotListElementDistrict"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "slot"
        })
        public static class Schedule
            extends ScheduleElementType
        {

            protected List<SlotListElementDistrict> slot;

            /**
             * Gets the value of the slot property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the slot property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSlot().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SlotListElementDistrict }
             * 
             * 
             */
            public List<SlotListElementDistrict> getSlot() {
                if (slot == null) {
                    slot = new ArrayList<SlotListElementDistrict>();
                }
                return this.slot;
            }

        }

    }

}
