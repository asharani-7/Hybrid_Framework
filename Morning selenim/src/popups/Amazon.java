package popups;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		driver.get("https://www.amazon.com/");
		Thread.sleep(1000);
		for(int i=1;i<3;i++);
		{
			jse.executeScript("window.scrollBy(0,500)");
			Thread.sleep(1000);
		}
		for(int i=1;i<3;i++);
		{
			jse.executeScript("window.scrollBy(0,-500)");	 
			Thread.sleep(1000);
		}
	}
}