
package ru.hostco.types;

import ru.hostco.portal.types.ChangeCabinetRequest;
import ru.hostco.portal.types.UpdateScheduleRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * ����� �������� ��������� ������ �������� ����������, ���
 *         ��������/�������� ����������
 *       
 * 
 * <p>Java class for ScheduleElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.hostco.ru/types}FilterOptionsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="scheduleDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="muCode" type="{http://www.hostco.ru/types}MuCodeType"/&gt;
 *         &lt;element name="deptCode" type="{http://www.hostco.ru/types}DeptCodeType"/&gt;
 *         &lt;element name="roomNumber" type="{http://www.hostco.ru/types}RoomNumberType"/&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="docCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *             &lt;element name="specCode" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *             &lt;element name="positionCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *             &lt;element name="scheduleInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="docFIO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *             &lt;element name="docSNILS" type="{http://www.hostco.ru/types}SNILSType" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="actionCode" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleElementType")
@XmlSeeAlso({
    UpdateScheduleRequest.class,
    ru.hostco.portal.types.ScheduleInfoResponse.ScheduleInfo.Schedule.class,
    ChangeCabinetRequest.class
})
public class ScheduleElementType
    extends FilterOptionsType
{


}
