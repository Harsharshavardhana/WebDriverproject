package test;

import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucedemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chromedriver","chromedriver.exe");
		WebDriver Driver =new ChromeDriver();
		Driver.get("https://www.saucedemo.com/");
		WebElement username=Driver.findElement(By.xpath("//*[@placeholder=\'Username\']"));
		username.sendKeys("standard_user");
		System.out.println("enter 0 for pass test case esle 1 for negative test case ");
	    //this code both postive and nwgative case	
		try (Scanner input = new Scanner(System.in)) {
			int x =input.nextInt();
			if(x==0) {
			WebElement pass=Driver.findElement(By.xpath("//*[@placeholder=\'Password\']"));
			pass.sendKeys("secret_sauce");
			WebElement login=Driver.findElement(By.xpath("//*[@data-test='login-button']"));
			login.click();
			WebElement vmsg=Driver.findElement(By.xpath("//*[@class='app_logo']"));
			String  get =vmsg.getText();
			System.out.println(get);
			String gg = "Swag Labs";
			if (vmsg.isDisplayed() && get.equals(gg))
			{
				System.out.println("test_passed");
			}
			else
			{
				
				System.out.println("test_Failed");
			}
			}
			else {
				WebElement pass=Driver.findElement(By.xpath("//*[@placeholder=\'Password\']"));
				pass.sendKeys("1234567890");
				WebElement login=Driver.findElement(By.xpath("//*[@data-test='login-button']"));
				login.click();
				WebElement vmsg=Driver.findElement(By.xpath("//*[@id='login_button_container']"));
				String  get =vmsg.getText();
				System.out.println(get);
				String ee="Epic sadface: Username and password do not match any user in this service";
				if (vmsg.isDisplayed() && get.equals(ee))
				{
					System.out.println("test_passed");
				}
				else
				{
					
					System.out.println("test_Failed");
				}
			}
		}
		Driver.quit();
        
	}

}
