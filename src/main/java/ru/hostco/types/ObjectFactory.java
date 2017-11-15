
package ru.hostco.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.hostco.types package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PortalServiceResponse_QNAME = new QName("http://www.hostco.ru/types", "portalServiceResponse");
    private final static QName _SlotInfoDistrictsElement_QNAME = new QName("http://www.hostco.ru/types", "slotInfoDistrictsElement");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.hostco.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PortalServiceResponseType }
     * 
     */
    public PortalServiceResponseType createPortalServiceResponseType() {
        return new PortalServiceResponseType();
    }

    /**
     * Create an instance of {@link PortalServiceResponseType.ErrorList }
     * 
     */
    public PortalServiceResponseType.ErrorList createPortalServiceResponseTypeErrorList() {
        return new PortalServiceResponseType.ErrorList();
    }

    /**
     * Create an instance of {@link SlotListElementDistrict }
     * 
     */
    public SlotListElementDistrict createSlotListElementDistrict() {
        return new SlotListElementDistrict();
    }

    /**
     * Create an instance of {@link FilterOptionsType }
     * 
     */
    public FilterOptionsType createFilterOptionsType() {
        return new FilterOptionsType();
    }

    /**
     * Create an instance of {@link ScheduleElementType }
     * 
     */
    public ScheduleElementType createScheduleElementType() {
        return new ScheduleElementType();
    }

    /**
     * Create an instance of {@link AppointmentType }
     * 
     */
    public AppointmentType createAppointmentType() {
        return new AppointmentType();
    }

    /**
     * Create an instance of {@link PeriodType }
     * 
     */
    public PeriodType createPeriodType() {
        return new PeriodType();
    }

    /**
     * Create an instance of {@link TimeIntervalType }
     * 
     */
    public TimeIntervalType createTimeIntervalType() {
        return new TimeIntervalType();
    }

    /**
     * Create an instance of {@link DepartmentType }
     * 
     */
    public DepartmentType createDepartmentType() {
        return new DepartmentType();
    }

    /**
     * Create an instance of {@link ExtendedDepartmentType }
     * 
     */
    public ExtendedDepartmentType createExtendedDepartmentType() {
        return new ExtendedDepartmentType();
    }

    /**
     * Create an instance of {@link RoomType }
     * 
     */
    public RoomType createRoomType() {
        return new RoomType();
    }

    /**
     * Create an instance of {@link PatientInfoType }
     * 
     */
    public PatientInfoType createPatientInfoType() {
        return new PatientInfoType();
    }

    /**
     * Create an instance of {@link StaffInfoType }
     * 
     */
    public StaffInfoType createStaffInfoType() {
        return new StaffInfoType();
    }

    /**
     * Create an instance of {@link StaffIdType }
     * 
     */
    public StaffIdType createStaffIdType() {
        return new StaffIdType();
    }

    /**
     * Create an instance of {@link MuInfoType }
     * 
     */
    public MuInfoType createMuInfoType() {
        return new MuInfoType();
    }

    /**
     * Create an instance of {@link WeekScheduleType }
     * 
     */
    public WeekScheduleType createWeekScheduleType() {
        return new WeekScheduleType();
    }

    /**
     * Create an instance of {@link SlotInfo }
     * 
     */
    public SlotInfo createSlotInfo() {
        return new SlotInfo();
    }

    /**
     * Create an instance of {@link SlotInfoGUID }
     * 
     */
    public SlotInfoGUID createSlotInfoGUID() {
        return new SlotInfoGUID();
    }

    /**
     * Create an instance of {@link SlotInfoPatient }
     * 
     */
    public SlotInfoPatient createSlotInfoPatient() {
        return new SlotInfoPatient();
    }

    /**
     * Create an instance of {@link SlotListElement }
     * 
     */
    public SlotListElement createSlotListElement() {
        return new SlotListElement();
    }

    /**
     * Create an instance of {@link ParamListElement }
     * 
     */
    public ParamListElement createParamListElement() {
        return new ParamListElement();
    }

    /**
     * Create an instance of {@link SlotListResponseType }
     * 
     */
    public SlotListResponseType createSlotListResponseType() {
        return new SlotListResponseType();
    }

    /**
     * Create an instance of {@link ChangeSlotStateType }
     * 
     */
    public ChangeSlotStateType createChangeSlotStateType() {
        return new ChangeSlotStateType();
    }

    /**
     * Create an instance of {@link ChangeSlotStateSlipType }
     * 
     */
    public ChangeSlotStateSlipType createChangeSlotStateSlipType() {
        return new ChangeSlotStateSlipType();
    }

    /**
     * Create an instance of {@link DistrictAddressType }
     * 
     */
    public DistrictAddressType createDistrictAddressType() {
        return new DistrictAddressType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link SickLeaveElementType }
     * 
     */
    public SickLeaveElementType createSickLeaveElementType() {
        return new SickLeaveElementType();
    }

    /**
     * Create an instance of {@link SpecialistType }
     * 
     */
    public SpecialistType createSpecialistType() {
        return new SpecialistType();
    }

    /**
     * Create an instance of {@link PositionType }
     * 
     */
    public PositionType createPositionType() {
        return new PositionType();
    }

    /**
     * Create an instance of {@link DeptSpecialistType }
     * 
     */
    public DeptSpecialistType createDeptSpecialistType() {
        return new DeptSpecialistType();
    }

    /**
     * Create an instance of {@link PositionDeptType }
     * 
     */
    public PositionDeptType createPositionDeptType() {
        return new PositionDeptType();
    }

    /**
     * Create an instance of {@link DateSlot }
     * 
     */
    public DateSlot createDateSlot() {
        return new DateSlot();
    }

    /**
     * Create an instance of {@link DateSlotList }
     * 
     */
    public DateSlotList createDateSlotList() {
        return new DateSlotList();
    }

    /**
     * Create an instance of {@link SlotListElements }
     * 
     */
    public SlotListElements createSlotListElements() {
        return new SlotListElements();
    }

    /**
     * Create an instance of {@link ExtendedSlotInfoGUID }
     * 
     */
    public ExtendedSlotInfoGUID createExtendedSlotInfoGUID() {
        return new ExtendedSlotInfoGUID();
    }

    /**
     * Create an instance of {@link AppointmentSlotElement }
     * 
     */
    public AppointmentSlotElement createAppointmentSlotElement() {
        return new AppointmentSlotElement();
    }

    /**
     * Create an instance of {@link CallDoctorRequest }
     * 
     */
    public CallDoctorRequest createCallDoctorRequest() {
        return new CallDoctorRequest();
    }

    /**
     * Create an instance of {@link CallDoctorResponse }
     * 
     */
    public CallDoctorResponse createCallDoctorResponse() {
        return new CallDoctorResponse();
    }

    /**
     * Create an instance of {@link CancelCallDoctorRequest }
     * 
     */
    public CancelCallDoctorRequest createCancelCallDoctorRequest() {
        return new CancelCallDoctorRequest();
    }

    /**
     * Create an instance of {@link CancelCallDoctorResponse }
     * 
     */
    public CancelCallDoctorResponse createCancelCallDoctorResponse() {
        return new CancelCallDoctorResponse();
    }

    /**
     * Create an instance of {@link SlotInfoDistricts }
     * 
     */
    public SlotInfoDistricts createSlotInfoDistricts() {
        return new SlotInfoDistricts();
    }

    /**
     * Create an instance of {@link DistrictRequestItem }
     * 
     */
    public DistrictRequestItem createDistrictRequestItem() {
        return new DistrictRequestItem();
    }

    /**
     * Create an instance of {@link PortalServiceResponseType.ErrorList.RecordError }
     * 
     */
    public PortalServiceResponseType.ErrorList.RecordError createPortalServiceResponseTypeErrorListRecordError() {
        return new PortalServiceResponseType.ErrorList.RecordError();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortalServiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/types", name = "portalServiceResponse")
    public JAXBElement<PortalServiceResponseType> createPortalServiceResponse(PortalServiceResponseType value) {
        return new JAXBElement<PortalServiceResponseType>(_PortalServiceResponse_QNAME, PortalServiceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlotListElementDistrict }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/types", name = "slotInfoDistrictsElement")
    public JAXBElement<SlotListElementDistrict> createSlotInfoDistrictsElement(SlotListElementDistrict value) {
        return new JAXBElement<SlotListElementDistrict>(_SlotInfoDistrictsElement_QNAME, SlotListElementDistrict.class, null, value);
    }

}
