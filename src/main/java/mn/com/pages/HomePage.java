package mn.com.pages;

import org.openqa.selenium.By;
import mn.com.base.Pages;

public class HomePage extends Pages{
	
	public void goToCustomers() {
		
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/a[1]")).click();
	}

	public void goToSupport() {
		
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/a[2]")).click();
	}

	public void goToContactSales() {
	
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/a[3]")).click();
	}

	public void goToLogin() {
	
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/a[4]")).click();
	}

	public void goToSignUp() {
	
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/a[5]")).click();
	}
}
