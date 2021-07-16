package kodlamaio.northwind.Businesss.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.northwind.Businesss.Abstract.JobPositionService;
import kodlamaio.northwind.Businesss.Constans.Messages;
import kodlamaio.northwind.Core.Result.DataResult;
import kodlamaio.northwind.Core.Result.Result;
import kodlamaio.northwind.Core.Result.SuccessDataResult;
import kodlamaio.northwind.Core.Result.SuccessResult;
import kodlamaio.northwind.DataAccess.Abstract.JobPositionDao;
import kodlamaio.northwind.Entities.Concrete.JobPosition;

public class JobPositionManager implements JobPositionService {

	
	private JobPositionDao jobPositionDao;
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
     }
	@Override
	public Result add(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult(Messages.JobPositionAdded);
	}
	@Override
	public Result update(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult(Messages.UpdateSuccess);
	}
	@Override
	public Result delete(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult(Messages.DeleteSuccess);
	}
	@Override
	public DataResult<List<JobPosition>> getAll() {
		return new SuccessDataResult<List<JobPosition>>
		(this.jobPositionDao.findAll(),Messages.DataListed);
	}
}