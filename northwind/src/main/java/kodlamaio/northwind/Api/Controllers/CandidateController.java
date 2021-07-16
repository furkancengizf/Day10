package kodlamaio.northwind.Api.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.Businesss.Abstract.CandidateService;
import kodlamaio.northwind.Core.Result.DataResult;
import kodlamaio.northwind.Core.Result.Result;
import kodlamaio.northwind.Entities.Concrete.Candidate;

@RestController
@RequestMapping("/api/candidate/")
@CrossOrigin
public class CandidateController {
    
	private CandidateService candidateService;
	
	@Autowired
	public CandidateController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}
	
	@RequestMapping("/getall")
	public DataResult<List<Candidate>> getAll() {
		return this.candidateService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(Candidate candidate) {
		return this.candidateService.add(candidate);
	}
	
	@RequestMapping("/getbycandidateıd")
	public DataResult<List<Candidate>> getByCandidateId(int candidateId) {
		return this.candidateService.getByCandidateId(candidateId);
	}
}
