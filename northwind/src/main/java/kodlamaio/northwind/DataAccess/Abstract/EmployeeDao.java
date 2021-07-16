package kodlamaio.northwind.DataAccess.Abstract;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import kodlamaio.northwind.Entities.Concrete.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {

	List<Employee> getAll();
	List<Employee> getByEmployeeId(int employeeId);
	List<Employee> getByCompanyName(String companyName);
}
