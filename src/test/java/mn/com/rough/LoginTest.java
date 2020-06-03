package mn.com.rough;

import mn.com.pages.HomePage;
import mn.com.pages.LoginPage;
import mn.com.pages.ZohoAppsPage;

public class LoginTest {

	public static void main(String[] args) {
		
		HomePage home = new HomePage();
		home.goToLogin();
		
		LoginPage login = new LoginPage();
		login.doLogin("nithraj7@gmail.com");
		
		ZohoAppsPage app = new ZohoAppsPage ();
		app.goToCRM();
		
	}
}
