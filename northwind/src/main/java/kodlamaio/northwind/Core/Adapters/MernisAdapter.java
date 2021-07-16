package kodlamaio.northwind.Core.Adapters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.FakeService.FakeMernisManager;

@Service
public class MernisAdapter implements MernisService {

	 @Autowired
	 FakeMernisManager fakeMernisManager;
	 
	 @Override
	 public boolean isOkay(String identityNumber) {
		 return this.fakeMernisManager.isOkay(identityNumber);
	 }
}
