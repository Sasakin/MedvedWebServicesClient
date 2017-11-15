
package ru.hostco.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о записи на приём
 * 
 * <p>Java class for AppointmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppointmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="slipNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="appointmentSource" type="{http://www.hostco.ru/types}AppointmentSourceType"/&gt;
 *         &lt;element name="appointmentStatus" type="{http://www.hostco.ru/types}AppointmentStatusType"/&gt;
 *         &lt;element name="patientFIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppointmentType", propOrder = {
    "slipNumber",
    "appointmentSource",
    "appointmentStatus",
    "patientFIO"
})
public class AppointmentType {

    protected String slipNumber;
    protected int appointmentSource;
    protected int appointmentStatus;
    protected String patientFIO;

    /**
     * Gets the value of the slipNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlipNumber() {
        return slipNumber;
    }

    /**
     * Sets the value of the slipNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlipNumber(String value) {
        this.slipNumber = value;
    }

    /**
     * Gets the value of the appointmentSource property.
     * 
     */
    public int getAppointmentSource() {
        return appointmentSource;
    }

    /**
     * Sets the value of the appointmentSource property.
     * 
     */
    public void setAppointmentSource(int value) {
        this.appointmentSource = value;
    }

    /**
     * Gets the value of the appointmentStatus property.
     * 
     */
    public int getAppointmentStatus() {
        return appointmentStatus;
    }

    /**
     * Sets the value of the appointmentStatus property.
     * 
     */
    public void setAppointmentStatus(int value) {
        this.appointmentStatus = value;
    }

    /**
     * Gets the value of the patientFIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPatientFIO() {
        return patientFIO;
    }

    /**
     * Sets the value of the patientFIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPatientFIO(String value) {
        this.patientFIO = value;
    }

}
