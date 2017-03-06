package com.epsilon.employee.service;

import java.util.ArrayList;
import java.util.List;

import com.epsilon.employee.service.domain.Child;
import com.epsilon.employee.service.domain.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public List<Child> getChildern(Employee emp) {
		List<Child> children=new ArrayList<Child>();
		Child child=new Child();
		child.setChildname("epsilon");
		child.setStdno(111);
		children.add(child);
		child=new Child();
		child.setChildname("harmony");
		child.setStdno(222);
		children.add(child);
		child=new Child();
		child.setChildname("cdssegmentation");
		child.setStdno(333);
		children.add(child);
		child=new Child();
		child.setChildname("CDS-DMP");
		child.setStdno(444);
		children.add(child);
		return children;
	}

}
