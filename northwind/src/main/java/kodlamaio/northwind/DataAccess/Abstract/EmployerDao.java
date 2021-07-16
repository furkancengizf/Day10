package kodlamaio.northwind.DataAccess.Abstract;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.Entities.Concrete.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

	List<Employer> getAll();
	List<Employer> getByEmployerId(int employerId);
	List<Employer> getByCompanyName(String companyName);
}
