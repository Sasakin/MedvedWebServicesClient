
package ru.hostco.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Cлот с пациентом
 * 
 * <p>Java class for SlotInfoPatient complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SlotInfoPatient"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.hostco.ru/types}SlotInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="patientInfo" type="{http://www.hostco.ru/types}PatientInfoType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SlotInfoPatient", propOrder = {
    "patientInfo"
})
public class SlotInfoPatient
    extends SlotInfo
{

    protected PatientInfoType patientInfo;

    /**
     * Gets the value of the patientInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PatientInfoType }
     *     
     */
    public PatientInfoType getPatientInfo() {
        return patientInfo;
    }

    /**
     * Sets the value of the patientInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PatientInfoType }
     *     
     */
    public void setPatientInfo(PatientInfoType value) {
        this.patientInfo = value;
    }

}
