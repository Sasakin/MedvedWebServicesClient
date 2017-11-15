package ru.hostco.app.db.dao;

import ru.hostco.types.DepartmentType;

import java.util.List;

public interface DepartmentTypeDao  {

    List<DepartmentType> findAllDepartmentTypes();
}
