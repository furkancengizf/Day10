package kodlamaio.northwind.Businesss.Abstract;

import java.util.List;

import kodlamaio.northwind.Core.Result.DataResult;
import kodlamaio.northwind.Core.Result.Result;
import kodlamaio.northwind.Entities.Concrete.Employee;

public interface EmployeeService {

	Result add(Employee employee);
	Result update(Employee employee);
	Result delete(Employee employee);
	DataResult<List<Employee>> getAll();
	DataResult<List<Employee>> getByEmployeeId(int employeeId);
	DataResult<List<Employee>> getByCompanyName(String companyName);
}
