package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver","chromedriver.exe");
        WebDriver driver=new ChromeDriver()	;
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
        WebElement from =driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
        WebElement to =driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
        WebElement scrole =driver.findElement(By.xpath("//*[@id=\"credit\"]/a"));
        
      //*[@id="credit"]/a
        /*JavascriptExecutor obj1 =(JavascriptExecutor) driver;
		obj1.executeScript("arguments[0].scrollIntoView();",scrole);
		Thread.sleep(3000);*/
		
        Actions obj =new Actions(driver);
        Thread.sleep(3000);
        /*obj.dragAndDrop(from, to).build().perform();
        Thread.sleep(3000);
        driver.quit(); */
        obj.sendKeys(Keys.PAGE_DOWN);
        obj.moveToElement(from).build().perform();
        Thread.sleep(3000);
        obj.dragAndDrop(from,to).build().perform();
        //Thread.sleep(3000);
        driver.quit();
        }

}
