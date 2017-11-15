package ru.hostco.portal;

import ru.hostco.portal.types.*;
import ru.hostco.types.*;

import javax.jws.WebParam;
import java.net.MalformedURLException;
import java.net.URL;

public class PortalImpl implements Portal {
    private Portal service;
//"http://medved-webservices.hostco.ru/PortalService/services/portal?wsdl"
    public PortalImpl() {
        try {
            service = new Portal_Service(new URL("http://medved-webservices.hostco.ru/PortalService/services/portal?wsdl")).getPort(Portal.class);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public PortalServiceResponseType updateStaffInfo(@WebParam(partName = "parameters", name = "updateStaffInfoRequest", targetNamespace = "http://www.hostco.ru/portal") UpdateStaffInfoRequest parameters) {
        return null;
    }

    @Override
    public GetSickLeaveListResponseType getSickLeaveList(@WebParam(partName = "parameters", name = "getSickLeaveListRequest", targetNamespace = "http://www.hostco.ru/portal") String parameters) {
        return null;
    }

    @Override
    public PortalServiceResponseType changeSlotState(@WebParam(partName = "parameters", name = "changeSlotStateRequest", targetNamespace = "http://www.hostco.ru/portal") ChangeSlotStateSlipType parameters) {
        return null;
    }

    @Override
    public GetMuInfoResponse getMuInfo(@WebParam(partName = "parameters", name = "getMuInfoRequest", targetNamespace = "http://www.hostco.ru/portal") GetMuInfoRequest parameters) {
        return null;
    }

    @Override
    public ActualSpecialistListResponse getActualSpecialistList(@WebParam(partName = "parameters", name = "getActualSpecialistListRequest", targetNamespace = "http://www.hostco.ru/portal") ActualSpecialistListRequest parameters) {
        return null;
    }

    @Override
    public PortalServiceResponseType cancelCallDoctor(@WebParam(partName = "parameters", name = "cancelCallDoctorRequest", targetNamespace = "http://www.hostco.ru/portal") CancelCallDoctorPortalRequest parameters) {
        return null;
    }

    @Override
    public PortalServiceResponseType updateSchedule(@WebParam(partName = "parameters", name = "updateScheduleRequest", targetNamespace = "http://www.hostco.ru/portal") UpdateScheduleRequest parameters) {
        return null;
    }

    @Override
    public PortalServiceResponseType changeCabinet(@WebParam(partName = "parameters", name = "changeCabinetRequest", targetNamespace = "http://www.hostco.ru/portal") ChangeCabinetRequest parameters) {
        return null;
    }

    @Override
    public PortalServiceResponseType deleteDistrict(@WebParam(partName = "parameters", name = "deleteDistrictRequest", targetNamespace = "http://www.hostco.ru/portal") DeleteDistrictPortalRequest parameters) {
        return null;
    }

    @Override
    public PortalServiceResponseType updatePolicyInfo(@WebParam(partName = "parameters", name = "updatePolicyInfoRequest", targetNamespace = "http://www.hostco.ru/portal") UpdatePolicyInfoRequest parameters) {
        return null;
    }

    @Override
    public PortalServiceResponseType callDoctor(@WebParam(partName = "parameters", name = "callDoctorRequest", targetNamespace = "http://www.hostco.ru/portal") CallDoctorPortalRequest parameters) {
        return null;
    }

    @Override
    public FindDistrictResponse findDistrict(@WebParam(partName = "parameters", name = "findDistrictRequest", targetNamespace = "http://www.hostco.ru/portal") FindDistrictRequest parameters) {
        return null;
    }

    @Override
    public PortalServiceResponseType updateMuInfo(@WebParam(partName = "parameters", name = "updateMuInfoRequest", targetNamespace = "http://www.hostco.ru/portal") UpdateMuInfoRequest parameters) {

        System.out.println(parameters);
        return service.updateMuInfo(parameters);
    }

    @Override
    public PortalServiceResponseType putParameter(@WebParam(partName = "parameters", name = "putParameterRequest", targetNamespace = "http://www.hostco.ru/portal") PutParametersRequest parameters) {
        return null;
    }

    @Override
    public PortalServiceResponseType updateCabinetInfo(@WebParam(partName = "parameters", name = "updateCabinetInfoRequest", targetNamespace = "http://www.hostco.ru/portal") UpdateCabinetInfoRequest parameters) {
        return null;
    }

    @Override
    public PortalServiceResponseType deleteSchedule(@WebParam(partName = "parameters", name = "deleteScheduleRequest", targetNamespace = "http://www.hostco.ru/portal") ScheduleElementType parameters) {
        return null;
    }

    @Override
    public PortalServiceResponseType updateSickLeaves(@WebParam(partName = "parameters", name = "updateSickLeavesRequest", targetNamespace = "http://www.hostco.ru/portal") UpdateSickLeavesRequest parameters) {
        return null;
    }

    @Override
    public PortalServiceResponseType finishCallDoctor(@WebParam(partName = "parameters", name = "finishCallDoctorRequest", targetNamespace = "http://www.hostco.ru/portal") FinishCallDoctorPortalRequest parameters) {
        return null;
    }

    @Override
    public ScheduleInfoResponse getScheduleInfo(@WebParam(partName = "parameters", name = "getScheduleInfoRequest", targetNamespace = "http://www.hostco.ru/portal") FilterOptionsType parameters) {
        return null;
    }

    @Override
    public PortalServiceResponseType deleteSlot(@WebParam(partName = "parameters", name = "deleteSlotRequest", targetNamespace = "http://www.hostco.ru/portal") ExtendedSlotInfoGUID parameters) {
        return null;
    }

    @Override
    public PortalServiceResponseType updateDistrict(@WebParam(partName = "parameters", name = "updateDistrictRequest", targetNamespace = "http://www.hostco.ru/portal") UpdateDistrictRequest parameters) {
        return null;
    }

    @Override
    public PortalServiceResponseType updateServicePrices(@WebParam(partName = "parameters", name = "updateServicePricesRequest", targetNamespace = "http://www.hostco.ru/portal") UpdateServicePricesRequest parameters) {
        return null;
    }

    @Override
    public SlotListByPeriodResponse getSlotListByPeriod(@WebParam(partName = "parameters", name = "getSlotListByPeriodRequest", targetNamespace = "http://www.hostco.ru/portal") SlotListByPeriodRequest parameters) {
        return null;
    }

    @Override
    public SlotListResponseType readSlotState(@WebParam(partName = "parameters", name = "readSlotStateRequest", targetNamespace = "http://www.hostco.ru/portal") SlotInfoGUID parameters) {
        return null;
    }

    @Override
    public GetAppointmentsBySNILSResponseType getAppointmentsBySNILS(@WebParam(partName = "parameters", name = "getAppointmentsBySNILSRequest", targetNamespace = "http://www.hostco.ru/portal") String parameters) {
        return null;
    }

    @Override
    public SlotListResponseType readFilteredSlotsState(@WebParam(partName = "parameters", name = "readFilteredSlotsStateRequest", targetNamespace = "http://www.hostco.ru/portal") FilterOptionsType parameters) {
        return null;
    }
}
