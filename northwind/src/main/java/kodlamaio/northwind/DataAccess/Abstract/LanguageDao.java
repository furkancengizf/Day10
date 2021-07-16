package kodlamaio.northwind.DataAccess.Abstract;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.Entities.Concrete.Language;

public interface LanguageDao extends JpaRepository<Language, Integer> {

}
