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
@NoArgsConstructor
@AllArgsConstructor
@Table(name="skills")
public class Skill {
  
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="id")
     private int id;
     
     
     @Column(name="name")
     private String name;
     
    
     @JsonIgnoreProperties({"email","password","createdAt","nationalIdentity","dateOfBirth", "confirm"})
     @ManyToOne()
     @JoinColumn(name = "candidate_id")
     private Candidate candidate;
    
}