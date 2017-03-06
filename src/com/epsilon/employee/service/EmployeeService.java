package com.epsilon.employee.service;

import java.util.List;

import com.epsilon.employee.service.domain.Child;
import com.epsilon.employee.service.domain.Employee;

public interface EmployeeService {
public List<Child> getChildern(Employee emp);
}
