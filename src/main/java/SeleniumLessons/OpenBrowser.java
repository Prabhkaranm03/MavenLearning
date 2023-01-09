package SeleniumLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		/*WebElement searchbox = driver.findElement(By.xpath("//*[@id=\'input\']"));
		searchbox.sendKeys("imdb");
		searchbox.submit();*/
		System.out.println(driver.getTitle());
		driver.close();
	}

}
		