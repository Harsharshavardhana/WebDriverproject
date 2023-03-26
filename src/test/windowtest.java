package test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		WebElement newTab = driver.findElement(By.id("tabButton"));

		String PaerentWin = driver.getWindowHandle();
		System.out.println("Parent win is " + PaerentWin);

		newTab.click();

		Set<String> AllWin = driver.getWindowHandles();
		String childWin = "";

		for (String win : AllWin) {

			System.out.println("The win ID is " + win);

			if (!win.equals(PaerentWin)) {

				childWin = win;
			}
		}

		System.out.println("Child win is " + childWin);
		driver.switchTo().window(childWin);
		WebElement childHeader = driver.findElement(By.id("sampleHeading"));
		System.out.println("Header in child win is " + childHeader.getText());
		driver.close();

		// clik second window
		System.out.print("second window");
		driver.switchTo().window(PaerentWin);
		WebElement newTab1 = driver.findElement(By.id("windowButton"));
		String PaerentWin1 = driver.getWindowHandle();
		System.out.println("Parent win is " + PaerentWin1);
		newTab1.click();
		Set<String> AllWin1 = driver.getWindowHandles();
		String childWin1 = "";

		for (String win1 : AllWin1) {

			System.out.println("The win ID is " + win1);

			if (!win1.equals(PaerentWin1)) {

				childWin1 = win1;
			}
		}

		System.out.println("Child win is " + childWin1);
		System.out.println("Child win is " + childWin1);
		driver.switchTo().window(childWin1);
		WebElement childHeader1 = driver.findElement(By.id("sampleHeading"));
		System.out.println("Header in child win is " + childHeader1.getText());

		driver.quit();

	}

}
