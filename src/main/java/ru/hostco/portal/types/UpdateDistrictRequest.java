
package ru.hostco.portal.types;

import ru.hostco.types.DistrictAddressType;
import ru.hostco.types.StaffIdType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * ������ �� ���������� �������
 * 
 * <p>Java class for UpdateDistrictRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateDistrictRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="muCode" type="{http://www.hostco.ru/types}MuCodeType"/&gt;
 *         &lt;element name="districtType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="districtNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AddressList"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded"&gt;
 *                   &lt;element name="DistrictAddress" type="{http://www.hostco.ru/types}DistrictAddressType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AddressExceptionsList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded"&gt;
 *                   &lt;element name="DistrictAddressException" type="{http://www.hostco.ru/types}DistrictAddressType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StaffList"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="unbounded"&gt;
 *                   &lt;element name="Staff" type="{http://www.hostco.ru/types}StaffIdType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateDistrictRequest", propOrder = {
    "muCode",
    "districtType",
    "districtNumber",
    "addressList",
    "addressExceptionsList",
    "staffList"
})
public class UpdateDistrictRequest {

    @XmlElement(required = true)
    protected String muCode;
    protected int districtType;
    @XmlElement(required = true)
    protected String districtNumber;
    @XmlElement(name = "AddressList", required = true)
    protected UpdateDistrictRequest.AddressList addressList;
    @XmlElement(name = "AddressExceptionsList")
    protected UpdateDistrictRequest.AddressExceptionsList addressExceptionsList;
    @XmlElement(name = "StaffList", required = true)
    protected UpdateDistrictRequest.StaffList staffList;

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
     * Gets the value of the districtType property.
     * 
     */
    public int getDistrictType() {
        return districtType;
    }

    /**
     * Sets the value of the districtType property.
     * 
     */
    public void setDistrictType(int value) {
        this.districtType = value;
    }

    /**
     * Gets the value of the districtNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictNumber() {
        return districtNumber;
    }

    /**
     * Sets the value of the districtNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictNumber(String value) {
        this.districtNumber = value;
    }

    /**
     * Gets the value of the addressList property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateDistrictRequest.AddressList }
     *     
     */
    public UpdateDistrictRequest.AddressList getAddressList() {
        return addressList;
    }

    /**
     * Sets the value of the addressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateDistrictRequest.AddressList }
     *     
     */
    public void setAddressList(UpdateDistrictRequest.AddressList value) {
        this.addressList = value;
    }

    /**
     * Gets the value of the addressExceptionsList property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateDistrictRequest.AddressExceptionsList }
     *     
     */
    public UpdateDistrictRequest.AddressExceptionsList getAddressExceptionsList() {
        return addressExceptionsList;
    }

    /**
     * Sets the value of the addressExceptionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateDistrictRequest.AddressExceptionsList }
     *     
     */
    public void setAddressExceptionsList(UpdateDistrictRequest.AddressExceptionsList value) {
        this.addressExceptionsList = value;
    }

    /**
     * Gets the value of the staffList property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateDistrictRequest.StaffList }
     *     
     */
    public UpdateDistrictRequest.StaffList getStaffList() {
        return staffList;
    }

    /**
     * Sets the value of the staffList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateDistrictRequest.StaffList }
     *     
     */
    public void setStaffList(UpdateDistrictRequest.StaffList value) {
        this.staffList = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence maxOccurs="unbounded"&gt;
     *         &lt;element name="DistrictAddressException" type="{http://www.hostco.ru/types}DistrictAddressType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "districtAddressException"
    })
    public static class AddressExceptionsList {

        @XmlElement(name = "DistrictAddressException")
        protected List<DistrictAddressType> districtAddressException;

        /**
         * Gets the value of the districtAddressException property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the districtAddressException property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDistrictAddressException().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DistrictAddressType }
         * 
         * 
         */
        public List<DistrictAddressType> getDistrictAddressException() {
            if (districtAddressException == null) {
                districtAddressException = new ArrayList<DistrictAddressType>();
            }
            return this.districtAddressException;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence maxOccurs="unbounded"&gt;
     *         &lt;element name="DistrictAddress" type="{http://www.hostco.ru/types}DistrictAddressType"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "districtAddress"
    })
    public static class AddressList {

        @XmlElement(name = "DistrictAddress", required = true)
        protected List<DistrictAddressType> districtAddress;

        /**
         * Gets the value of the districtAddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the districtAddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDistrictAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DistrictAddressType }
         * 
         * 
         */
        public List<DistrictAddressType> getDistrictAddress() {
            if (districtAddress == null) {
                districtAddress = new ArrayList<DistrictAddressType>();
            }
            return this.districtAddress;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence maxOccurs="unbounded"&gt;
     *         &lt;element name="Staff" type="{http://www.hostco.ru/types}StaffIdType"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "staff"
    })
    public static class StaffList {

        @XmlElement(name = "Staff", required = true)
        protected List<StaffIdType> staff;

        /**
         * Gets the value of the staff property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the staff property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStaff().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StaffIdType }
         * 
         * 
         */
        public List<StaffIdType> getStaff() {
            if (staff == null) {
                staff = new ArrayList<StaffIdType>();
            }
            return this.staff;
        }

    }

}
