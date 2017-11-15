
package ru.hostco.portal.types;

import ru.hostco.types.ScheduleElementType;
import ru.hostco.types.SlotListElementDistrict;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * ������ �� ���������� ����������
 * 
 * <p>Java class for UpdateScheduleRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateScheduleRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.hostco.ru/types}ScheduleElementType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence maxOccurs="unbounded"&gt;
 *           &lt;element name="SlotElement" type="{http://www.hostco.ru/types}SlotListElementDistrict"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="update" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateScheduleRequest", propOrder = {
    "slotElement",
    "update"
})
public class UpdateScheduleRequest
    extends ScheduleElementType
{

    @XmlElement(name = "SlotElement", required = true)
    protected List<SlotListElementDistrict> slotElement;
    protected Boolean update;

    /**
     * Gets the value of the slotElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the slotElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSlotElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SlotListElementDistrict }
     * 
     * 
     */
    public List<SlotListElementDistrict> getSlotElement() {
        if (slotElement == null) {
            slotElement = new ArrayList<SlotListElementDistrict>();
        }
        return this.slotElement;
    }

    /**
     * Gets the value of the update property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpdate() {
        return update;
    }

    /**
     * Sets the value of the update property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpdate(Boolean value) {
        this.update = value;
    }

}
