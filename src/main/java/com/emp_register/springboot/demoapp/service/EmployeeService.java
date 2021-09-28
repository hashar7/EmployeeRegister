package com.emp_register.springboot.demoapp.service;

import java.util.List;

import com.emp_register.springboot.demoapp.entity.Employee;

public interface EmployeeService {

    public List<Employee> findAll();

    public Employee findById(int theId);

    public void save(Employee theEmployee);

    public void deleteById(int theId);

}
