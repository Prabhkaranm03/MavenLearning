package SeleniumLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("imdb"+Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\'rso\']/div[1]/div/div/div/div/div/div/div[1]/a")).click();
		System.out.println(driver.getTitle());
		driver.close();
	}

}
		