
package ru.hostco.portal.types;

import ru.hostco.types.PortalServiceResponseType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * ����� �� ������ ������ ������� �� ������
 * 
 * <p>Java class for FindDistrictResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FindDistrictResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="district" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="muCode" type="{http://www.hostco.ru/types}MuCodeType"/&gt;
 *                   &lt;element name="muTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="districtNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="districtTypeId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *                   &lt;element name="districtType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="doctor" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="fio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="snils" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="specCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="positionCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
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
@XmlType(name = "FindDistrictResponse", propOrder = {
    "district",
    "portalServiceResponse"
})
public class FindDistrictResponse {

    protected List<FindDistrictResponse.District> district;
    @XmlElement(namespace = "http://www.hostco.ru/types")
    protected PortalServiceResponseType portalServiceResponse;

    /**
     * Gets the value of the district property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the district property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistrict().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FindDistrictResponse.District }
     * 
     * 
     */
    public List<FindDistrictResponse.District> getDistrict() {
        if (district == null) {
            district = new ArrayList<FindDistrictResponse.District>();
        }
        return this.district;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="muCode" type="{http://www.hostco.ru/types}MuCodeType"/&gt;
     *         &lt;element name="muTitle" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="districtNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="districtTypeId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
     *         &lt;element name="districtType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="doctor" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="fio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="snils" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="specCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="positionCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
    @XmlType(name = "", propOrder = {
        "muCode",
        "muTitle",
        "districtNumber",
        "districtTypeId",
        "districtType",
        "doctor"
    })
    public static class District {

        @XmlElement(required = true)
        protected String muCode;
        @XmlElement(required = true)
        protected String muTitle;
        @XmlElement(required = true)
        protected String districtNumber;
        protected long districtTypeId;
        @XmlElement(required = true)
        protected String districtType;
        protected List<FindDistrictResponse.District.Doctor> doctor;

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
         * Gets the value of the muTitle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMuTitle() {
            return muTitle;
        }

        /**
         * Sets the value of the muTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMuTitle(String value) {
            this.muTitle = value;
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
         * Gets the value of the districtTypeId property.
         * 
         */
        public long getDistrictTypeId() {
            return districtTypeId;
        }

        /**
         * Sets the value of the districtTypeId property.
         * 
         */
        public void setDistrictTypeId(long value) {
            this.districtTypeId = value;
        }

        /**
         * Gets the value of the districtType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistrictType() {
            return districtType;
        }

        /**
         * Sets the value of the districtType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistrictType(String value) {
            this.districtType = value;
        }

        /**
         * Gets the value of the doctor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the doctor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDoctor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FindDistrictResponse.District.Doctor }
         * 
         * 
         */
        public List<FindDistrictResponse.District.Doctor> getDoctor() {
            if (doctor == null) {
                doctor = new ArrayList<FindDistrictResponse.District.Doctor>();
            }
            return this.doctor;
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
         *       &lt;sequence&gt;
         *         &lt;element name="fio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="snils" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="specCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="positionCode" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
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
            "fio",
            "position",
            "snils",
            "specCode",
            "positionCode"
        })
        public static class Doctor {

            @XmlElement(required = true)
            protected String fio;
            protected String position;
            protected String snils;
            protected String specCode;
            protected Long positionCode;

            /**
             * Gets the value of the fio property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFio() {
                return fio;
            }

            /**
             * Sets the value of the fio property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFio(String value) {
                this.fio = value;
            }

            /**
             * Gets the value of the position property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPosition() {
                return position;
            }

            /**
             * Sets the value of the position property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPosition(String value) {
                this.position = value;
            }

            /**
             * Gets the value of the snils property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSnils() {
                return snils;
            }

            /**
             * Sets the value of the snils property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSnils(String value) {
                this.snils = value;
            }

            /**
             * Gets the value of the specCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSpecCode() {
                return specCode;
            }

            /**
             * Sets the value of the specCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSpecCode(String value) {
                this.specCode = value;
            }

            /**
             * Gets the value of the positionCode property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getPositionCode() {
                return positionCode;
            }

            /**
             * Sets the value of the positionCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setPositionCode(Long value) {
                this.positionCode = value;
            }

        }

    }

}
