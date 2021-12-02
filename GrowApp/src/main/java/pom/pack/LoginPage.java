package pom.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
   @FindBy(xpath="//input[@name='email']")
    private WebElement username;
   
   @FindBy(xpath="//input[@type='password']")
   private WebElement password;
   
   @FindBy(xpath="//button[@class='_1VfsI _OD95i _3_H0V']")
   private WebElement login;
   
   public LoginPage(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
   public void sendusername()
   {
	 username.sendKeys("biswajit_infotech@yahoo.co.in");  
   }
   public void sendpassword()
   {
	   password.sendKeys("Biswajitsatapathy@123");
   }
   public void clickonlogin()
   {
	   login.click();
   }
}
