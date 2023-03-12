package test;
import java.util.concurrent.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Lanchchrome 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver","chromedriver.exe");
        WebDriver driver=new ChromeDriver()	;
        driver.get("https://www.simplilearn.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        WebElement login=driver.findElement(By.linkText("Log in"));
        login.click(); 
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input"));
        element.sendKeys("harshavardhanachar5@gmail.com");
        WebElement element1= driver.findElement(By.id("password"));
        element1.sendKeys("Indumathi1@#");
        WebElement Logig1=driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[5]/input"));
        Logig1.click();
        /*WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement confirmationElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("welcome-message")));
        String expectedText = "Welcome, MyUsername!";
		String actualText = confirmationElement.getText();
		assert actualText.equals(expectedText);*/
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        WebElement login1=driver.findElement(By.cssSelector("body > div.body__container > app-root > app-dashboard-layout > app-header > div > div > div > ul > li.profile.dropdown > ul > li:nth-child(8) > a"));
        login1.click();
        }
}
