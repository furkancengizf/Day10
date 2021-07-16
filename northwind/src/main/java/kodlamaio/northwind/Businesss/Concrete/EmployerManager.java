package kodlamaio.northwind.Businesss.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.northwind.Businesss.Abstract.EmployerService;
import kodlamaio.northwind.Businesss.Constans.Messages;
import kodlamaio.northwind.Core.Result.DataResult;
import kodlamaio.northwind.Core.Result.Result;
import kodlamaio.northwind.Core.Result.SuccessDataResult;
import kodlamaio.northwind.Core.Result.SuccessResult;
import kodlamaio.northwind.DataAccess.Abstract.EmployerDao;
import kodlamaio.northwind.Entities.Concrete.Employer;


public class EmployerManager implements EmployerService{
	
	private EmployerDao employerDao;
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}
	
	@Override
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult(Messages.EmployerAdded);
	}

	@Override
	public Result update(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult(Messages.DeleteSuccess);
	}

	@Override
	public Result delete(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult(Messages.UpdateSuccess);
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>
		(this.employerDao.findAll(),Messages.DataListed);
	}

	@Override
	public DataResult<List<Employer>> getByEmployerId(int employerId) {
		return new SuccessDataResult<List<Employer>>
		(this.employerDao.getByEmployerId(employerId),Messages.DataListed);
	}

	@Override
	public DataResult<List<Employer>> getByCompanyName(String companyName) {
		return new SuccessDataResult<List<Employer>>
		(this.employerDao.getByCompanyName(companyName),Messages.DataListed);
	}

}
