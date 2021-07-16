package kodlamaio.northwind.Api.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.Businesss.Abstract.SkillService;
import kodlamaio.northwind.Core.Result.DataResult;
import kodlamaio.northwind.Core.Result.Result;
import kodlamaio.northwind.Entities.Concrete.Skill;


@RestController
@RequestMapping("/api/skill")
public class SkillController {

	    private SkillService skillService;
		
		@Autowired
		public SkillController(SkillService skillService) {
			super();
			this.skillService = skillService;
		}
		
		@RequestMapping("/getall")
		public DataResult<List<Skill>> getAll() {
			return this.skillService.getAll();
		}
		
		@PostMapping("/add")
		public Result add(Skill skill) {
			return this.skillService.add(skill);
		}
		
		@RequestMapping("/getbyskillname")
		public DataResult<List<Skill>> getBySkillName(String skillName) {
			return this.skillService.getBySkillName(skillName);
		}
}
