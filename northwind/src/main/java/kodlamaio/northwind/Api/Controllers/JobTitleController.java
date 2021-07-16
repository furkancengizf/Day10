package kodlamaio.northwind.Api.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.Businesss.Abstract.JobTitleService;
import kodlamaio.northwind.Core.Result.DataResult;
import kodlamaio.northwind.Core.Result.Result;
import kodlamaio.northwind.Entities.Concrete.JobTitle;

@RestController
@RequestMapping("/api/jobtitle")
public class JobTitleController {

	    private JobTitleService jobTitleService;
		
		@Autowired
		public JobTitleController(JobTitleService jobTitleService) {
			super();
			this.jobTitleService = jobTitleService;
		}
		
		@RequestMapping("/getall")
		public DataResult<List<JobTitle>> getAll() {
			return this.jobTitleService.getAll();
		}
		
		@PostMapping("/add")
		public Result add(JobTitle jobTitle) {
			return this.jobTitleService.add(jobTitle);
		}
}
