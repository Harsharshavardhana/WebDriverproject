package test;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class logintestcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver","chromedriver.exe");
        WebDriver driver=new ChromeDriver()	;
        driver.get("https://www.replicon.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        WebElement login=driver.findElement(By.linkText("Login"));
        login.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        WebElement cmpname = driver.findElement(By.id("CompanyNameTextBox"));
        cmpname.sendKeys("DiagnosysSystems");
        WebElement next=driver.findElement(By.id("NextButton"));
        next.click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#LoginNameTextBox"))).sendKeys("Harshavardhana.khagarajachar");
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#PasswordTextBox"))).sendKeys("Indumathi1@#");
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.cssSelector("#LoginButton"))).click();
        //String gg=new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.id("presistentErrorMessage"))).getText();
        //String ee ="We didn't recognize the User Name or Password you entered. Passwords are case sensitive, please check your CAPS lock key.";
        //System.out.println(gg);
        //String  e ="The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
        //WebElement RemMe = driver.findElement(By.className(""));
		//RemMe.click()
        /*if(gg.equals(ee))
        {
        System.out.println("test passed");
        }
        else
        {
        	System.out.println("test failed");
        }
        
        /*List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println("total numbe of links  "+link.size());
		System.out.println("total numbe of links  "+link);
		for (WebElement x:link) {
			String i = x.getAttribute("href");
			System.out.println(i);
		}*/
        driver.quit();     
        //driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
        //WebElement logout=driver.findElement(By.tagName("Logout"));
        //logout.click();
	}
}
