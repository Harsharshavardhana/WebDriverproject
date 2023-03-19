package test;

import java.nio.channels.SelectionKey;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fbsignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver","chromedriver.exe");
        WebDriver driver=new ChromeDriver()	;
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-testid='open-registration-form-button']"))).click();
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='firstname']"))).sendKeys("xyz");
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='lastname']"))).sendKeys("abcd");
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='reg_email__']"))).sendKeys("7897944464");
        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='reg_passwd__']"))).sendKeys("xx@12345");
        WebElement difday=driver.findElement(By.xpath("//*[@title='Day']/option[@selected=\"1\"]"));
        System.out.println("difuclt day"+difday.getText());
        WebElement day=driver.findElement(By.xpath("//*[@title='Day']"));
        Select day1=new Select(day);
        day1.selectByVisibleText("10");
        WebElement month=driver.findElement(By.xpath("//*[@title='Month']"));
        Select month1=new Select(month);
        month1.selectByVisibleText("Jun");
        WebElement year=driver.findElement(By.xpath("//*[@title='Year']"));
        Select year1=new Select(year);
        year1.selectByVisibleText("1996");
        String Gender = "Male";
        String genderXpath = "//label[text()='placeholder']";
		String newXpath = genderXpath.replace("placeholder", Gender);
		WebElement genderElem = driver.findElement(By.xpath(newXpath));
		genderElem.click();   
    
        WebElement submit=driver.findElement(By.xpath("//*[@name='websubmit']"));
        submit.click(); 
      
        List<WebElement> link=driver.findElements(By.xpath("//*[@title='Month']"));
        for(WebElement value:link)
        {
        	System.out.println(value.getText());
        }
        driver.quit();
	}
	
	
}
