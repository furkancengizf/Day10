package kodlamaio.northwind.Entities.Concrete;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import kodlamaio.northwind.Entities.Abstract.User;

public class SocialNetwork extends User{
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="social_network_name")
	private String SocialNetworkName;
	
	@Column(name="social_network_account")
	private String SocialNetworkAccount;
	
	
	@JsonIgnoreProperties({"email","password","createdAt","nationalIdentity","dateOfBirth", "confirm"})
    @ManyToOne()
    @JoinColumn(name = "candidate_id")
    private Candidate candidate;

}
