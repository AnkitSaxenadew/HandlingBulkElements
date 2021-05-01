package Handle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wantanything {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/ANKIT/Desktop/lastest.html");
		
		driver.manage().window().maximize();
		//get title of the page
            String title = driver.getTitle();
            System.out.println(title);
       //get html source code      
            String html = driver.getPageSource();
            
            System.out.println(html);
      //click on link and get the url after clicking on the url      
            driver.findElement(By.linkText("Selenium")).click();
            
            String url = driver.getCurrentUrl();
            System.out.println(url);
	}  

}
