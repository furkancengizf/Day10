package kodlamaio.northwind.DataAccess.Abstract;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.Entities.Concrete.Candidate;

public interface CandidateDao extends JpaRepository<Candidate, Integer>{
 
	List<Candidate> getAll();
	List<Candidate> getByCandidateId(int candidateId);
}
