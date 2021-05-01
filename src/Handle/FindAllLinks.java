package Handle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindAllLinks {

	public static <display> void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.istqb.in/");

		driver.manage().window().maximize();
		// total links on the page
		
		List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		
		System.out.println(alllinks.getClass().getSimpleName());
		
		int count = alllinks.size();
		System.out.println("Total links:"+count);
		
		//total links name on the page
		
		//for (int i = 0; i < count; i++) 
		{
			//WebElement link = alllinks.get(i);
			//String linktext = alllinks.get(i).getText();
		    //System.out.println(linktext);
			
			//String linktext = link.getText();
			//System.out.println(linktext);
		}
        int display count=0;
        
		for (int i = 0; i < count; i++)
		{
			WebElement link = alllinks.get(i);
			boolean flag = link.isDisplayed();
			
			if (flag)       //true
			{
				display count++;
				System.out.println();
			}
		}
		
		
		
		
		
	}

}













