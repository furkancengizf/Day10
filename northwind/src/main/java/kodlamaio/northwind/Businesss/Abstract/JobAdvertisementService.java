package kodlamaio.northwind.Businesss.Abstract;

import java.util.List;

import kodlamaio.northwind.Core.Result.DataResult;
import kodlamaio.northwind.Core.Result.Result;
import kodlamaio.northwind.Entities.Concrete.JobAdvertisement;


public interface JobAdvertisementService {
 
	Result add(JobAdvertisement jobAdvertisement);
	Result update(JobAdvertisement jobAdvertisement);
	Result delete(JobAdvertisement jobAdvertisement);
	DataResult<List<JobAdvertisement>> getAll();

}
