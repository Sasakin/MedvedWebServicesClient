
package ru.hostco.types;

import javax.xml.bind.annotation.*;


/**
 * ���������� �� ��������� ���
 * 
 * <p>Java class for DepartmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepartmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deptCode" type="{http://www.hostco.ru/types}DeptCodeType"/&gt;
 *         &lt;element name="deptName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="250"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="deptShortName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="deptType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="deptAddress" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="deptPhone" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="deptNotes" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="200"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="deleted" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="positions" type="{http://www.hostco.ru/types}PositionDeptType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepartmentType", propOrder = {
    "deptCode",
    "deptName",
    "deptShortName",
    "deptType",
    "deptAddress",
    "deptPhone",
    "deptNotes",
    "deleted",
    "positions"
})
@XmlSeeAlso({
    ExtendedDepartmentType.class
})
public class DepartmentType {

    @XmlElement(required = true)
    protected String deptCode;
    @XmlElement(required = true)
    protected String deptName;
    protected String deptShortName;
    protected int deptType;
    protected String deptAddress;
    protected String deptPhone;
    protected String deptNotes;
    protected boolean deleted;
    protected PositionDeptType positions;

    /**
     * Gets the value of the deptCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * Sets the value of the deptCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptCode(String value) {
        this.deptCode = value;
    }

    /**
     * Gets the value of the deptName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * Sets the value of the deptName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptName(String value) {
        this.deptName = value;
    }

    /**
     * Gets the value of the deptShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptShortName() {
        return deptShortName;
    }

    /**
     * Sets the value of the deptShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptShortName(String value) {
        this.deptShortName = value;
    }

    /**
     * Gets the value of the deptType property.
     * 
     */
    public int getDeptType() {
        return deptType;
    }

    /**
     * Sets the value of the deptType property.
     * 
     */
    public void setDeptType(int value) {
        this.deptType = value;
    }

    /**
     * Gets the value of the deptAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptAddress() {
        return deptAddress;
    }

    /**
     * Sets the value of the deptAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptAddress(String value) {
        this.deptAddress = value;
    }

    /**
     * Gets the value of the deptPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptPhone() {
        return deptPhone;
    }

    /**
     * Sets the value of the deptPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptPhone(String value) {
        this.deptPhone = value;
    }

    /**
     * Gets the value of the deptNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeptNotes() {
        return deptNotes;
    }

    /**
     * Sets the value of the deptNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeptNotes(String value) {
        this.deptNotes = value;
    }

    /**
     * Gets the value of the deleted property.
     * 
     */
    public boolean isDeleted() {
        return deleted;
    }

    /**
     * Sets the value of the deleted property.
     * 
     */
    public void setDeleted(boolean value) {
        this.deleted = value;
    }

    /**
     * Gets the value of the positions property.
     * 
     * @return
     *     possible object is
     *     {@link PositionDeptType }
     *     
     */
    public PositionDeptType getPositions() {
        return positions;
    }

    /**
     * Sets the value of the positions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionDeptType }
     *     
     */
    public void setPositions(PositionDeptType value) {
        this.positions = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepartmentType that = (DepartmentType) o;

        if (deptType != that.deptType) return false;
        if (deleted != that.deleted) return false;
        if (!deptCode.equals(that.deptCode)) return false;
        if (!deptName.equals(that.deptName)) return false;
        if (deptShortName != null ? !deptShortName.equals(that.deptShortName) : that.deptShortName != null)
            return false;
        if (deptAddress != null ? !deptAddress.equals(that.deptAddress) : that.deptAddress != null) return false;
        if (deptPhone != null ? !deptPhone.equals(that.deptPhone) : that.deptPhone != null) return false;
        if (deptNotes != null ? !deptNotes.equals(that.deptNotes) : that.deptNotes != null) return false;
        return positions != null ? positions.equals(that.positions) : that.positions == null;
    }

    @Override
    public int hashCode() {
        int result = deptCode.hashCode();
        result = 31 * result + deptName.hashCode();
        result = 31 * result + (deptShortName != null ? deptShortName.hashCode() : 0);
        result = 31 * result + deptType;
        result = 31 * result + (deptAddress != null ? deptAddress.hashCode() : 0);
        result = 31 * result + (deptPhone != null ? deptPhone.hashCode() : 0);
        result = 31 * result + (deptNotes != null ? deptNotes.hashCode() : 0);
        result = 31 * result + (deleted ? 1 : 0);
        result = 31 * result + (positions != null ? positions.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DepartmentType{" +
                "deptCode='" + deptCode + '\'' +
                ", deptName='" + deptName + '\'' +
                ", deptShortName='" + deptShortName + '\'' +
                ", deptType=" + deptType +
                ", deptAddress='" + deptAddress + '\'' +
                ", deptPhone='" + deptPhone + '\'' +
                ", deptNotes='" + deptNotes + '\'' +
                ", deleted=" + deleted +
                ", positions=" + positions +
                '}';
    }
}
