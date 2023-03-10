package com.library.step_definitions;

import com.library.pages.UsersPage_JI;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Collections;
import java.util.List;

public class US61_StepDefs_JI {

    UsersPage_JI usersPage_ji = new UsersPage_JI();

    @Given("I am on the login page")
    public void ı_am_on_the_login_page() {
        usersPage_ji.webPage();


    }

    @Given("I login as a librarian")
    public void ı_login_as_a_librarian() {
        usersPage_ji.login("librarian");
    }

    @When("I click on Users link")
    public void ı_click_on_link() {
        usersPage_ji.usersbutton.click();

    }

    @Then("Each user id should be unique")
    public void each_user_id_should_be_unique() {

            List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//div[@class='table-scrollable']//tbody//tr//td[2]"));
            for (WebElement eachElement : elements) {
                int frequency = Collections.frequency(elements, eachElement);
                Assert.assertEquals(frequency, 1);
            }

        }

    }

