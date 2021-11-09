package app;

import app.smartphone.Iphone;
import app.smartphone.Samsung;

public class App {
	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
		iphone.setId(1);
		iphone.setName("iphone");
		iphone.setSystem("ios");
		iphone.call();
		System.out.println(iphone.toString());
		
		Samsung samsung = new Samsung();
		samsung.call();
	}
}
