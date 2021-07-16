package kodlamaio.northwind.Businesss.Concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.northwind.Businesss.Abstract.CandidateService;
import kodlamaio.northwind.Businesss.Constans.Messages;
import kodlamaio.northwind.Core.Result.DataResult;
import kodlamaio.northwind.Core.Result.Result;
import kodlamaio.northwind.Core.Result.SuccessDataResult;
import kodlamaio.northwind.Core.Result.SuccessResult;
import kodlamaio.northwind.DataAccess.Abstract.CandidateDao;
import kodlamaio.northwind.Entities.Concrete.Candidate;

public class CandidateManager implements CandidateService {

	
	private CandidateDao candidateDao;
	@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}
	@Override
	public Result add(Candidate candidate) {
		this.candidateDao.save(candidate);
		return new SuccessResult(Messages.CandidateAdded);
	}

	@Override
	public Result update(Candidate candidate) {
		this.candidateDao.save(candidate);
		return new SuccessResult(Messages.UpdateSuccess);
	}

	@Override
	public Result delete(Candidate candidate) {
		this.candidateDao.save(candidate);
		return new SuccessResult(Messages.DeleteSuccess);
	}

	@Override
	public DataResult<List<Candidate>> getAll() {
		return new SuccessDataResult<List<Candidate>>
		(this.candidateDao.findAll(),Messages.DataListed);
	}
	@Override
	public DataResult<List<Candidate>> getByCandidateId(int candidateId) {
		return new SuccessDataResult<List<Candidate>>
		(this.candidateDao.getByCandidateId(candidateId),Messages.DataListed);
	
	}

}
