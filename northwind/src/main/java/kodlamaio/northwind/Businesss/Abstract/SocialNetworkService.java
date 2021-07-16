package kodlamaio.northwind.Businesss.Abstract;

import java.util.List;

import kodlamaio.northwind.Core.Result.DataResult;
import kodlamaio.northwind.Core.Result.Result;
import kodlamaio.northwind.Entities.Concrete.SocialNetwork;

public interface SocialNetworkService {

	Result add(SocialNetwork socialNetwork);
	Result delete(SocialNetwork socialNetwork);
	Result update(SocialNetwork socialNetwork);
	DataResult<List<SocialNetwork>> getAll();
	DataResult<List<SocialNetwork>> getById(int id);
}
