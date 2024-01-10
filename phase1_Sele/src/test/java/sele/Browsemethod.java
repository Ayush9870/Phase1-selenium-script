package sele;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browsemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		String title =  driver.getTitle();
		
		System.out.println("the title is :" + title);
		
		String url = driver.getCurrentUrl();
		
		System.out.println("the url is :" + url);
		
		driver.navigate().to("https://www.selenium.dev/downloads/");	
		
		String title1 =  driver.getTitle();
		
		System.out.println("the title1 is :" + title1);
		
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
		