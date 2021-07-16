package kodlamaio.northwind.DataAccess.Abstract;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.Entities.Concrete.SchoolInfo;

public interface SchoolInfoDao extends JpaRepository<SchoolInfo, Integer>{

	List<SchoolInfo> getAll();
	List<SchoolInfo> getByGraduationDate(int graduationDate);
}
