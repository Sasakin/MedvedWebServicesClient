
package ru.hostco.portal.types;

import ru.hostco.types.DateSlotList;
import ru.hostco.types.PortalServiceResponseType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ����� ������ ������ �� ����� �� ������
 * 
 * <p>Java class for SlotListByPeriodResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SlotListByPeriodResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="VisitDateList" type="{http://www.hostco.ru/types}DateSlotList"/&gt;
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
@XmlType(name = "SlotListByPeriodResponse", propOrder = {
    "visitDateList",
    "portalServiceResponse"
})
public class SlotListByPeriodResponse {

    @XmlElement(name = "VisitDateList")
    protected DateSlotList visitDateList;
    @XmlElement(namespace = "http://www.hostco.ru/types")
    protected PortalServiceResponseType portalServiceResponse;

    /**
     * Gets the value of the visitDateList property.
     * 
     * @return
     *     possible object is
     *     {@link DateSlotList }
     *     
     */
    public DateSlotList getVisitDateList() {
        return visitDateList;
    }

    /**
     * Sets the value of the visitDateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateSlotList }
     *     
     */
    public void setVisitDateList(DateSlotList value) {
        this.visitDateList = value;
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

}
