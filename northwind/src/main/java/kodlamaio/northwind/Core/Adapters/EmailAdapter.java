package kodlamaio.northwind.Core.Adapters;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.northwind.FakeService.FakeEmailManager;

public class EmailAdapter implements EmailService{

	@Autowired
	FakeEmailManager fakeEmailManager;
	
	@Override
	public boolean isOkay(String email) {
		return this.fakeEmailManager.isOkay(email);
	}
}
