package sele;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class locatorclasstagname {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.com/");
		
		driver.manage().window().maximize();
		
		// find the element Source using tagname locator
		// Note: Selenium will find the first element with the tag value as input and enter the input
		
		driver.findElement(By.tagName("input")).sendKeys("Paris");
		
					Thread.sleep(1500);
		// find the element Destination using className locator
		
		driver.findElement(By.className("sc-jlyJG kxRJeL")).sendKeys("London");


	}

}
