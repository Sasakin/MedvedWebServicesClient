
package ru.hostco.types;

import javax.xml.bind.annotation.*;


/**
 * ������� ���������� � �����
 * 
 * <p>Java class for SlotInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SlotInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GUID" type="{http://www.hostco.ru/types}GUIDType"/&gt;
 *         &lt;element name="SlotState" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SlotInfo", propOrder = {
    "guid",
    "slotState"
})
@XmlSeeAlso({
    SlotInfoPatient.class,
    SlotInfoDistricts.class
})
public class SlotInfo {

    @XmlElement(name = "GUID", required = true)
    protected String guid;
    @XmlElement(name = "SlotState")
    protected int slotState;

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
     * Gets the value of the slotState property.
     * 
     */
    public int getSlotState() {
        return slotState;
    }

    /**
     * Sets the value of the slotState property.
     * 
     */
    public void setSlotState(int value) {
        this.slotState = value;
    }

}
