
package ru.hostco.types;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * ������� ������ � ����������� � ������ � ��������� � �����
 *       
 * 
 * <p>Java class for AppointmentSlotElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppointmentSlotElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.hostco.ru/types}SlotListElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="appointmentDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="muName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="muAddress" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="docPosition"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="docFIO" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppointmentSlotElement", propOrder = {
    "appointmentDate",
    "muName",
    "muAddress",
    "docPosition",
    "docFIO"
})
public class AppointmentSlotElement
    extends SlotListElement
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar appointmentDate;
    @XmlElement(required = true)
    protected String muName;
    protected String muAddress;
    @XmlElement(required = true)
    protected String docPosition;
    @XmlElement(required = true)
    protected String docFIO;

    /**
     * Gets the value of the appointmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAppointmentDate() {
        return appointmentDate;
    }

    /**
     * Sets the value of the appointmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAppointmentDate(XMLGregorianCalendar value) {
        this.appointmentDate = value;
    }

    /**
     * Gets the value of the muName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMuName() {
        return muName;
    }

    /**
     * Sets the value of the muName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMuName(String value) {
        this.muName = value;
    }

    /**
     * Gets the value of the muAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMuAddress() {
        return muAddress;
    }

    /**
     * Sets the value of the muAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMuAddress(String value) {
        this.muAddress = value;
    }

    /**
     * Gets the value of the docPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocPosition() {
        return docPosition;
    }

    /**
     * Sets the value of the docPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocPosition(String value) {
        this.docPosition = value;
    }

    /**
     * Gets the value of the docFIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocFIO() {
        return docFIO;
    }

    /**
     * Sets the value of the docFIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocFIO(String value) {
        this.docFIO = value;
    }

}
