
package ru.hostco.portal.types;

import ru.hostco.types.PeriodType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ������ ������ �� ����� �� ������
 * 
 * <p>Java class for SlotListByPeriodRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SlotListByPeriodRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="muCode" type="{http://www.hostco.ru/types}MuCodeType"/&gt;
 *         &lt;element name="depCode" type="{http://www.hostco.ru/types}DeptCodeType"/&gt;
 *         &lt;element name="snils" type="{http://www.hostco.ru/types}SNILSType"/&gt;
 *         &lt;element name="profCode" type="{http://www.hostco.ru/types}ProfCodeType"/&gt;
 *         &lt;element name="positionCode" type="{http://www.hostco.ru/types}PosCodeType"/&gt;
 *         &lt;element name="period" type="{http://www.hostco.ru/types}PeriodType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SlotListByPeriodRequest", propOrder = {
    "muCode",
    "depCode",
    "snils",
    "profCode",
    "positionCode",
    "period"
})
public class SlotListByPeriodRequest {

    @XmlElement(required = true)
    protected String muCode;
    @XmlElement(required = true)
    protected String depCode;
    @XmlElement(required = true)
    protected String snils;
    @XmlElement(required = true)
    protected String profCode;
    protected long positionCode;
    @XmlElement(required = true)
    protected PeriodType period;

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
     * Gets the value of the depCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepCode() {
        return depCode;
    }

    /**
     * Sets the value of the depCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepCode(String value) {
        this.depCode = value;
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
     * Gets the value of the profCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfCode() {
        return profCode;
    }

    /**
     * Sets the value of the profCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfCode(String value) {
        this.profCode = value;
    }

    /**
     * Gets the value of the positionCode property.
     * 
     */
    public long getPositionCode() {
        return positionCode;
    }

    /**
     * Sets the value of the positionCode property.
     * 
     */
    public void setPositionCode(long value) {
        this.positionCode = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link PeriodType }
     *     
     */
    public PeriodType getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeriodType }
     *     
     */
    public void setPeriod(PeriodType value) {
        this.period = value;
    }

}
