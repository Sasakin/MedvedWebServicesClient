package ru.hostco.app.db.service;

import ru.hostco.types.DepartmentType;

import java.util.List;

public interface DepartmentTypeService {
    List<DepartmentType> findAllDepartmentTypes();
}
