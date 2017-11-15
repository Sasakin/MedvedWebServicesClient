package ru.hostco.app.db.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.hostco.app.db.dao.DepartmentTypeDao;
import ru.hostco.types.DepartmentType;

import java.util.List;

@Service("departmentTypeService")
@Transactional
public class DepartmentTypeServiceImpl implements DepartmentTypeService {

    @Autowired
    DepartmentTypeDao dao;

    public List<DepartmentType> findAllDepartmentTypes() {
        return dao.findAllDepartmentTypes();
    }
}
