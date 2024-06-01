package SauceDemo.Steps;

import SauceDemo.Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import SauceDemo.Pages.LoginPage;
import org.testng.Assert;



public class LoginSteps {


    private LoginPage loginPage = new LoginPage();
    private HomePage homepage = new HomePage();


    @Given("I enter valid {string} and {string}")
    public void i_enter_valid_and(String username, String password) {
        LoginPage.username.sendKeys(username);
        LoginPage.pass.sendKeys(password);
    }


    @When("I click the login button")
    public void i_click_the_login_button() {
        LoginPage.button.click();
    }

    @Then("I should be redirected to the inventory page")
    public void i_should_be_redirected_to_the_inventory_page() {
        String Expected = Hook.driver.getCurrentUrl();
        System.out.println(Expected);

        String Actual ="https://www.saucedemo.com/";
        System.out.println(Actual);

        Assert.assertNotEquals(Expected,Actual,"Faild Login");
        }



    }






