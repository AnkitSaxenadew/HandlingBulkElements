package Handle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleBrowser {

	public static void main(String[] args) throws InterruptedException {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		Thread.sleep(4000);

		driver.findElement(By.xpath("")).click();
		driver.findElement(By.xpath("")).click();
		
		Set<String> sessions = driver.getWindowHandles();
		
		System.out.println(sessions.getClass().getSimpleName());
		System.out.println(sessions);
		
		System.out.println("Total browswe window :"+sessions.size());
		
		Iterator<String> itr = sessions.iterator();
		
		String parentid = itr.next();
		System.out.println(parentid);
		
		String childid = itr.next();
		System.out.println(childid);
		
		driver.switchTo().window(childid);
		driver.findElement(By.linkText("Reporting Overviw")).click();
		
		driver.switchTo().window(parentid);
		
		driver.findElement(By.id("logoutlink")).click();		
		
		 
	}

}
