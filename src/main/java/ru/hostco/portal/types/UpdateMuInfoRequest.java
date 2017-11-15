
package ru.hostco.portal.types;

import ru.hostco.types.DepartmentType;
import ru.hostco.types.WeekScheduleType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * ������ �� ���������� ���������� �� ���
 * 
 * <p>Java class for UpdateMuInfoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateMuInfoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.hostco.ru/types}WeekScheduleType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="muCode" type="{http://www.hostco.ru/types}MuCodeType"/&gt;
 *         &lt;sequence maxOccurs="unbounded"&gt;
 *           &lt;element name="department" type="{http://www.hostco.ru/types}DepartmentType"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="extended_info" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1512"/&gt;
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
@XmlType(name = "UpdateMuInfoRequest", propOrder = {
    "muCode",
    "department",
    "extendedInfo"
})
public class UpdateMuInfoRequest
    extends WeekScheduleType
{

    @XmlElement(required = true)
    protected String muCode;
    @XmlElement(required = true)
    protected List<DepartmentType> department;
    @XmlElement(name = "extended_info")
    protected String extendedInfo;

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
     * Gets the value of the department property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the department property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DepartmentType }
     * 
     * 
     */
    public List<DepartmentType> getDepartment() {
        if (department == null) {
            department = new ArrayList<DepartmentType>();
        }
        return this.department;
    }

    /**
     * Sets the value of the department property.
     *
     * @param department
     *     allowed object is
     *     {@link List<DepartmentType> }
     *
     */
    public void setDepartment(List<DepartmentType> department) {
        this.department = department;
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

    @Override
    public String toString() {
        return "UpdateMuInfoRequest{" +
                "muCode='" + muCode + '\'' +
                ", department=" + department +
                ", extendedInfo='" + extendedInfo + '\'' +
                '}';
    }
}
