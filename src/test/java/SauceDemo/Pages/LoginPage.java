package SauceDemo.Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import SauceDemo.Steps.Hook;

public class LoginPage extends Hook {
    public LoginPage() {
        PageFactory.initElements(Hook.driver, this);
    }


    @FindBy(id = "user-name")
    public static WebElement username;

    @FindBy(id = "password")
    public  static WebElement pass;

    @FindBy(id = "login-button")
    public  static WebElement button;

    @FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3")
    public static WebElement error;

}