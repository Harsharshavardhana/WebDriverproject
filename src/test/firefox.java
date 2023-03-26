package test;

import java.util.concurrent.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.geckodriver", "gekodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		WebElement login = driver.findElement(By.linkText("Log in"));
		login.click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		WebElement element = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input"));
		element.sendKeys("harshavardhanachar5@gmail.com");
		WebElement element1 = driver.findElement(By.id("password"));
		element1.sendKeys("Indumathi1@#");
		WebElement Logig1 = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[5]/input"));
		Logig1.click();

	}
}
