package kodlamaio.northwind.DataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.Entities.Concrete.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {

}
