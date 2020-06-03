package mn.com.pages;

import org.openqa.selenium.By;
import mn.com.base.Pages;

public class ZohoAppsPage extends Pages{

	public void goToCRM() {
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[6]/div[1]/a[1]/div[1]")).click();
	}
	
	public void goToCampaings() {
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[3]/div[1]/a[1]/div[1]")).click();
	}

	public void goToConnect() {
	
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[5]/div[1]/a[1]/div[1]")).click();
}
}


