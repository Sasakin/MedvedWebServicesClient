package ru.hostco.portal;

import ru.hostco.portal.types.*;
import ru.hostco.types.*;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.0
 * 2017-11-08T12:11:01.735+03:00
 * Generated source version: 3.2.0
 * 
 */
@WebService(targetNamespace = "http://www.hostco.ru/portal", name = "portal")
@XmlSeeAlso({ObjectFactory.class, ObjectFactory.class, ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Portal {

    /**
     * �������� ���������� � ����������� ���������� � �� ��������������
     *             
     */
    @WebMethod(action = "http://www.hostco.ru/portal/updateStaffInfo")
    @WebResult(name = "updateStaffInfoResponse", targetNamespace = "http://www.hostco.ru/portal", partName = "parameters")
    public PortalServiceResponseType updateStaffInfo(
        @WebParam(partName = "parameters", name = "updateStaffInfoRequest", targetNamespace = "http://www.hostco.ru/portal")
        UpdateStaffInfoRequest parameters
    );

    /**
     * �������� ������ ������� ���������� �������
     *             
     */
    @WebMethod(action = "http://www.hostco.ru/portal/getSickLeaveList")
    @WebResult(name = "getSickLeaveListResponse", targetNamespace = "http://www.hostco.ru/portal", partName = "parameters")
    public GetSickLeaveListResponseType getSickLeaveList(
        @WebParam(partName = "parameters", name = "getSickLeaveListRequest", targetNamespace = "http://www.hostco.ru/portal")
        String parameters
    );

    /**
     * �������� ��������� �����
     *             
     */
    @WebMethod(action = "http://www.hostco.ru/portal/changeSlotState")
    @WebResult(name = "changeSlotStateResponse", targetNamespace = "http://www.hostco.ru/portal", partName = "parameters")
    public PortalServiceResponseType changeSlotState(
        @WebParam(partName = "parameters", name = "changeSlotStateRequest", targetNamespace = "http://www.hostco.ru/portal")
        ChangeSlotStateSlipType parameters
    );

    /**
     * ��������� ������ �� ��������� ���������� �� ���
     *             
     */
    @WebMethod(action = "http://www.hostco.ru/portal/getMuInfo")
    @WebResult(name = "getMuInfoResponse", targetNamespace = "http://www.hostco.ru/portal", partName = "parameters")
    public GetMuInfoResponse getMuInfo(
        @WebParam(partName = "parameters", name = "getMuInfoRequest", targetNamespace = "http://www.hostco.ru/portal")
        GetMuInfoRequest parameters
    );

    @WebMethod(action = "http://www.hostco.ru/portal/getActualSpecialistList")
    @WebResult(name = "getActualSpecialistListResponse", targetNamespace = "http://www.hostco.ru/portal", partName = "parameters")
    public ActualSpecialistListResponse getActualSpecialistList(
        @WebParam(partName = "parameters", name = "getActualSpecialistListRequest", targetNamespace = "http://www.hostco.ru/portal")
        ActualSpecialistListRequest parameters
    );

    /**
     * ������ ������ ����� �� ���
     *             
     */
    @WebMethod(action = "http://www.hostco.ru/portal/cancelCallDoctor")
    @WebResult(name = "cancelCallDoctorResponse", targetNamespace = "http://www.hostco.ru/portal", partName = "parameters")
    public PortalServiceResponseType cancelCallDoctor(
        @WebParam(partName = "parameters", name = "cancelCallDoctorRequest", targetNamespace = "http://www.hostco.ru/portal")
        CancelCallDoctorPortalRequest parameters
    );

    /**
     * ���������� ������� ������ ����������
     *             
     */
    @WebMethod(action = "http://www.hostco.ru/portal/updateSchedule")
    @WebResult(name = "updateScheduleResponse", targetNamespace = "http://www.hostco.ru/portal", partName = "parameters")
    public PortalServiceResponseType updateSchedule(
        @WebParam(partName = "parameters", name = "updateScheduleRequest", targetNamespace = "http://www.hostco.ru/portal")
        UpdateScheduleRequest parameters
    );

    /**
     * ������� ������� � �����
     *             
     */
    @WebMethod(action = "http://www.hostco.ru/portal/changeCabinet")
    @WebResult(name = "changeCabinetResponse", targetNamespace = "http://www.hostco.ru/portal", partName = "parameters")
    public PortalServiceResponseType changeCabinet(
        @WebParam(partName = "parameters", name = "changeCabinetRequest", targetNamespace = "http://www.hostco.ru/portal")
        ChangeCabinetRequest parameters
    );

    /**
     * �������� �������
     *             
     */
    @WebMethod(action = "http://www.hostco.ru/portal/deleteDistrict")
    @WebResult(name = "deleteDistrictResponse", targetNamespace = "http://www.hostco.ru/portal", partName = "parameters")
    public PortalServiceResponseType deleteDistrict(
        @WebParam(partName = "parameters", name = "deleteDistrictRequest", targetNamespace = "http://www.hostco.ru/portal")
        DeleteDistrictPortalRequest parameters
    );

    /**
     * �������� ���������� � ������ ��������
     *             
     */
    @WebMethod(action = "http://www.hostco.ru/portal/updatePolicyInfo")
    @WebResult(name = "updatePolicyInfoResponse", targetNamespace = "http://www.hostco.ru/portal", partName = "parameters")
    public PortalServiceResponseType updatePolicyInfo(
        @WebParam(partName = "parameters", name = "updatePolicyInfoRequest", targetNamespace = "http://www.hostco.ru/portal")
        UpdatePolicyInfoRequest parameters
    );

    /**
     * ����� ����� �� ���
     *             
     */
    @WebMethod(action = "http://www.hostco.ru/portal/callDoctor")
    @WebResult(name = "callDoctorResponse", targetNamespace = "http://www.hostco.ru/portal", partName = "parameters")
    public PortalServiceResponseType callDoctor(
        @WebParam(partName = "parameters", name = "callDoctorRequest", targetNamespace = "http://www.hostco.ru/portal")
        CallDoctorPortalRequest parameters
    );

    /**
     * ����� ������� �� ������
     *             
     */
    @WebMethod(action = "http://www.hostco.ru/portal/findDistrict")
    @WebResult(name = "findDistrictResponse", targetNamespace = "http://www.hostco.ru/portal", partName = "parameters")
    public FindDistrictResponse findDistrict(
        @WebParam(partName = "parameters", name = "findDistrictRequest", targetNamespace = "http://www.hostco.ru/portal")
        FindDistrictRequest parameters
    );

    /**
     * �������� ���������� � ���
     *             
     */
    @WebMethod(action = "http://www.hostco.ru/portal/updateMuInfo")
    @WebResult(name = "updateMuInfoResponse", targetNamespace = "http://www.hostco.ru/portal", partName = "parameters")
    public PortalServiceResponseType updateMuInfo(
        @WebParam(partName = "parameters", name = "updateMuInfoRequest", targetNamespace = "http://www.hostco.ru/portal")
        UpdateMuInfoRequest parameters
    );

    /**
     * �������� ��������� �������
     *             
     */
    @WebMethod(action = "http://www.hostco.ru/portal/putParameter")
    @WebResult(name = "putParameterResponse", targetNamespace = "http://www.hostco.ru/portal", partName = "parameters")
    public PortalServiceResponseType putParameter(
        @WebParam(partName = "parameters", name = "putParameterRequest", targetNamespace = "http://www.hostco.ru/portal")
        PutParametersRequest parameters
    );

    /**
     * �������� ���������� � ���������
     *             
     */
    @WebMethod(action = "http://www.hostco.ru/portal/updateCabinetInfo")
    @WebResult(name = "updateCabinetInfoResponse", targetNamespace = "http://www.hostco.ru/portal", partName = "parameters")
    public PortalServiceResponseType updateCabinetInfo(
        @WebParam(partName = "parameters", name = "updateCabinetInfoRequest", targetNamespace = "http://www.hostco.ru/portal")
        UpdateCabinetInfoRequest parameters
    );

    /**
     * ������� ����������
     *             
     */
    @WebMethod(action = "http://www.hostco.ru/portal/deleteSchedule")
    @WebResult(name = "deleteScheduleResponse", targetNamespace = "http://www.hostco.ru/portal", partName = "parameters")
    public PortalServiceResponseType deleteSchedule(
        @WebParam(partName = "parameters", name = "deleteScheduleRequest", targetNamespace = "http://www.hostco.ru/portal")
        ScheduleElementType parameters
    );

    /**
     * ��������� ������ �� ���������� ���������� �� ����������� ������ ������������� ���
     *             
     */
    @WebMethod(action = "http://www.hostco.ru/portal/updateSickLeaves")
    @WebResult(name = "updateSickLeavesResponse", targetNamespace = "http://www.hostco.ru/portal", partName = "parameters")
    public PortalServiceResponseType updateSickLeaves(
        @WebParam(partName = "parameters", name = "updateSickLeavesRequest", targetNamespace = "http://www.hostco.ru/portal")
        UpdateSickLeavesRequest parameters
    );

    /**
     * ���������� ������ ����� �� ���
     *             
     */
    @WebMethod(action = "http://www.hostco.ru/portal/finishCallDoctor")
    @WebResult(name = "finishCallDoctorResponse", targetNamespace = "http://www.hostco.ru/portal", partName = "parameters")
    public PortalServiceResponseType finishCallDoctor(
        @WebParam(partName = "parameters", name = "finishCallDoctorRequest", targetNamespace = "http://www.hostco.ru/portal")
        FinishCallDoctorPortalRequest parameters
    );

    /**
     * ��������� ������ �� ��������� ���������� � ����������
     *             
     */
    @WebMethod(action = "http://www.hostco.ru/portal/getScheduleInfo")
    @WebResult(name = "getScheduleInfoResponse", targetNamespace = "http://www.hostco.ru/portal", partName = "parameters")
    public ScheduleInfoResponse getScheduleInfo(
        @WebParam(partName = "parameters", name = "getScheduleInfoRequest", targetNamespace = "http://www.hostco.ru/portal")
        FilterOptionsType parameters
    );

    /**
     * ��������� ������ �� �������� �����
     *             
     */
    @WebMethod(action = "http://www.hostco.ru/portal/deleteSlot")
    @WebResult(name = "deleteSlotResponse", targetNamespace = "http://www.hostco.ru/portal", partName = "parameters")
    public PortalServiceResponseType deleteSlot(
        @WebParam(partName = "parameters", name = "deleteSlotRequest", targetNamespace = "http://www.hostco.ru/portal")
        ExtendedSlotInfoGUID parameters
    );

    /**
     * �������� ���������� �� ��������
     *             
     */
    @WebMethod(action = "http://www.hostco.ru/portal/updateDistrict")
    @WebResult(name = "updateDistrictResponse", targetNamespace = "http://www.hostco.ru/portal", partName = "parameters")
    public PortalServiceResponseType updateDistrict(
        @WebParam(partName = "parameters", name = "updateDistrictRequest", targetNamespace = "http://www.hostco.ru/portal")
        UpdateDistrictRequest parameters
    );

    /**
     * �������� ���������� � ������������ ��� �� ������ ��
     *             
     */
    @WebMethod(action = "http://www.hostco.ru/portal/updateServicePrices")
    @WebResult(name = "updateServicePricesResponse", targetNamespace = "http://www.hostco.ru/portal", partName = "parameters")
    public PortalServiceResponseType updateServicePrices(
        @WebParam(partName = "parameters", name = "updateServicePricesRequest", targetNamespace = "http://www.hostco.ru/portal")
        UpdateServicePricesRequest parameters
    );

    @WebMethod(action = "http://www.hostco.ru/portal/getSlotListByPeriod")
    @WebResult(name = "getSlotListByPeriodResponse", targetNamespace = "http://www.hostco.ru/portal", partName = "parameters")
    public SlotListByPeriodResponse getSlotListByPeriod(
        @WebParam(partName = "parameters", name = "getSlotListByPeriodRequest", targetNamespace = "http://www.hostco.ru/portal")
        SlotListByPeriodRequest parameters
    );

    /**
     * ��������� ��������� ����� �� ��� ����
     *             
     */
    @WebMethod(action = "http://www.hostco.ru/portal/readSlotState")
    @WebResult(name = "readSlotStateResponse", targetNamespace = "http://www.hostco.ru/portal", partName = "parameters")
    public SlotListResponseType readSlotState(
        @WebParam(partName = "parameters", name = "readSlotStateRequest", targetNamespace = "http://www.hostco.ru/portal")
        SlotInfoGUID parameters
    );

    /**
     * ������� ������� �� ����� ��������
     *             
     */
    @WebMethod(action = "http://www.hostco.ru/portal/getAppointmentsBySNILS")
    @WebResult(name = "getAppointmentsBySNILSResponse", targetNamespace = "http://www.hostco.ru/portal", partName = "parameters")
    public GetAppointmentsBySNILSResponseType getAppointmentsBySNILS(
        @WebParam(partName = "parameters", name = "getAppointmentsBySNILSRequest", targetNamespace = "http://www.hostco.ru/portal")
        String parameters
    );

    /**
     * ��������� ��������� ������, ��������������� �������
     *             
     */
    @WebMethod(action = "http://www.hostco.ru/portal/readFilteredSlotsState")
    @WebResult(name = "readFilteredSlotsStateResponse", targetNamespace = "http://www.hostco.ru/portal", partName = "parameters")
    public SlotListResponseType readFilteredSlotsState(
        @WebParam(partName = "parameters", name = "readFilteredSlotsStateRequest", targetNamespace = "http://www.hostco.ru/portal")
        FilterOptionsType parameters
    );
}