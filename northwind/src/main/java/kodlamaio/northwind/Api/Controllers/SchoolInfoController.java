package kodlamaio.northwind.Api.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.Businesss.Abstract.SchoolInfoService;
import kodlamaio.northwind.Core.Result.DataResult;
import kodlamaio.northwind.Core.Result.Result;
import kodlamaio.northwind.Entities.Concrete.SchoolInfo;


@RestController
@RequestMapping("/api/schoolınfo")
public class SchoolInfoController {

	    private SchoolInfoService schoolInfoService;
		
		@Autowired
		public SchoolInfoController(SchoolInfoService schoolInfoService) {
			super();
			this.schoolInfoService = schoolInfoService;
		}
		
		@RequestMapping("/getall")
		public DataResult<List<SchoolInfo>> getAll() {
			return this.schoolInfoService.getAll();
		}
		
		@PostMapping("/add")
		public Result add(SchoolInfo schoolInfo) {
			return this.schoolInfoService.add(schoolInfo);
		}
		
		@RequestMapping("/getbygraduationdate")
		public DataResult<List<SchoolInfo>> getByGraduationDate(int graduationDate) {
			return this.schoolInfoService.getByGraduationDate(graduationDate);
		}
}
