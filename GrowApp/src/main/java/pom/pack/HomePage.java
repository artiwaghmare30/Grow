package pom.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//a[text()='My learning']")
	private WebElement learning;
	
	@FindBy(xpath="//button[@title='Log out']")
	private WebElement logout;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void mylearningtab()
	{
	
		learning.click();
	}
	public void logouttab()
	{
		logout.click();
	}
	}
