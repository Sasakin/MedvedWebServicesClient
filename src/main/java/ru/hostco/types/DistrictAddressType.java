
package ru.hostco.types;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * ����� �������
 * 
 * <p>Java class for DistrictAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistrictAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="House" type="{http://www.hostco.ru/types}HouseNumber" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="even" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="kladrCode" type="{http://www.hostco.ru/types}KLADRCodeStreetType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistrictAddressType", propOrder = {
    "street",
    "house",
    "even",
    "kladrCode"
})
public class DistrictAddressType {

    @XmlElement(name = "Street", required = true)
    protected String street;
    @XmlElement(name = "House")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> house;
    protected Boolean even;
    protected String kladrCode;

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
     * Gets the value of the house property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the house property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHouse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getHouse() {
        if (house == null) {
            house = new ArrayList<String>();
        }
        return this.house;
    }

    /**
     * Gets the value of the even property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEven() {
        return even;
    }

    /**
     * Sets the value of the even property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEven(Boolean value) {
        this.even = value;
    }

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

}
