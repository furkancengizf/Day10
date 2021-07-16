package kodlamaio.northwind.Entities.Concrete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "schoolInfos")
@AllArgsConstructor
@NoArgsConstructor
public class SchoolInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id",nullable = false)
	private int id;
	
    @Column(name="name")
    private String name;
    
    @Column(name="department")
    private String department;
    
    @Column(name="start_date")
    private int startDate;
    
    @Column(name="graduation_date")
    private int graduationDate;
    
  @JsonIgnoreProperties({"email","password","createdAt","nationalIdentity","dateOfBirth", "confirm"})
      @ManyToOne()
      @JoinColumn(name = "candidate_id")
      private Candidate candidate;
      
}
    