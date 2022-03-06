package com.erposUAT.pages;

import com.erposUAT.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    Faker fk = new Faker();

    @FindBy(xpath = "//em[@class='fa fa-home fa-1x']")
    public WebElement homePage;

    @FindBy(xpath = "//button[@class='btn btn-default btn-md p-0 btn-block textcolor far fa-shopping-cart fa-w-18 customerButton buttonbackground  btn btn-secondary']")
    public WebElement satişIade;

}