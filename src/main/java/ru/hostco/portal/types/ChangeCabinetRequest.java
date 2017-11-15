
package ru.hostco.portal.types;

import ru.hostco.types.ScheduleElementType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ������ �� ����� �������� �����
 * 
 * <p>Java class for ChangeCabinetRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeCabinetRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.hostco.ru/types}ScheduleElementType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="newDeptCode" type="{http://www.hostco.ru/types}DeptCodeType"/&gt;
 *         &lt;element name="newRoomNumber"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeCabinetRequest", propOrder = {
    "newDeptCode",
    "newRoomNumber"
})
public class ChangeCabinetRequest
    extends ScheduleElementType
{

    @XmlElement(required = true)
    protected String newDeptCode;
    @XmlElement(required = true)
    protected String newRoomNumber;

    /**
     * Gets the value of the newDeptCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewDeptCode() {
        return newDeptCode;
    }

    /**
     * Sets the value of the newDeptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewDeptCode(String value) {
        this.newDeptCode = value;
    }

    /**
     * Gets the value of the newRoomNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewRoomNumber() {
        return newRoomNumber;
    }

    /**
     * Sets the value of the newRoomNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewRoomNumber(String value) {
        this.newRoomNumber = value;
    }

}
