package base.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver openchromebrowser()
	{
	System.setProperty("webdriver.chrome.driver","D:\\ARTI\\A Velocity\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	return driver;
}
	public WebDriver openfirefoxbrowser()
	{
	System.setProperty("webdriver.gecko.driver","D:\\ARTI\\A Velocity\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	return driver;
}
}