
package ru.hostco.types;

import javax.xml.bind.annotation.*;


/**
 * ������ �� ��������� ��������� �����
 * 
 * <p>Java class for ChangeSlotStateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeSlotStateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="slotInfo" type="{http://www.hostco.ru/types}SlotInfoPatient"/&gt;
 *         &lt;element name="status" type="{http://www.hostco.ru/types}AppointmentStatusType"/&gt;
 *         &lt;element name="slipNumber" type="{http://www.hostco.ru/types}SlipNumberType" minOccurs="0"/&gt;
 *         &lt;element name="appointmentSource" type="{http://www.hostco.ru/types}AppointmentSourceType"/&gt;
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeSlotStateType", propOrder = {
    "slotInfo",
    "status",
    "slipNumber",
    "appointmentSource",
    "token"
})
@XmlSeeAlso({
    ChangeSlotStateSlipType.class
})
public class ChangeSlotStateType {

    @XmlElement(required = true)
    protected SlotInfoPatient slotInfo;
    protected int status;
    protected String slipNumber;
    protected int appointmentSource;
    protected String token;

    /**
     * Gets the value of the slotInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SlotInfoPatient }
     *     
     */
    public SlotInfoPatient getSlotInfo() {
        return slotInfo;
    }

    /**
     * Sets the value of the slotInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SlotInfoPatient }
     *     
     */
    public void setSlotInfo(SlotInfoPatient value) {
        this.slotInfo = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

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
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

}
