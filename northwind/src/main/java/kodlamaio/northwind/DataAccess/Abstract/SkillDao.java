package kodlamaio.northwind.DataAccess.Abstract;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.Entities.Concrete.Skill;

public interface SkillDao extends JpaRepository<Skill, Integer> {

	List<Skill> getAll();
	List<Skill> getBySkillName(String skillName);
}
