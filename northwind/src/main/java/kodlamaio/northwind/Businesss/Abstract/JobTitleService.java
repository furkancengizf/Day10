package kodlamaio.northwind.Businesss.Abstract;

import java.util.List;

import kodlamaio.northwind.Core.Result.DataResult;
import kodlamaio.northwind.Core.Result.Result;
import kodlamaio.northwind.Entities.Concrete.JobTitle;

public interface JobTitleService {

	Result add(JobTitle jobTitle);
	Result update(JobTitle jobTitle);
	Result delete(JobTitle jobTitle);
	DataResult<List<JobTitle>> getAll();
}
