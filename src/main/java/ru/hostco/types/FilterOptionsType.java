
package ru.hostco.types;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * ����� �������� ��������� ������ �������� ����������, ��� ����������
 *       
 * 
 * <p>Java class for FilterOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterOptionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="scheduleDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="muCode" type="{http://www.hostco.ru/types}MuCodeType"/&gt;
 *         &lt;element name="deptCode" type="{http://www.hostco.ru/types}DeptCodeType" minOccurs="0"/&gt;
 *         &lt;element name="roomNumber" type="{http://www.hostco.ru/types}RoomNumberType" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="docCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="specCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *             &lt;element name="positionCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *             &lt;element name="scheduleInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="docFIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="docSNILS" type="{http://www.hostco.ru/types}SNILSType" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="actionCode" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="needFIO" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterOptionsType", propOrder = {
    "scheduleDate",
    "muCode",
    "deptCode",
    "roomNumber",
    "docCode",
    "specCode",
    "positionCode",
    "scheduleInfo",
    "docFIO",
    "docSNILS",
    "actionCode",
    "needFIO"
})
@XmlSeeAlso({
    ScheduleElementType.class
})
public class FilterOptionsType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar scheduleDate;
    @XmlElement(required = true)
    protected String muCode;
    protected String deptCode;
    protected String roomNumber;
    protected String docCode;
    protected Long specCode;
    protected Integer positionCode;
    protected String scheduleInfo;
    protected String docFIO;
    protected String docSNILS;
    protected Long actionCode;
    protected Boolean needFIO;

    /**
     * Gets the value of the scheduleDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduleDate() {
        return scheduleDate;
    }

    /**
     * Sets the value of the scheduleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduleDate(XMLGregorianCalendar value) {
        this.scheduleDate = value;
    }

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
     * Gets the value of the roomNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * Sets the value of the roomNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomNumber(String value) {
        this.roomNumber = value;
    }

    /**
     * Gets the value of the docCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocCode() {
        return docCode;
    }

    /**
     * Sets the value of the docCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocCode(String value) {
        this.docCode = value;
    }

    /**
     * Gets the value of the specCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSpecCode() {
        return specCode;
    }

    /**
     * Sets the value of the specCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSpecCode(Long value) {
        this.specCode = value;
    }

    /**
     * Gets the value of the positionCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPositionCode() {
        return positionCode;
    }

    /**
     * Sets the value of the positionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPositionCode(Integer value) {
        this.positionCode = value;
    }

    /**
     * Gets the value of the scheduleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleInfo() {
        return scheduleInfo;
    }

    /**
     * Sets the value of the scheduleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleInfo(String value) {
        this.scheduleInfo = value;
    }

    /**
     * Gets the value of the docFIO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocFIO() {
        return docFIO;
    }

    /**
     * Sets the value of the docFIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocFIO(String value) {
        this.docFIO = value;
    }

    /**
     * Gets the value of the docSNILS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocSNILS() {
        return docSNILS;
    }

    /**
     * Sets the value of the docSNILS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocSNILS(String value) {
        this.docSNILS = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setActionCode(Long value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the needFIO property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNeedFIO() {
        return needFIO;
    }

    /**
     * Sets the value of the needFIO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNeedFIO(Boolean value) {
        this.needFIO = value;
    }

}
