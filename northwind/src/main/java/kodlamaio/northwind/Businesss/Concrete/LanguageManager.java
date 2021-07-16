package kodlamaio.northwind.Businesss.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.northwind.Businesss.Abstract.LanguageService;
import kodlamaio.northwind.Businesss.Constans.Messages;
import kodlamaio.northwind.Core.Result.DataResult;
import kodlamaio.northwind.Core.Result.Result;
import kodlamaio.northwind.Core.Result.SuccessDataResult;
import kodlamaio.northwind.Core.Result.SuccessResult;
import kodlamaio.northwind.DataAccess.Abstract.LanguageDao;
import kodlamaio.northwind.Entities.Concrete.Language;

public class LanguageManager implements LanguageService {

	private LanguageDao languageDao;
	@Autowired
	public LanguageManager(LanguageDao languageDao) {
		super();
		this.languageDao = languageDao;
	}
	
	@Override
	public Result add(Language language) {
		this.languageDao.save(language);
		return new SuccessResult(Messages.LanguageAdded);
	}

	@Override
	public Result update(Language language) {
		this.languageDao.save(language);
		return new SuccessResult(Messages.DeleteSuccess);
	}

	@Override
	public Result delete(Language language) {
		this.languageDao.save(language);
		return new SuccessResult(Messages.UpdateSuccess);
	}
	@Override
	public DataResult<List<Language>> getAll() {
		return new SuccessDataResult<List<Language>>
		(this.languageDao.findAll(),Messages.DataListed);
	}

}
