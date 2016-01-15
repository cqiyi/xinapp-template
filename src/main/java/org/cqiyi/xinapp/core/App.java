package org.cqiyi.xinapp.core;

import org.cqiyi.xinapp.model.Employee;
import org.cqiyi.xinapp.service.EmployeeService;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeService service = new EmployeeService();

		Employee e = new Employee();
		e.set("first_name", "John");
		e.set("last_name", "Doe");
		service.insert(e);
	}

}
