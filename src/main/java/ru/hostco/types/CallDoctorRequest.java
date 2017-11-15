
package ru.hostco.types;

import ru.hostco.portal.types.CallDoctorPortalRequest;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * ������ �� ����� ����� �� ���
 * 
 * <p>Java class for CallDoctorRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallDoctorRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CallDateTime" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="PatientInfo" type="{http://www.hostco.ru/types}PatientInfoType"/&gt;
 *         &lt;element name="OtherPatientInfo" type="{http://www.hostco.ru/types}PatientInfoType" minOccurs="0"/&gt;
 *         &lt;element name="Address" type="{http://www.hostco.ru/types}AddressType"/&gt;
 *         &lt;element name="Complaint"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
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
@XmlType(name = "CallDoctorRequest", propOrder = {
    "callDateTime",
    "patientInfo",
    "otherPatientInfo",
    "address",
    "complaint"
})
@XmlSeeAlso({
    CallDoctorPortalRequest.class
})
public class CallDoctorRequest {

    @XmlElement(name = "CallDateTime", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar callDateTime;
    @XmlElement(name = "PatientInfo", required = true)
    protected PatientInfoType patientInfo;
    @XmlElement(name = "OtherPatientInfo")
    protected PatientInfoType otherPatientInfo;
    @XmlElement(name = "Address", required = true)
    protected AddressType address;
    @XmlElement(name = "Complaint", required = true)
    protected String complaint;

    /**
     * Gets the value of the callDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCallDateTime() {
        return callDateTime;
    }

    /**
     * Sets the value of the callDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCallDateTime(XMLGregorianCalendar value) {
        this.callDateTime = value;
    }

    /**
     * Gets the value of the patientInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PatientInfoType }
     *     
     */
    public PatientInfoType getPatientInfo() {
        return patientInfo;
    }

    /**
     * Sets the value of the patientInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientInfoType }
     *     
     */
    public void setPatientInfo(PatientInfoType value) {
        this.patientInfo = value;
    }

    /**
     * Gets the value of the otherPatientInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PatientInfoType }
     *     
     */
    public PatientInfoType getOtherPatientInfo() {
        return otherPatientInfo;
    }

    /**
     * Sets the value of the otherPatientInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientInfoType }
     *     
     */
    public void setOtherPatientInfo(PatientInfoType value) {
        this.otherPatientInfo = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the complaint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplaint() {
        return complaint;
    }

    /**
     * Sets the value of the complaint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplaint(String value) {
        this.complaint = value;
    }

}
