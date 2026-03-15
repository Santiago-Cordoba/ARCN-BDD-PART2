package com.eci.myproject.steps;

import com.eci.myproject.pages.DropdownPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertEquals;

public class DropdownSteps {

    private WebDriver driver;
    private DropdownPage dropdownPage;

    @Before
    public void setUp() {

        ChromeOptions options = new ChromeOptions();

        options.setBinary("/usr/bin/google-chrome");

        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");

        driver = new ChromeDriver(options);

        dropdownPage = new DropdownPage(driver);
    }

    @Given("I am on the dropdown page")
    public void i_am_on_the_dropdown_page() {
        dropdownPage.openPage();
    }

    @When("I select {string} from the dropdown")
    public void i_select_from_the_dropdown(String option) {
        dropdownPage.selectOption(option);
    }

    @Then("I should see {string} selected")
    public void i_should_see_selected(String expected) {
        assertEquals(expected, dropdownPage.getSelectedOption());
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}