package kodlamaio.northwind.Api.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.Businesss.Abstract.CityService;
import kodlamaio.northwind.Core.Result.DataResult;
import kodlamaio.northwind.Core.Result.Result;
import kodlamaio.northwind.Entities.Concrete.City;

@RestController
@RequestMapping("/api/city")
public class CityController {

    private CityService cityService;
	
	@Autowired
	public CityController(CityService cityService) {
		super();
		this.cityService = cityService;
	}
	
	@RequestMapping("/getall")
	public DataResult<List<City>> getAll() {
		return this.cityService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(City city) {
		return this.cityService.add(city);
	}
}
