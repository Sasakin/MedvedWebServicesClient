
package ru.hostco.types;

import javax.xml.bind.annotation.*;


/**
 * GUID ����� ������ ������������ ����
 * 
 * <p>Java class for SlotInfoGUID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SlotInfoGUID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GUID" type="{http://www.hostco.ru/types}GUIDType"/&gt;
 *         &lt;element name="needExtra" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SlotInfoGUID", propOrder = {
    "guid",
    "needExtra"
})
@XmlSeeAlso({
    ExtendedSlotInfoGUID.class
})
public class SlotInfoGUID {

    @XmlElement(name = "GUID", required = true)
    protected String guid;
    protected Boolean needExtra;

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGUID() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGUID(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the needExtra property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNeedExtra() {
        return needExtra;
    }

    /**
     * Sets the value of the needExtra property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNeedExtra(Boolean value) {
        this.needExtra = value;
    }

}
