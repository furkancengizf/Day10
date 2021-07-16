package kodlamaio.northwind.Businesss.Abstract;

import java.util.List;

import kodlamaio.northwind.Core.Result.DataResult;
import kodlamaio.northwind.Core.Result.Result;
import kodlamaio.northwind.Entities.Concrete.City;


public interface CityService {

	Result add(City city);
	Result update(City city);
	Result delete(City city);
	DataResult<List<City>> getAll();
}
