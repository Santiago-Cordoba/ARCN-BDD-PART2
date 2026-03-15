package com.eci.myproject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="username")
    WebElement usernameField;

    @FindBy(id="password")
    WebElement passwordField;

    @FindBy(css="button[type='submit']")
    WebElement loginButton;

    @FindBy(id="flash")
    WebElement successMessage;

    public void openPage(){
        driver.get("https://the-internet.herokuapp.com/login");
    }

    public void login(String username, String password){
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    public boolean isLoginSuccessful(){
        return successMessage.getText().contains("You logged into a secure area!");
    }
}