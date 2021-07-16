package kodlamaio.northwind.Businesss.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.northwind.Businesss.Abstract.EmployeeService;
import kodlamaio.northwind.Businesss.Constans.Messages;
import kodlamaio.northwind.Core.Result.DataResult;
import kodlamaio.northwind.Core.Result.Result;
import kodlamaio.northwind.Core.Result.SuccessDataResult;
import kodlamaio.northwind.Core.Result.SuccessResult;
import kodlamaio.northwind.DataAccess.Abstract.EmployeeDao;
import kodlamaio.northwind.Entities.Concrete.Employee;

public class EmployeeManager implements EmployeeService {

	
	private EmployeeDao employeeDao;
	@Autowired
	public EmployeeManager(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}
	
	@Override
	public Result add(Employee employee) {
		this.employeeDao.save(employee);
		return new SuccessResult(Messages.CandidateAdded);
	}

	@Override
	public Result update(Employee employee) {
		this.employeeDao.save(employee);
		return new SuccessResult(Messages.DeleteSuccess);
	}

	@Override
	public Result delete(Employee employee) {
		this.employeeDao.save(employee);
		return new SuccessResult(Messages.UpdateSuccess);
	}

	@Override
	public DataResult<List<Employee>> getAll() {
		return new SuccessDataResult<List<Employee>>
		(this.employeeDao.findAll(),Messages.DataListed);
	}

	@Override
	public DataResult<List<Employee>> getByEmployeeId(int employeeId) {
		return new SuccessDataResult<List<Employee>>
		(this.employeeDao.getByEmployeeId(employeeId),Messages.DataListed);
	}

	@Override
	public DataResult<List<Employee>> getByCompanyName(String companyName) {
		return new SuccessDataResult<List<Employee>>
		(this.employeeDao.getByCompanyName(companyName),Messages.DataListed);
	}

}
