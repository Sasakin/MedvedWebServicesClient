
package ru.hostco.portal.types;

import ru.hostco.types.AppointmentSlotElement;
import ru.hostco.types.PortalServiceResponseType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * �������� ��������� � ����������� � ������� ��������
 * 
 * <p>Java class for GetAppointmentsBySNILSResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAppointmentsBySNILSResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="Appointment" type="{http://www.hostco.ru/types}AppointmentSlotElement" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "GetAppointmentsBySNILSResponseType", propOrder = {
    "appointment",
    "portalServiceResponse"
})
public class GetAppointmentsBySNILSResponseType {

    @XmlElement(name = "Appointment")
    protected List<AppointmentSlotElement> appointment;
    @XmlElement(namespace = "http://www.hostco.ru/types")
    protected PortalServiceResponseType portalServiceResponse;

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
     * {@link AppointmentSlotElement }
     * 
     * 
     */
    public List<AppointmentSlotElement> getAppointment() {
        if (appointment == null) {
            appointment = new ArrayList<AppointmentSlotElement>();
        }
        return this.appointment;
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
