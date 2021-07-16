package kodlamaio.northwind.Businesss.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.northwind.Businesss.Abstract.SkillService;
import kodlamaio.northwind.Businesss.Constans.Messages;
import kodlamaio.northwind.Core.Result.DataResult;
import kodlamaio.northwind.Core.Result.Result;
import kodlamaio.northwind.Core.Result.SuccessDataResult;
import kodlamaio.northwind.Core.Result.SuccessResult;
import kodlamaio.northwind.DataAccess.Abstract.SkillDao;
import kodlamaio.northwind.Entities.Concrete.Skill;

public class SkillManager implements SkillService {

	private SkillDao skillDao;
	@Autowired
	public SkillManager(SkillDao skillDao) {
		super();
		this.skillDao = skillDao;
	}
	@Override
	public Result add(Skill skill) {
		this.skillDao.save(skill);
		return new SuccessResult(Messages.SkillAdded);
	}

	@Override
	public Result update(Skill skill) {
		this.skillDao.save(skill);
		return new SuccessResult(Messages.DeleteSuccess);
	}

	@Override
	public Result delete(Skill skill) {
		this.skillDao.save(skill);
		return new SuccessResult(Messages.UpdateSuccess);
	}

	@Override
	public DataResult<List<Skill>> getAll() {
		return new SuccessDataResult<List<Skill>>
		(this.skillDao.findAll(),Messages.DataListed);
	}

	@Override
	public DataResult<List<Skill>> getBySkillName(String skillName) {
		return new SuccessDataResult<List<Skill>>
		(this.skillDao.getBySkillName(skillName),Messages.DataListed);
	}

}
