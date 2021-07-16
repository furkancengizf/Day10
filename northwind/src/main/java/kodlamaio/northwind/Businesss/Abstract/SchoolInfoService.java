package kodlamaio.northwind.Businesss.Abstract;

import java.util.List;

import kodlamaio.northwind.Core.Result.DataResult;
import kodlamaio.northwind.Core.Result.Result;
import kodlamaio.northwind.Entities.Concrete.SchoolInfo;


public interface SchoolInfoService {

	Result add(SchoolInfo schoolInfo);
	Result update(SchoolInfo schoolInfo);
	Result delete(SchoolInfo schoolInfo);
	DataResult<List<SchoolInfo>> getAll();
	DataResult<List<SchoolInfo>> getByGraduationDate(int graduationDate);
}
