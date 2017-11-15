
package ru.hostco.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * ������ ��� ������ �� ����� �� ������
 * 
 * <p>Java class for DateSlotList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateSlotList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VisitDate" type="{http://www.hostco.ru/types}DateSlot" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateSlotList", propOrder = {
    "visitDate"
})
public class DateSlotList {

    @XmlElement(name = "VisitDate")
    protected List<DateSlot> visitDate;

    /**
     * Gets the value of the visitDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visitDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisitDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateSlot }
     * 
     * 
     */
    public List<DateSlot> getVisitDate() {
        if (visitDate == null) {
            visitDate = new ArrayList<DateSlot>();
        }
        return this.visitDate;
    }

}
