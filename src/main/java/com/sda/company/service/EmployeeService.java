package com.sda.company.service;

import com.sda.company.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee create(Employee employee);

    List<Employee> getAll();

    Employee findByFirstName(String name);

    void deleteEmployeeById(Integer id);

    Employee hire(Integer employeeId, Integer companyId);

}
