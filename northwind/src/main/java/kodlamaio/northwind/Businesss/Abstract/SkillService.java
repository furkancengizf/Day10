package kodlamaio.northwind.Businesss.Abstract;

import java.util.List;

import kodlamaio.northwind.Core.Result.DataResult;
import kodlamaio.northwind.Core.Result.Result;
import kodlamaio.northwind.Entities.Concrete.Skill;


public interface SkillService {

	Result add(Skill skill);
	Result update(Skill skill);
	Result delete(Skill skill);
	DataResult<List<Skill>> getAll();
	DataResult<List<Skill>> getBySkillName(String skillName);
}
