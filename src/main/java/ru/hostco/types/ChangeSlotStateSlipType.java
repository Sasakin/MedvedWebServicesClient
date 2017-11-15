
package ru.hostco.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Запрос на изменение состояния слота, с обязательным номером талона
 *       
 * 
 * <p>Java class for ChangeSlotStateSlipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeSlotStateSlipType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.hostco.ru/types}ChangeSlotStateType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="slotInfo" type="{http://www.hostco.ru/types}SlotInfoPatient"/&gt;
 *         &lt;element name="status" type="{http://www.hostco.ru/types}AppointmentStatusType"/&gt;
 *         &lt;element name="slipNumber" type="{http://www.hostco.ru/types}SlipNumberType"/&gt;
 *         &lt;element name="appointmentSource" type="{http://www.hostco.ru/types}AppointmentSourceType"/&gt;
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeSlotStateSlipType")
public class ChangeSlotStateSlipType
    extends ChangeSlotStateType
{


}
