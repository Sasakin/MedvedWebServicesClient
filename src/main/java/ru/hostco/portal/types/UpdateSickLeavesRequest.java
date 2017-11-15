
package ru.hostco.portal.types;

import ru.hostco.types.SickLeaveElementType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * ������ �� ���������� ���������� �� ���������� ������������
 *       
 * 
 * <p>Java class for UpdateSickLeavesRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateSickLeavesRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="muCode" type="{http://www.hostco.ru/types}MuCodeType"/&gt;
 *         &lt;sequence maxOccurs="unbounded"&gt;
 *           &lt;element name="sickLeave" type="{http://www.hostco.ru/types}SickLeaveElementType"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateSickLeavesRequest", propOrder = {
    "muCode",
    "sickLeave"
})
public class UpdateSickLeavesRequest {

    @XmlElement(required = true)
    protected String muCode;
    @XmlElement(required = true)
    protected List<SickLeaveElementType> sickLeave;

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
     * Gets the value of the sickLeave property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sickLeave property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSickLeave().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SickLeaveElementType }
     * 
     * 
     */
    public List<SickLeaveElementType> getSickLeave() {
        if (sickLeave == null) {
            sickLeave = new ArrayList<SickLeaveElementType>();
        }
        return this.sickLeave;
    }

}
