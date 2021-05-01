package Handle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Differencebtwn {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/ANKIT/Desktop/code.html");

		driver.manage().window().maximize();
		//find element method
		try 
		{
		 driver.findElement(By.tagName("span"));	
		} 
		
		catch (Exception e)
		{
			System.out.println("Elements not present in html doc");
		}

		//find Elements method
		List<WebElement> wbs = driver.findElements(By.tagName("span"));
		boolean flag = wbs.isEmpty();
		
		System.out.println(flag);
		
		if (flag)   //true
		{
			System.out.println("Empty list:"+wbs.size());
		}
		
		else  //false
		{
			System.out.println("List not empty:"+wbs.size());
		}
	}

}






