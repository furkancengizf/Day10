package kodlamaio.northwind.Businesss.Abstract;

import java.util.List;

import kodlamaio.northwind.Core.Result.DataResult;
import kodlamaio.northwind.Core.Result.Result;
import kodlamaio.northwind.Entities.Concrete.Language;


public interface LanguageService {

	Result add(Language language);
	Result update(Language language);
	Result delete(Language language);
	DataResult<List<Language>> getAll();
}
