package ru.hostco.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import ru.hostco.app.confiquration.AppConfig;
import ru.hostco.app.db.service.DepartmentTypeService;
import ru.hostco.app.db.service.MedvedDBNotificationService;
import ru.hostco.portal.PortalImpl;
import ru.hostco.portal.types.UpdateMuInfoRequest;
import ru.hostco.types.DepartmentType;
import ru.hostco.types.PortalServiceResponseType;

import java.util.List;

public class RequestManager {

    public static final String MU_CODE = "50111222";
    public final static String UPDATE_MU_INFO_TYPE = "1";

    private PortalImpl portal;
    private AbstractApplicationContext context;

    public RequestManager() {
        portal = new PortalImpl();
        context = context = new AnnotationConfigApplicationContext(AppConfig.class);
    }

    public void sendRequest(String eventType) {
        if(eventType.equals(UPDATE_MU_INFO_TYPE))
            updateMuInfo();
    }

    private void updateMuInfo() {
        System.out.println("updateMuInfo");
        DepartmentTypeService service = (DepartmentTypeService) context.getBean("departmentTypeService");
        List<DepartmentType> departmentList = service.findAllDepartmentTypes();
        UpdateMuInfoRequest request = new UpdateMuInfoRequest();
        request.setMuCode(MU_CODE);
        request.setDepartment(departmentList);
        PortalServiceResponseType response = portal.updateMuInfo(request); // 2. Отправка данных, получение ответа.
        {
            // обработка ответа. Возвращаем статус 2 если ошибка есть и статус 3 если нет
        }

    }

}
