package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		List<WebElement> Rows = driver.findElements(By.cssSelector("table#customers>tbody>tr"));
		System.out.println("Total no of rows are " + Rows.size());
		List<WebElement> Columns = driver.findElements(By.xpath("//table[@id='customers']//th"));
		System.out.println("Total no of columns are " + Columns.size());
		WebElement data = driver.findElement(By.xpath("//table[@id='customers']//tr[4]/td[1]"));
		System.out.println("The data is " + data.getText());
		for (int i = 2; i <= Rows.size(); i++) {

			List<WebElement> ColumnsData = driver
					.findElements(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td"));

			System.out.println(ColumnsData.get(0).getText() + " " + ColumnsData.get(1).getText() + " "
					+ ColumnsData.get(2).getText());
		}

		driver.quit();
	}
}
