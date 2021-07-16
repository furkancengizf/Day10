package kodlamaio.northwind.Businesss.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.northwind.Businesss.Abstract.SchoolInfoService;
import kodlamaio.northwind.Businesss.Constans.Messages;
import kodlamaio.northwind.Core.Result.DataResult;
import kodlamaio.northwind.Core.Result.Result;
import kodlamaio.northwind.Core.Result.SuccessDataResult;
import kodlamaio.northwind.Core.Result.SuccessResult;
import kodlamaio.northwind.DataAccess.Abstract.SchoolInfoDao;
import kodlamaio.northwind.Entities.Concrete.SchoolInfo;

public class SchoolInfoManager implements SchoolInfoService{

	private SchoolInfoDao schoolInfoDao;
	@Autowired
	public SchoolInfoManager(SchoolInfoDao schoolInfoDao) {
		super();
		this.schoolInfoDao = schoolInfoDao;
	}
	
	@Override
	public Result add(SchoolInfo schoolInfo) {
		this.schoolInfoDao.save(schoolInfo);
		return new SuccessResult(Messages.SchoolAdded);
	}

	@Override
	public Result update(SchoolInfo schoolInfo) {
		this.schoolInfoDao.save(schoolInfo);
		return new SuccessResult(Messages.UpdateSuccess);
	}

	@Override
	public Result delete(SchoolInfo schoolInfo) {
		this.schoolInfoDao.save(schoolInfo);
		return new SuccessResult(Messages.DeleteSuccess);
	}

	@Override
	public DataResult<List<SchoolInfo>> getAll() {
		return new SuccessDataResult<List<SchoolInfo>>
		(this.schoolInfoDao.findAll(),Messages.DataListed);
	}

	@Override
	public DataResult<List<SchoolInfo>> getByGraduationDate(int graduationDate) {
		return new SuccessDataResult<List<SchoolInfo>>
		(this.schoolInfoDao.getByGraduationDate(graduationDate),Messages.DataListed);
	}

}
