package ch06.service;

import java.util.List;

import ch06.dao.EmployeeDao;
import ch06.domain.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl(EmployeeDao employeeDao) { //di작업은생성자에서
		this.employeeDao = employeeDao;
	}
	
	@Override
	public List<Employee> getEmployees() {
		return employeeDao.selectEmployees(); //프레젠테이션한테 리턴
	}
}
