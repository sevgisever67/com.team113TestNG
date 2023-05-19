package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ZeroPage {

    public ZeroPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

  @FindBy(id="signin_button")
  public WebElement signInButton;

  @FindBy(id="user_login")
    public WebElement userNameButton;

  @FindBy(id="user_password")
    public WebElement passworsButton;

  @FindBy(xpath = "//input[@value='Sign in']")
    public WebElement signInKayitButton;




}

