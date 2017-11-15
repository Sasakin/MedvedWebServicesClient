
package ru.hostco.portal;

import ru.hostco.portal.types.*;
import ru.hostco.types.*;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.hostco.portal package. 
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

    private final static QName _UpdateScheduleRequest_QNAME = new QName("http://www.hostco.ru/portal", "updateScheduleRequest");
    private final static QName _UpdateScheduleResponse_QNAME = new QName("http://www.hostco.ru/portal", "updateScheduleResponse");
    private final static QName _DeleteScheduleRequest_QNAME = new QName("http://www.hostco.ru/portal", "deleteScheduleRequest");
    private final static QName _DeleteScheduleResponse_QNAME = new QName("http://www.hostco.ru/portal", "deleteScheduleResponse");
    private final static QName _ChangeSlotStateRequest_QNAME = new QName("http://www.hostco.ru/portal", "changeSlotStateRequest");
    private final static QName _ChangeSlotStateResponse_QNAME = new QName("http://www.hostco.ru/portal", "changeSlotStateResponse");
    private final static QName _ReadSlotStateRequest_QNAME = new QName("http://www.hostco.ru/portal", "readSlotStateRequest");
    private final static QName _ReadSlotStateResponse_QNAME = new QName("http://www.hostco.ru/portal", "readSlotStateResponse");
    private final static QName _ReadFilteredSlotsStateRequest_QNAME = new QName("http://www.hostco.ru/portal", "readFilteredSlotsStateRequest");
    private final static QName _ReadFilteredSlotsStateResponse_QNAME = new QName("http://www.hostco.ru/portal", "readFilteredSlotsStateResponse");
    private final static QName _UpdateMuInfoRequest_QNAME = new QName("http://www.hostco.ru/portal", "updateMuInfoRequest");
    private final static QName _UpdateMuInfoResponse_QNAME = new QName("http://www.hostco.ru/portal", "updateMuInfoResponse");
    private final static QName _UpdateCabinetInfoRequest_QNAME = new QName("http://www.hostco.ru/portal", "updateCabinetInfoRequest");
    private final static QName _UpdateCabinetInfoResponse_QNAME = new QName("http://www.hostco.ru/portal", "updateCabinetInfoResponse");
    private final static QName _ChangeCabinetRequest_QNAME = new QName("http://www.hostco.ru/portal", "changeCabinetRequest");
    private final static QName _ChangeCabinetResponse_QNAME = new QName("http://www.hostco.ru/portal", "changeCabinetResponse");
    private final static QName _UpdateDistrictRequest_QNAME = new QName("http://www.hostco.ru/portal", "updateDistrictRequest");
    private final static QName _UpdateDistrictResponse_QNAME = new QName("http://www.hostco.ru/portal", "updateDistrictResponse");
    private final static QName _UpdateStaffInfoRequest_QNAME = new QName("http://www.hostco.ru/portal", "updateStaffInfoRequest");
    private final static QName _UpdateStaffInfoResponse_QNAME = new QName("http://www.hostco.ru/portal", "updateStaffInfoResponse");
    private final static QName _UpdateServicePricesRequest_QNAME = new QName("http://www.hostco.ru/portal", "updateServicePricesRequest");
    private final static QName _UpdateServicePricesResponse_QNAME = new QName("http://www.hostco.ru/portal", "updateServicePricesResponse");
    private final static QName _UpdatePolicyInfoRequest_QNAME = new QName("http://www.hostco.ru/portal", "updatePolicyInfoRequest");
    private final static QName _UpdatePolicyInfoResponse_QNAME = new QName("http://www.hostco.ru/portal", "updatePolicyInfoResponse");
    private final static QName _PutParameterRequest_QNAME = new QName("http://www.hostco.ru/portal", "putParameterRequest");
    private final static QName _PutParameterResponse_QNAME = new QName("http://www.hostco.ru/portal", "putParameterResponse");
    private final static QName _GetMuInfoRequest_QNAME = new QName("http://www.hostco.ru/portal", "getMuInfoRequest");
    private final static QName _GetMuInfoResponse_QNAME = new QName("http://www.hostco.ru/portal", "getMuInfoResponse");
    private final static QName _GetScheduleInfoRequest_QNAME = new QName("http://www.hostco.ru/portal", "getScheduleInfoRequest");
    private final static QName _GetScheduleInfoResponse_QNAME = new QName("http://www.hostco.ru/portal", "getScheduleInfoResponse");
    private final static QName _UpdateSickLeavesRequest_QNAME = new QName("http://www.hostco.ru/portal", "updateSickLeavesRequest");
    private final static QName _UpdateSickLeavesResponse_QNAME = new QName("http://www.hostco.ru/portal", "updateSickLeavesResponse");
    private final static QName _DeleteSlotRequest_QNAME = new QName("http://www.hostco.ru/portal", "deleteSlotRequest");
    private final static QName _DeleteSlotResponse_QNAME = new QName("http://www.hostco.ru/portal", "deleteSlotResponse");
    private final static QName _GetAppointmentsBySNILSRequest_QNAME = new QName("http://www.hostco.ru/portal", "getAppointmentsBySNILSRequest");
    private final static QName _GetAppointmentsBySNILSResponse_QNAME = new QName("http://www.hostco.ru/portal", "getAppointmentsBySNILSResponse");
    private final static QName _GetSickLeaveListRequest_QNAME = new QName("http://www.hostco.ru/portal", "getSickLeaveListRequest");
    private final static QName _GetSickLeaveListResponse_QNAME = new QName("http://www.hostco.ru/portal", "getSickLeaveListResponse");
    private final static QName _GetActualSpecialistListRequest_QNAME = new QName("http://www.hostco.ru/portal", "getActualSpecialistListRequest");
    private final static QName _GetActualSpecialistListResponse_QNAME = new QName("http://www.hostco.ru/portal", "getActualSpecialistListResponse");
    private final static QName _GetSlotListByPeriodRequest_QNAME = new QName("http://www.hostco.ru/portal", "getSlotListByPeriodRequest");
    private final static QName _GetSlotListByPeriodResponse_QNAME = new QName("http://www.hostco.ru/portal", "getSlotListByPeriodResponse");
    private final static QName _FindDistrictRequest_QNAME = new QName("http://www.hostco.ru/portal", "findDistrictRequest");
    private final static QName _FindDistrictResponse_QNAME = new QName("http://www.hostco.ru/portal", "findDistrictResponse");
    private final static QName _CallDoctorRequest_QNAME = new QName("http://www.hostco.ru/portal", "callDoctorRequest");
    private final static QName _CallDoctorResponse_QNAME = new QName("http://www.hostco.ru/portal", "callDoctorResponse");
    private final static QName _CancelCallDoctorRequest_QNAME = new QName("http://www.hostco.ru/portal", "cancelCallDoctorRequest");
    private final static QName _CancelCallDoctorResponse_QNAME = new QName("http://www.hostco.ru/portal", "cancelCallDoctorResponse");
    private final static QName _FinishCallDoctorRequest_QNAME = new QName("http://www.hostco.ru/portal", "finishCallDoctorRequest");
    private final static QName _FinishCallDoctorResponse_QNAME = new QName("http://www.hostco.ru/portal", "finishCallDoctorResponse");
    private final static QName _DeleteDistrictRequest_QNAME = new QName("http://www.hostco.ru/portal", "deleteDistrictRequest");
    private final static QName _DeleteDistrictResponse_QNAME = new QName("http://www.hostco.ru/portal", "deleteDistrictResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.hostco.portal
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateScheduleRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "updateScheduleRequest")
    public JAXBElement<UpdateScheduleRequest> createUpdateScheduleRequest(UpdateScheduleRequest value) {
        return new JAXBElement<UpdateScheduleRequest>(_UpdateScheduleRequest_QNAME, UpdateScheduleRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortalServiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "updateScheduleResponse")
    public JAXBElement<PortalServiceResponseType> createUpdateScheduleResponse(PortalServiceResponseType value) {
        return new JAXBElement<PortalServiceResponseType>(_UpdateScheduleResponse_QNAME, PortalServiceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScheduleElementType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "deleteScheduleRequest")
    public JAXBElement<ScheduleElementType> createDeleteScheduleRequest(ScheduleElementType value) {
        return new JAXBElement<ScheduleElementType>(_DeleteScheduleRequest_QNAME, ScheduleElementType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortalServiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "deleteScheduleResponse")
    public JAXBElement<PortalServiceResponseType> createDeleteScheduleResponse(PortalServiceResponseType value) {
        return new JAXBElement<PortalServiceResponseType>(_DeleteScheduleResponse_QNAME, PortalServiceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeSlotStateSlipType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "changeSlotStateRequest")
    public JAXBElement<ChangeSlotStateSlipType> createChangeSlotStateRequest(ChangeSlotStateSlipType value) {
        return new JAXBElement<ChangeSlotStateSlipType>(_ChangeSlotStateRequest_QNAME, ChangeSlotStateSlipType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortalServiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "changeSlotStateResponse")
    public JAXBElement<PortalServiceResponseType> createChangeSlotStateResponse(PortalServiceResponseType value) {
        return new JAXBElement<PortalServiceResponseType>(_ChangeSlotStateResponse_QNAME, PortalServiceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlotInfoGUID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "readSlotStateRequest")
    public JAXBElement<SlotInfoGUID> createReadSlotStateRequest(SlotInfoGUID value) {
        return new JAXBElement<SlotInfoGUID>(_ReadSlotStateRequest_QNAME, SlotInfoGUID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlotListResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "readSlotStateResponse")
    public JAXBElement<SlotListResponseType> createReadSlotStateResponse(SlotListResponseType value) {
        return new JAXBElement<SlotListResponseType>(_ReadSlotStateResponse_QNAME, SlotListResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterOptionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "readFilteredSlotsStateRequest")
    public JAXBElement<FilterOptionsType> createReadFilteredSlotsStateRequest(FilterOptionsType value) {
        return new JAXBElement<FilterOptionsType>(_ReadFilteredSlotsStateRequest_QNAME, FilterOptionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlotListResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "readFilteredSlotsStateResponse")
    public JAXBElement<SlotListResponseType> createReadFilteredSlotsStateResponse(SlotListResponseType value) {
        return new JAXBElement<SlotListResponseType>(_ReadFilteredSlotsStateResponse_QNAME, SlotListResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateMuInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "updateMuInfoRequest")
    public JAXBElement<UpdateMuInfoRequest> createUpdateMuInfoRequest(UpdateMuInfoRequest value) {
        return new JAXBElement<UpdateMuInfoRequest>(_UpdateMuInfoRequest_QNAME, UpdateMuInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortalServiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "updateMuInfoResponse")
    public JAXBElement<PortalServiceResponseType> createUpdateMuInfoResponse(PortalServiceResponseType value) {
        return new JAXBElement<PortalServiceResponseType>(_UpdateMuInfoResponse_QNAME, PortalServiceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCabinetInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "updateCabinetInfoRequest")
    public JAXBElement<UpdateCabinetInfoRequest> createUpdateCabinetInfoRequest(UpdateCabinetInfoRequest value) {
        return new JAXBElement<UpdateCabinetInfoRequest>(_UpdateCabinetInfoRequest_QNAME, UpdateCabinetInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortalServiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "updateCabinetInfoResponse")
    public JAXBElement<PortalServiceResponseType> createUpdateCabinetInfoResponse(PortalServiceResponseType value) {
        return new JAXBElement<PortalServiceResponseType>(_UpdateCabinetInfoResponse_QNAME, PortalServiceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeCabinetRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "changeCabinetRequest")
    public JAXBElement<ChangeCabinetRequest> createChangeCabinetRequest(ChangeCabinetRequest value) {
        return new JAXBElement<ChangeCabinetRequest>(_ChangeCabinetRequest_QNAME, ChangeCabinetRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortalServiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "changeCabinetResponse")
    public JAXBElement<PortalServiceResponseType> createChangeCabinetResponse(PortalServiceResponseType value) {
        return new JAXBElement<PortalServiceResponseType>(_ChangeCabinetResponse_QNAME, PortalServiceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDistrictRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "updateDistrictRequest")
    public JAXBElement<UpdateDistrictRequest> createUpdateDistrictRequest(UpdateDistrictRequest value) {
        return new JAXBElement<UpdateDistrictRequest>(_UpdateDistrictRequest_QNAME, UpdateDistrictRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortalServiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "updateDistrictResponse")
    public JAXBElement<PortalServiceResponseType> createUpdateDistrictResponse(PortalServiceResponseType value) {
        return new JAXBElement<PortalServiceResponseType>(_UpdateDistrictResponse_QNAME, PortalServiceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStaffInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "updateStaffInfoRequest")
    public JAXBElement<UpdateStaffInfoRequest> createUpdateStaffInfoRequest(UpdateStaffInfoRequest value) {
        return new JAXBElement<UpdateStaffInfoRequest>(_UpdateStaffInfoRequest_QNAME, UpdateStaffInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortalServiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "updateStaffInfoResponse")
    public JAXBElement<PortalServiceResponseType> createUpdateStaffInfoResponse(PortalServiceResponseType value) {
        return new JAXBElement<PortalServiceResponseType>(_UpdateStaffInfoResponse_QNAME, PortalServiceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateServicePricesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "updateServicePricesRequest")
    public JAXBElement<UpdateServicePricesRequest> createUpdateServicePricesRequest(UpdateServicePricesRequest value) {
        return new JAXBElement<UpdateServicePricesRequest>(_UpdateServicePricesRequest_QNAME, UpdateServicePricesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortalServiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "updateServicePricesResponse")
    public JAXBElement<PortalServiceResponseType> createUpdateServicePricesResponse(PortalServiceResponseType value) {
        return new JAXBElement<PortalServiceResponseType>(_UpdateServicePricesResponse_QNAME, PortalServiceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePolicyInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "updatePolicyInfoRequest")
    public JAXBElement<UpdatePolicyInfoRequest> createUpdatePolicyInfoRequest(UpdatePolicyInfoRequest value) {
        return new JAXBElement<UpdatePolicyInfoRequest>(_UpdatePolicyInfoRequest_QNAME, UpdatePolicyInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortalServiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "updatePolicyInfoResponse")
    public JAXBElement<PortalServiceResponseType> createUpdatePolicyInfoResponse(PortalServiceResponseType value) {
        return new JAXBElement<PortalServiceResponseType>(_UpdatePolicyInfoResponse_QNAME, PortalServiceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutParametersRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "putParameterRequest")
    public JAXBElement<PutParametersRequest> createPutParameterRequest(PutParametersRequest value) {
        return new JAXBElement<PutParametersRequest>(_PutParameterRequest_QNAME, PutParametersRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortalServiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "putParameterResponse")
    public JAXBElement<PortalServiceResponseType> createPutParameterResponse(PortalServiceResponseType value) {
        return new JAXBElement<PortalServiceResponseType>(_PutParameterResponse_QNAME, PortalServiceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMuInfoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "getMuInfoRequest")
    public JAXBElement<GetMuInfoRequest> createGetMuInfoRequest(GetMuInfoRequest value) {
        return new JAXBElement<GetMuInfoRequest>(_GetMuInfoRequest_QNAME, GetMuInfoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMuInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "getMuInfoResponse")
    public JAXBElement<GetMuInfoResponse> createGetMuInfoResponse(GetMuInfoResponse value) {
        return new JAXBElement<GetMuInfoResponse>(_GetMuInfoResponse_QNAME, GetMuInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilterOptionsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "getScheduleInfoRequest")
    public JAXBElement<FilterOptionsType> createGetScheduleInfoRequest(FilterOptionsType value) {
        return new JAXBElement<FilterOptionsType>(_GetScheduleInfoRequest_QNAME, FilterOptionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScheduleInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "getScheduleInfoResponse")
    public JAXBElement<ScheduleInfoResponse> createGetScheduleInfoResponse(ScheduleInfoResponse value) {
        return new JAXBElement<ScheduleInfoResponse>(_GetScheduleInfoResponse_QNAME, ScheduleInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSickLeavesRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "updateSickLeavesRequest")
    public JAXBElement<UpdateSickLeavesRequest> createUpdateSickLeavesRequest(UpdateSickLeavesRequest value) {
        return new JAXBElement<UpdateSickLeavesRequest>(_UpdateSickLeavesRequest_QNAME, UpdateSickLeavesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortalServiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "updateSickLeavesResponse")
    public JAXBElement<PortalServiceResponseType> createUpdateSickLeavesResponse(PortalServiceResponseType value) {
        return new JAXBElement<PortalServiceResponseType>(_UpdateSickLeavesResponse_QNAME, PortalServiceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtendedSlotInfoGUID }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "deleteSlotRequest")
    public JAXBElement<ExtendedSlotInfoGUID> createDeleteSlotRequest(ExtendedSlotInfoGUID value) {
        return new JAXBElement<ExtendedSlotInfoGUID>(_DeleteSlotRequest_QNAME, ExtendedSlotInfoGUID.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortalServiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "deleteSlotResponse")
    public JAXBElement<PortalServiceResponseType> createDeleteSlotResponse(PortalServiceResponseType value) {
        return new JAXBElement<PortalServiceResponseType>(_DeleteSlotResponse_QNAME, PortalServiceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "getAppointmentsBySNILSRequest")
    public JAXBElement<String> createGetAppointmentsBySNILSRequest(String value) {
        return new JAXBElement<String>(_GetAppointmentsBySNILSRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAppointmentsBySNILSResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "getAppointmentsBySNILSResponse")
    public JAXBElement<GetAppointmentsBySNILSResponseType> createGetAppointmentsBySNILSResponse(GetAppointmentsBySNILSResponseType value) {
        return new JAXBElement<GetAppointmentsBySNILSResponseType>(_GetAppointmentsBySNILSResponse_QNAME, GetAppointmentsBySNILSResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "getSickLeaveListRequest")
    public JAXBElement<String> createGetSickLeaveListRequest(String value) {
        return new JAXBElement<String>(_GetSickLeaveListRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSickLeaveListResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "getSickLeaveListResponse")
    public JAXBElement<GetSickLeaveListResponseType> createGetSickLeaveListResponse(GetSickLeaveListResponseType value) {
        return new JAXBElement<GetSickLeaveListResponseType>(_GetSickLeaveListResponse_QNAME, GetSickLeaveListResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualSpecialistListRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "getActualSpecialistListRequest")
    public JAXBElement<ActualSpecialistListRequest> createGetActualSpecialistListRequest(ActualSpecialistListRequest value) {
        return new JAXBElement<ActualSpecialistListRequest>(_GetActualSpecialistListRequest_QNAME, ActualSpecialistListRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualSpecialistListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "getActualSpecialistListResponse")
    public JAXBElement<ActualSpecialistListResponse> createGetActualSpecialistListResponse(ActualSpecialistListResponse value) {
        return new JAXBElement<ActualSpecialistListResponse>(_GetActualSpecialistListResponse_QNAME, ActualSpecialistListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlotListByPeriodRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "getSlotListByPeriodRequest")
    public JAXBElement<SlotListByPeriodRequest> createGetSlotListByPeriodRequest(SlotListByPeriodRequest value) {
        return new JAXBElement<SlotListByPeriodRequest>(_GetSlotListByPeriodRequest_QNAME, SlotListByPeriodRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SlotListByPeriodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "getSlotListByPeriodResponse")
    public JAXBElement<SlotListByPeriodResponse> createGetSlotListByPeriodResponse(SlotListByPeriodResponse value) {
        return new JAXBElement<SlotListByPeriodResponse>(_GetSlotListByPeriodResponse_QNAME, SlotListByPeriodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDistrictRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "findDistrictRequest")
    public JAXBElement<FindDistrictRequest> createFindDistrictRequest(FindDistrictRequest value) {
        return new JAXBElement<FindDistrictRequest>(_FindDistrictRequest_QNAME, FindDistrictRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindDistrictResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "findDistrictResponse")
    public JAXBElement<FindDistrictResponse> createFindDistrictResponse(FindDistrictResponse value) {
        return new JAXBElement<FindDistrictResponse>(_FindDistrictResponse_QNAME, FindDistrictResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallDoctorPortalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "callDoctorRequest")
    public JAXBElement<CallDoctorPortalRequest> createCallDoctorRequest(CallDoctorPortalRequest value) {
        return new JAXBElement<CallDoctorPortalRequest>(_CallDoctorRequest_QNAME, CallDoctorPortalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortalServiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "callDoctorResponse")
    public JAXBElement<PortalServiceResponseType> createCallDoctorResponse(PortalServiceResponseType value) {
        return new JAXBElement<PortalServiceResponseType>(_CallDoctorResponse_QNAME, PortalServiceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelCallDoctorPortalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "cancelCallDoctorRequest")
    public JAXBElement<CancelCallDoctorPortalRequest> createCancelCallDoctorRequest(CancelCallDoctorPortalRequest value) {
        return new JAXBElement<CancelCallDoctorPortalRequest>(_CancelCallDoctorRequest_QNAME, CancelCallDoctorPortalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortalServiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "cancelCallDoctorResponse")
    public JAXBElement<PortalServiceResponseType> createCancelCallDoctorResponse(PortalServiceResponseType value) {
        return new JAXBElement<PortalServiceResponseType>(_CancelCallDoctorResponse_QNAME, PortalServiceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FinishCallDoctorPortalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "finishCallDoctorRequest")
    public JAXBElement<FinishCallDoctorPortalRequest> createFinishCallDoctorRequest(FinishCallDoctorPortalRequest value) {
        return new JAXBElement<FinishCallDoctorPortalRequest>(_FinishCallDoctorRequest_QNAME, FinishCallDoctorPortalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortalServiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "finishCallDoctorResponse")
    public JAXBElement<PortalServiceResponseType> createFinishCallDoctorResponse(PortalServiceResponseType value) {
        return new JAXBElement<PortalServiceResponseType>(_FinishCallDoctorResponse_QNAME, PortalServiceResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteDistrictPortalRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "deleteDistrictRequest")
    public JAXBElement<DeleteDistrictPortalRequest> createDeleteDistrictRequest(DeleteDistrictPortalRequest value) {
        return new JAXBElement<DeleteDistrictPortalRequest>(_DeleteDistrictRequest_QNAME, DeleteDistrictPortalRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortalServiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.hostco.ru/portal", name = "deleteDistrictResponse")
    public JAXBElement<PortalServiceResponseType> createDeleteDistrictResponse(PortalServiceResponseType value) {
        return new JAXBElement<PortalServiceResponseType>(_DeleteDistrictResponse_QNAME, PortalServiceResponseType.class, null, value);
    }

}
