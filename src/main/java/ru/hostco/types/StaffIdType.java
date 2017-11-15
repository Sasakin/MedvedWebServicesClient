
package ru.hostco.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о работнике ЛПУ, позволяющая его идентифицировать
 *       
 * 
 * <p>Java class for StaffIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StaffIdType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="snils" type="{http://www.hostco.ru/types}SNILSType"/&gt;
 *         &lt;element name="specCode" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="positionCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaffIdType", propOrder = {
    "snils",
    "specCode",
    "positionCode"
})
public class StaffIdType {

    @XmlElement(required = true)
    protected String snils;
    protected long specCode;
    protected int positionCode;

    /**
     * Gets the value of the snils property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnils() {
        return snils;
    }

    /**
     * Sets the value of the snils property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnils(String value) {
        this.snils = value;
    }

    /**
     * Gets the value of the specCode property.
     * 
     */
    public long getSpecCode() {
        return specCode;
    }

    /**
     * Sets the value of the specCode property.
     * 
     */
    public void setSpecCode(long value) {
        this.specCode = value;
    }

    /**
     * Gets the value of the positionCode property.
     * 
     */
    public int getPositionCode() {
        return positionCode;
    }

    /**
     * Sets the value of the positionCode property.
     * 
     */
    public void setPositionCode(int value) {
        this.positionCode = value;
    }

}
