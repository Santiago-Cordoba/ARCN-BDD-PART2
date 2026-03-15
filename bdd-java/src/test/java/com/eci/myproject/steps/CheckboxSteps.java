package com.eci.myproject.steps;

import com.eci.myproject.pages.CheckboxPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertTrue;

public class CheckboxSteps {

    WebDriver driver;
    CheckboxPage checkboxPage;

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

        checkboxPage = new CheckboxPage(driver);
    }

    @Given("I open the checkboxes page")
    public void openCheckboxPage(){
        checkboxPage.openPage();
    }

    @When("I select the first checkbox")
    public void selectCheckbox(){
        checkboxPage.selectFirstCheckbox();
    }

    @Then("the first checkbox should be selected")
    public void verifyCheckbox(){
        assertTrue(checkboxPage.isCheckboxSelected());
    }

    @After
    public void tearDown(){
        driver.quit();
    }
}