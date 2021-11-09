package app.smartphone;

import app.service.PhoneService;

public class Nokia extends SmartPhone implements PhoneService{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("call by Nokia");
	}
}
