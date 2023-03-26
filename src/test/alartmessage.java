package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alartmessage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		/*
		 * ebElement but =driver.findElement(By.id("alertButton")); but.click(); Alert
		 * obj = driver.switchTo().alert(); Thread.sleep(3000); obj.accept();
		 * driver.close();
		 */

		WebElement element = driver.findElement(By.id("alertButton"));
		element.click();

		Alert obj = driver.switchTo().alert();
		Thread.sleep(2000);
		obj.accept();

		WebElement element1 = driver.findElement(By.id("timerAlertButton"));
		element1.click();
		Thread.sleep(5000);
		obj = driver.switchTo().alert();
		Thread.sleep(2000);
		obj.accept();
		driver.close();
	}

}
