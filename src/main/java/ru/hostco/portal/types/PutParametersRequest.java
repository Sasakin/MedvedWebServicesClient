
package ru.hostco.portal.types;

import ru.hostco.types.ParamListElement;
import ru.hostco.types.PatientInfoType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * ������ �� ��������� ���������� ��������
 * 
 * <p>Java class for putParametersRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="putParametersRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="muCode" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="patientInfo" type="{http://www.hostco.ru/types}PatientInfoType"/&gt;
 *         &lt;sequence maxOccurs="unbounded"&gt;
 *           &lt;element name="parameters" type="{http://www.hostco.ru/types}ParamListElement"/&gt;
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
@XmlType(name = "putParametersRequest", propOrder = {
    "muCode",
    "patientInfo",
    "parameters"
})
public class PutParametersRequest {

    @XmlElement(required = true)
    protected Object muCode;
    @XmlElement(required = true)
    protected PatientInfoType patientInfo;
    @XmlElement(required = true)
    protected List<ParamListElement> parameters;

    /**
     * Gets the value of the muCode property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMuCode() {
        return muCode;
    }

    /**
     * Sets the value of the muCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMuCode(Object value) {
        this.muCode = value;
    }

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

    /**
     * Gets the value of the parameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParamListElement }
     * 
     * 
     */
    public List<ParamListElement> getParameters() {
        if (parameters == null) {
            parameters = new ArrayList<ParamListElement>();
        }
        return this.parameters;
    }

}
