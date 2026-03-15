package com.eci.myproject.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.Before;

public class SearchSteps {

    private WebDriver driver;

    @Before
    public void setUp() {

        ChromeOptions options = new ChromeOptions();
        options.setBinary("/usr/bin/chromium-browser"); // importante
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");

        driver = new ChromeDriver(options);
    }

    @Given("I am on the Google search page")
    public void i_am_on_the_google_search_page() {
        driver.get("https://www.google.com");
    }

    @When("I search for {string}")
    public void i_search_for(String term) {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(term);
        searchBox.submit();
    }

    @Then("I should see {string} in the results")
    public void i_should_see_in_the_results(String term) {
        assert driver.getPageSource().contains(term);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}