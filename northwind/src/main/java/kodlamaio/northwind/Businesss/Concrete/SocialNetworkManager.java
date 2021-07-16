package kodlamaio.northwind.Businesss.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.northwind.Businesss.Abstract.SocialNetworkService;
import kodlamaio.northwind.Businesss.Constans.Messages;
import kodlamaio.northwind.Core.Result.DataResult;
import kodlamaio.northwind.Core.Result.Result;
import kodlamaio.northwind.Core.Result.SuccessDataResult;
import kodlamaio.northwind.Core.Result.SuccessResult;
import kodlamaio.northwind.DataAccess.Abstract.SocialNetworkDao;
import kodlamaio.northwind.Entities.Concrete.SocialNetwork;

public class SocialNetworkManager implements SocialNetworkService {

	private SocialNetworkDao socialNetworkDao;
	@Autowired
	public SocialNetworkManager(SocialNetworkDao socialNetworkDao) {
		super();
		this.socialNetworkDao = socialNetworkDao;
	}
	
	@Override
	public Result add(SocialNetwork socialNetwork) {
		this.socialNetworkDao.save(socialNetwork);
		return new SuccessResult(Messages.SocialNetworkAdded);
	}

	@Override
	public Result delete(SocialNetwork socialNetwork) {
		this.socialNetworkDao.save(socialNetwork);
		return new SuccessResult(Messages.DeleteSuccess);
	}

	@Override
	public Result update(SocialNetwork socialNetwork) {
		this.socialNetworkDao.save(socialNetwork);
		return new SuccessResult(Messages.UpdateSuccess);
	}

	@Override
	public DataResult<List<SocialNetwork>> getAll() {
		return new SuccessDataResult<List<SocialNetwork>>
		(this.socialNetworkDao.findAll(),Messages.DataListed);
	}

	@Override
	public DataResult<List<SocialNetwork>> getById(int id) {
		return new SuccessDataResult<List<SocialNetwork>>
		(this.socialNetworkDao.getById(id),Messages.DataListed);
	}

}
