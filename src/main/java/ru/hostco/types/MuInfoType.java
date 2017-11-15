
package ru.hostco.types;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


/**
 * ���������� �� ���
 * 
 * <p>Java class for MuInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MuInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.hostco.ru/types}WeekScheduleType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="muCode" type="{http://www.hostco.ru/types}MuCodeType"/&gt;
 *         &lt;element name="muName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="muAddress"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="150"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="muLocality"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="muLocalityCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="13"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="muWsdlURL" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="muLatitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="muLongitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="extended_info" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MuInfoType", propOrder = {
    "muCode",
    "muName",
    "muAddress",
    "muLocality",
    "muLocalityCode",
    "muWsdlURL",
    "muLatitude",
    "muLongitude",
    "extendedInfo",
    "phone"
})
@XmlSeeAlso({
    ru.hostco.portal.types.GetMuInfoResponse.MuInfo.class
})
public class MuInfoType
    extends WeekScheduleType
{

    @XmlElement(required = true)
    protected String muCode;
    @XmlElement(required = true)
    protected String muName;
    @XmlElement(required = true)
    protected String muAddress;
    @XmlElement(required = true)
    protected String muLocality;
    @XmlElement(required = true)
    protected String muLocalityCode;
    protected String muWsdlURL;
    protected BigDecimal muLatitude;
    protected BigDecimal muLongitude;
    @XmlElement(name = "extended_info")
    protected String extendedInfo;
    protected String phone;

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
     * Gets the value of the muLocality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMuLocality() {
        return muLocality;
    }

    /**
     * Sets the value of the muLocality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMuLocality(String value) {
        this.muLocality = value;
    }

    /**
     * Gets the value of the muLocalityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMuLocalityCode() {
        return muLocalityCode;
    }

    /**
     * Sets the value of the muLocalityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMuLocalityCode(String value) {
        this.muLocalityCode = value;
    }

    /**
     * Gets the value of the muWsdlURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMuWsdlURL() {
        return muWsdlURL;
    }

    /**
     * Sets the value of the muWsdlURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMuWsdlURL(String value) {
        this.muWsdlURL = value;
    }

    /**
     * Gets the value of the muLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMuLatitude() {
        return muLatitude;
    }

    /**
     * Sets the value of the muLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMuLatitude(BigDecimal value) {
        this.muLatitude = value;
    }

    /**
     * Gets the value of the muLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMuLongitude() {
        return muLongitude;
    }

    /**
     * Sets the value of the muLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMuLongitude(BigDecimal value) {
        this.muLongitude = value;
    }

    /**
     * Gets the value of the extendedInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedInfo() {
        return extendedInfo;
    }

    /**
     * Sets the value of the extendedInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedInfo(String value) {
        this.extendedInfo = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

}
