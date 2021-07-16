package kodlamaio.northwind.DataAccess.Abstract;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.Entities.Concrete.SocialNetwork;

public interface SocialNetworkDao extends JpaRepository<SocialNetwork, Integer> {
	
	List<SocialNetwork> getAll();
	List<SocialNetwork> getById(int id);
}
