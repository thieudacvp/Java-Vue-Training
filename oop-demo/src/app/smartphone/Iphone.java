package app.smartphone;

import app.service.PhoneService;

public class Iphone extends SmartPhone implements PhoneService{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("call by Iphone");
	}

}
