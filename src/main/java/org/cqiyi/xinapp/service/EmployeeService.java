package org.cqiyi.xinapp.service;

import java.util.List;

import org.cqiyi.xinapp.core.BaseService;
import org.cqiyi.xinapp.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EmployeeService extends BaseService<Employee> {
	Logger logger = LoggerFactory.getLogger(EmployeeService.class);

	@Override
	public boolean insert(Employee model) {
		return model.saveIt();
	}

	@Override
	public boolean update(Employee model) {
		return model.saveIt();
	}

	@Override
	public boolean delete(Employee model) {
		model.delete(true);
		return true;
	}

	@Override
	public Employee get(String id) {
		return Employee.findById(id);
	}

	@Override
	public List<Employee> getAll() {
		return Employee.findAll();
	}

}
