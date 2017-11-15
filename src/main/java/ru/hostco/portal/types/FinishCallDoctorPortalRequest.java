
package ru.hostco.portal.types;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * ������ �� ���������� ������ ����� �� ���
 *       
 * 
 * <p>Java class for FinishCallDoctorPortalRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinishCallDoctorPortalRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="muCode" type="{http://www.hostco.ru/types}MuCodeType" minOccurs="0"/&gt;
 *         &lt;element name="CallNumber" type="{http://www.hostco.ru/types}GUIDType"/&gt;
 *         &lt;element name="FinishDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinishCallDoctorPortalRequest", propOrder = {
    "muCode",
    "callNumber",
    "finishDateTime"
})
public class FinishCallDoctorPortalRequest {

    protected String muCode;
    @XmlElement(name = "CallNumber", required = true)
    protected String callNumber;
    @XmlElement(name = "FinishDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finishDateTime;

    /**
     * Gets the value of the muCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMuCode() {
        return muCode;
    }

    /**
     * Sets the value of the muCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMuCode(String value) {
        this.muCode = value;
    }

    /**
     * Gets the value of the callNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallNumber() {
        return callNumber;
    }

    /**
     * Sets the value of the callNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallNumber(String value) {
        this.callNumber = value;
    }

    /**
     * Gets the value of the finishDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinishDateTime() {
        return finishDateTime;
    }

    /**
     * Sets the value of the finishDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinishDateTime(XMLGregorianCalendar value) {
        this.finishDateTime = value;
    }

}
