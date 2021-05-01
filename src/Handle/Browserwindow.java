package Handle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

import javax.management.StringValueExp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserwindow {

	public static void main(String[] args) {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		
		System.setProperty(key, value);
		WebDriver driver=new ChromeDriver();

		//using window handle get session id
		   //String sessionid = driver.getWindowHandle();
		   //System.out.println(sessionid);
		
		//handle multiple browser window
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("xyz");
		hs.add("aaa");
		hs.add("abc");
		System.out.println(hs);
		System.out.println(hs.size());
		
		for (String value1:hs)
		{
			System.out.println(value1);
		}
		
	     LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		
		lhs.add("XYZ");
		lhs.add("AAA");
		lhs.add("ABC");
		System.out.println(lhs);
		System.out.println(lhs.size());
		
		Iterator<String> itr=hs.iterator();
		
	   while (itr.hasNext()) 
	   {
		String value2 = itr.next();
		System.out.println(value2);
		
	}
	    
		
	}

}













