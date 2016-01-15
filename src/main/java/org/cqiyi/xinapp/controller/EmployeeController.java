package org.cqiyi.xinapp.controller;

import org.cqiyi.xinapp.model.Employee;
import org.cqiyi.xinapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/api", produces = "application/json;charset=UTF-8")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/x")
	public @ResponseBody Employee resetAllPasswords() {
		EmployeeService service = new EmployeeService();

		Employee e = new Employee();
		e.set("first_name", "John");
		e.set("last_name", "Doe");
		service.insert(e);
		return e;
	}
}
