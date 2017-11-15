
package ru.hostco.portal.types;

import ru.hostco.types.CancelCallDoctorRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * ������ � ���������� ������ �� ������ ������ ����� �� ���
 * 
 * <p>Java class for CancelCallDoctorPortalRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancelCallDoctorPortalRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.hostco.ru/types}CancelCallDoctorRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cancelCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancelCallDoctorPortalRequest", propOrder = {
    "cancelCode"
})
public class CancelCallDoctorPortalRequest
    extends CancelCallDoctorRequest
{

    protected int cancelCode;

    /**
     * Gets the value of the cancelCode property.
     * 
     */
    public int getCancelCode() {
        return cancelCode;
    }

    /**
     * Sets the value of the cancelCode property.
     * 
     */
    public void setCancelCode(int value) {
        this.cancelCode = value;
    }

}
