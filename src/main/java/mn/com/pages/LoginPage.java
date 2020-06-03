package mn.com.pages;

import org.openqa.selenium.By;
import mn.com.base.Pages;

public class LoginPage extends Pages{
	
	
	public void doLogin (String email) {
		
		//EGit mm
		driver.findElement(By.xpath("//*[@id=\"login_id\"]")).sendKeys("nithraj7@gmail.com");
		driver.findElement(By.id("nextbtn")).click();
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("nithsonu");
		driver.findElement(By.xpath("//*[@id=\"nextbtn\"]/span")).click();
		
	}

}
