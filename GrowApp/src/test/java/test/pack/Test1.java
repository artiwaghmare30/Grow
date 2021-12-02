package test.pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;

import base.pack.Base;
import pom.pack.HomePage;
import pom.pack.LoginPage;

public class Test1 extends Base{
	private WebDriver driver;
	LoginPage loginpage;
	HomePage homepage;
	@BeforeTest
	
public void lauchbrowser(String browser)
	{
		if(browser.equals("Chrome"));
		{
			driver = openchromebrowser();
		}
	
	if(browser.equals("Firefox"));
	{
		driver = openfirefoxbrowser();
	}
	}
@BeforeClass
	public void lauchapplication(){
	          
		driver.get("https://profile.w3schools.com/");
		loginpage = new LoginPage(driver);
		 homepage = new HomePage(driver);}
@BeforeMethod
	public void LoginToSchool(){
		loginpage.sendusername();
		loginpage.sendpassword();
		loginpage.clickonlogin();}
@Test
public void verifylearningButton() throws InterruptedException{
	Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		homepage.mylearningtab();
		String url = driver.getCurrentUrl();
if(url.equals("https://profile.w3schools.com/")){
	 System.out.println("pass");}
else{
		System.out.println("fail");	}}
@AfterMethod
	public void logOutButton()
	{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	homepage.logouttab();	
	}
@AfterClass()
public void cleanobject()
{
	loginpage=null;
	homepage=null;
		
	}
@AfterTest
public void closebrowser()
{
	driver.quit();
	driver=null;
	System.gc();
}

}
