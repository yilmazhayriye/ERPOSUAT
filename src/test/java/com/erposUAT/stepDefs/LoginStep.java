package com.erposUAT.stepDefs;

import com.erposUAT.pages.LoginPage;
import com.erposUAT.utilities.BrowserUtils;
import com.erposUAT.utilities.ConfigurationReader;
import com.erposUAT.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginStep {

    LoginPage loginPage=new LoginPage();
    WebDriver driver = Driver.get();

    @Given("User navigates to Login Page")
    public void user_navigates_to_Login_Page() {
       driver.get(ConfigurationReader.get("url"));
    }

    @When("User types valid {string} and {string}")
    public void user_types_valid_and(String username, String password) {
        BrowserUtils.waitFor(2);
        loginPage.LoginForm();
    }

    @When("User click to login button")
    public void user_click_to_login_button() {
        BrowserUtils.waitFor(2);
       BrowserUtils.clickWithJS(loginPage.girisYap);
    }
}
