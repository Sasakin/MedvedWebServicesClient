
package ru.hostco.portal.types;

import ru.hostco.types.StaffInfoType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ������ �� ���������� ������ ����������� ���������� � ��
 *         ��������������
 *       
 * 
 * <p>Java class for UpdateStaffInfoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateStaffInfoRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.hostco.ru/types}StaffInfoType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="muCode" type="{http://www.hostco.ru/types}MuCodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateStaffInfoRequest", propOrder = {
    "muCode"
})
public class UpdateStaffInfoRequest
    extends StaffInfoType
{

    @XmlElement(required = true)
    protected String muCode;

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

}
