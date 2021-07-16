package kodlamaio.northwind.Api.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kodlamaio.northwind.Businesss.Abstract.EmployeeService;
import kodlamaio.northwind.Core.Result.DataResult;
import kodlamaio.northwind.Core.Result.Result;
import kodlamaio.northwind.Entities.Concrete.Employee;


public class EmployeeController {

    private EmployeeService employeeService;
	
	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@RequestMapping("/getall")
	public DataResult<List<Employee>> getAll() {
		return this.employeeService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(Employee employee) {
		return this.employeeService.add(employee);
	}
	
	@RequestMapping("/getbyemployeeıd")
	public DataResult<List<Employee>> getByEmployeeId(int employeeId) {
		return this.employeeService.getByEmployeeId(employeeId);
	}
	
	@RequestMapping("/getall")
	public DataResult<List<Employee>> getByCompanyName(String companyName) {
		return this.employeeService.getByCompanyName(companyName);
	}
}
