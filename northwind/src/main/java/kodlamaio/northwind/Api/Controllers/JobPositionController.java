package kodlamaio.northwind.Api.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.Businesss.Abstract.JobPositionService;
import kodlamaio.northwind.Core.Result.DataResult;
import kodlamaio.northwind.Core.Result.Result;
import kodlamaio.northwind.Entities.Concrete.JobPosition;


@RestController
@RequestMapping("/api/jobposition")
public class JobPositionController {

private JobPositionService jobPositionService;
	
	@Autowired
	public  JobPositionController( JobPositionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	@RequestMapping("/getall")
	public DataResult<List< JobPosition>> getAll() {
		return this.jobPositionService.getAll();
	}
	
	@PostMapping("/add")
	public Result add( JobPosition jobPosition) {
		return this.jobPositionService.add(jobPosition);
	}
	
}
