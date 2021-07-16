package kodlamaio.northwind.Businesss.Abstract;

import java.util.List;

import kodlamaio.northwind.Core.Result.DataResult;
import kodlamaio.northwind.Core.Result.Result;
import kodlamaio.northwind.Entities.Concrete.Candidate;

public interface CandidateService {

	Result add(Candidate candidate);
	Result update(Candidate candidate);
	Result delete(Candidate candidate);
	DataResult<List<Candidate>> getAll();
	DataResult<List<Candidate>> getByCandidateId(int candidateId);

}
