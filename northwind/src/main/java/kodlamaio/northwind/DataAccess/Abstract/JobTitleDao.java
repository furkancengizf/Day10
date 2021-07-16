package kodlamaio.northwind.DataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.Entities.Concrete.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle, Integer> {

}
