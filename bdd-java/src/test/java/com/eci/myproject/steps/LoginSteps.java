package com.eci.myproject.steps;

import com.eci.myproject.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertTrue;

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;

    @Before
    public void setUp(){

        ChromeOptions options = new ChromeOptions();

        options.setBinary("/usr/bin/google-chrome");

        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");

        driver = new ChromeDriver(options);

        loginPage = new LoginPage(driver);
    }

    @Given("I open the login page")
    public void openLoginPage(){
        loginPage.openPage();
    }

    @When("I enter valid username and password")
    public void enterCredentials(){
        loginPage.login("tomsmith", "SuperSecretPassword!");
    }

    @And("I click the login button")
    public void clickLoginButton(){
        // ya se ejecuta dentro del login()
    }

    @Then("I should see the secure area")
    public void verifyLogin(){
        assertTrue(loginPage.isLoginSuccessful());
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}