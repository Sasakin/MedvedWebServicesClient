
package ru.hostco.portal.types;

import ru.hostco.types.ExtendedDepartmentType;
import ru.hostco.types.MuInfoType;
import ru.hostco.types.PortalServiceResponseType;
import ru.hostco.types.StaffInfoType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * ����� �� ������ �� ��������� ���������� �� ���
 * 
 * <p>Java class for getMuInfoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getMuInfoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="muInfo"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.hostco.ru/types}MuInfoType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="department" type="{http://www.hostco.ru/types}ExtendedDepartmentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="staff" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.hostco.ru/types}StaffInfoType"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.hostco.ru/types}portalServiceResponse"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMuInfoResponse", propOrder = {
    "muInfo",
    "portalServiceResponse"
})
public class GetMuInfoResponse {

    protected GetMuInfoResponse.MuInfo muInfo;
    @XmlElement(namespace = "http://www.hostco.ru/types")
    protected PortalServiceResponseType portalServiceResponse;

    /**
     * Gets the value of the muInfo property.
     * 
     * @return
     *     possible object is
     *     {@link GetMuInfoResponse.MuInfo }
     *     
     */
    public GetMuInfoResponse.MuInfo getMuInfo() {
        return muInfo;
    }

    /**
     * Sets the value of the muInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMuInfoResponse.MuInfo }
     *     
     */
    public void setMuInfo(GetMuInfoResponse.MuInfo value) {
        this.muInfo = value;
    }

    /**
     * Gets the value of the portalServiceResponse property.
     * 
     * @return
     *     possible object is
     *     {@link PortalServiceResponseType }
     *     
     */
    public PortalServiceResponseType getPortalServiceResponse() {
        return portalServiceResponse;
    }

    /**
     * Sets the value of the portalServiceResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortalServiceResponseType }
     *     
     */
    public void setPortalServiceResponse(PortalServiceResponseType value) {
        this.portalServiceResponse = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.hostco.ru/types}MuInfoType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="department" type="{http://www.hostco.ru/types}ExtendedDepartmentType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="staff" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.hostco.ru/types}StaffInfoType"&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "department",
        "staff"
    })
    public static class MuInfo
        extends MuInfoType
    {

        protected List<ExtendedDepartmentType> department;
        protected List<GetMuInfoResponse.MuInfo.Staff> staff;

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
         * {@link ExtendedDepartmentType }
         * 
         * 
         */
        public List<ExtendedDepartmentType> getDepartment() {
            if (department == null) {
                department = new ArrayList<ExtendedDepartmentType>();
            }
            return this.department;
        }

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
         * {@link GetMuInfoResponse.MuInfo.Staff }
         * 
         * 
         */
        public List<GetMuInfoResponse.MuInfo.Staff> getStaff() {
            if (staff == null) {
                staff = new ArrayList<GetMuInfoResponse.MuInfo.Staff>();
            }
            return this.staff;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.hostco.ru/types}StaffInfoType"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Staff
            extends StaffInfoType
        {


        }

    }

}
