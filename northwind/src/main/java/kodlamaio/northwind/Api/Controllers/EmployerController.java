package kodlamaio.northwind.Api.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.Businesss.Abstract.EmployerService;
import kodlamaio.northwind.Core.Result.DataResult;
import kodlamaio.northwind.Core.Result.Result;
import kodlamaio.northwind.Entities.Concrete.Employer;


@RestController
@RequestMapping("/api/employer")
public class EmployerController {

    private EmployerService employerService;
	
	@Autowired
	public EmployerController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@RequestMapping("/getall")
	public DataResult<List<Employer>> getAll() {
		return this.employerService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(Employer employer) {
		return this.employerService.add(employer);
	}
	
	@RequestMapping("/getbyemployerıd")
	public DataResult<List<Employer>> getByEmployerId(int employerId) {
		return this.employerService.getByEmployerId(employerId);
	}
	
	@RequestMapping("/getall")
	public DataResult<List<Employer>> getByCompanyName(String companyName) {
		return this.employerService.getByCompanyName(companyName);
	}
	
}
