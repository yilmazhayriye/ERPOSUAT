package com.erposUAT.pages;

import com.erposUAT.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(name = "userName")
    public WebElement userNameTextBox;
    @FindBy(name = "password")
    public WebElement passwordTextBox;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement girisYap;


    


    public void LoginForm() {
  String username1= ConfigurationReader.get("username");
  String password1= ConfigurationReader.get("password");
  userNameTextBox.sendKeys(username1);
  passwordTextBox.sendKeys(password1);

    }
}