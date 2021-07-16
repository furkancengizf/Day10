package kodlamaio.northwind.Businesss.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.northwind.Businesss.Abstract.CityService;
import kodlamaio.northwind.Businesss.Constans.Messages;
import kodlamaio.northwind.Core.Result.DataResult;
import kodlamaio.northwind.Core.Result.Result;
import kodlamaio.northwind.Core.Result.SuccessDataResult;
import kodlamaio.northwind.Core.Result.SuccessResult;
import kodlamaio.northwind.DataAccess.Abstract.CityDao;
import kodlamaio.northwind.Entities.Concrete.City;

public class CityManager implements CityService {

	private CityDao cityDao;
	@Autowired
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}
	
	@Override
	public Result add(City city) {
		this.cityDao.save(city);
		return new SuccessResult(Messages.CityAdded);
	}

	@Override
	public Result update(City city) {
		this.cityDao.save(city);
		return new SuccessResult(Messages.UpdateSuccess);
	}

	@Override
	public Result delete(City city) {
		this.cityDao.save(city);
		return new SuccessResult(Messages.DeleteSuccess);
	}

	@Override
	public DataResult<List<City>> getAll() {
		return new SuccessDataResult<List<City>>
		(this.cityDao.findAll(),Messages.DataListed);
	}

	
}
