package kodlamaio.northwind.Api.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.Businesss.Abstract.SocialNetworkService;
import kodlamaio.northwind.Core.Result.DataResult;
import kodlamaio.northwind.Core.Result.Result;
import kodlamaio.northwind.Entities.Concrete.SocialNetwork;

@RestController
@RequestMapping("/api/socialnetwork")
public class SocialNetworkController {
	
	private SocialNetworkService socialNetworkService;
	@Autowired
	public SocialNetworkController(SocialNetworkService socialNetworkService) {
		super();
		this.socialNetworkService = socialNetworkService;
	}
    
	@RequestMapping("/getall")
	public DataResult<List<SocialNetwork>> getAll() {
		return this.socialNetworkService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(SocialNetwork socialNetwork) {
		return this.socialNetworkService.add(socialNetwork);
	}
	
	@RequestMapping("/getById")
	public DataResult<List<SocialNetwork>> getById(int id) 	{
		return this.socialNetworkService.getById(id);
	}
}