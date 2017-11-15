
package ru.hostco.portal.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Запрос на поиск участка по адресу
 * 
 * <p>Java class for FindDistrictRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindDistrictRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kladrCode" type="{http://www.hostco.ru/types}KLADRCodeType"/&gt;
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="houseNumer" type="{http://www.hostco.ru/types}RequestHouseNumber"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FindDistrictRequest", propOrder = {
    "kladrCode",
    "street",
    "houseNumer"
})
public class FindDistrictRequest {

    @XmlElement(required = true)
    protected String kladrCode;
    @XmlElement(required = true)
    protected String street;
    @XmlElement(required = true)
    protected String houseNumer;

    /**
     * Gets the value of the kladrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKladrCode() {
        return kladrCode;
    }

    /**
     * Sets the value of the kladrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKladrCode(String value) {
        this.kladrCode = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the houseNumer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseNumer() {
        return houseNumer;
    }

    /**
     * Sets the value of the houseNumer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseNumer(String value) {
        this.houseNumer = value;
    }

}
