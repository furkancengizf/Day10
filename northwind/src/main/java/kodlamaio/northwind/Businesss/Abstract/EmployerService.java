package kodlamaio.northwind.Businesss.Abstract;

import java.util.List;

import kodlamaio.northwind.Core.Result.DataResult;
import kodlamaio.northwind.Core.Result.Result;
import kodlamaio.northwind.Entities.Concrete.Employer;

public interface EmployerService {

	Result add(Employer employer);
	Result update(Employer employer);
	Result delete(Employer employer);
	DataResult<List<Employer>> getAll();
	DataResult<List<Employer>> getByEmployerId(int employerId);
	DataResult<List<Employer>> getByCompanyName(String companyName);
	
}
