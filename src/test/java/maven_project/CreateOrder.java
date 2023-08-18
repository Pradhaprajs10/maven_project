package maven_project;

import org.testng.annotations.Test;

public class CreateOrder {
	
	@Test(groups="smoke")
	public void createOrder() {
		System.out.println("order was created");
	}

}
