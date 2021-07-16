package kodlamaio.northwind.Entities.Concrete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import kodlamaio.northwind.Entities.Abstract.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="language")
public class Language extends User {
      
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="language_name")
	private String languageName;
	
	@JsonIgnoreProperties({"email","password","createdAt","nationalIdentity","dateOfBirth", "confirm"})
    @ManyToOne()
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;
    
}
