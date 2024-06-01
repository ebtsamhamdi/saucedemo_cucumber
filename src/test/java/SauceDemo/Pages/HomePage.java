package SauceDemo.Pages;

import SauceDemo.Steps.Hook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Hook {
    public HomePage (){
        PageFactory.initElements(Hook.driver,this);
    }

    @FindBy(id = "inventory_container")
    public static WebElement inventory;


}
