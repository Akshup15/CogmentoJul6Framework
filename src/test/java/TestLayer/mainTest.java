package TestLayer;

import Page.Homepage;
import Page.Loginpage;
import Page.Pimpage;

public class mainTest {

	public static void main(String []args ) {
		Loginpage login= new Loginpage();
		login.loginFunctionality("Admin", "Admin123");
		
		Homepage homepage = new Homepage();
		homepage.validateLogo();
		
		Pimpage pimpage =new Pimpage();
		pimpage.clickonpimpage();
		
		pimpage.clickOnAddEmployee();
		
		pimpage.createEmployee();
	}
	
}
