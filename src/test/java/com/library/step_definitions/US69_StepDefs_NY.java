package com.library.step_definitions;

import com.library.pages.BooksPage_NY;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.*;

public class US69_StepDefs_NY {

    BooksPage_NY booksPage_ny = new BooksPage_NY();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        booksPage_ny.webPage();

    }

    @Given("user login to application as a student")
    public void user_login_to_application_as_a_student() {

        booksPage_ny.login("student");

    }

    @When("user navigate to Books page")
    public void user_navigate_to_books_page() {

        booksPage_ny.booksButton.click();

    }

    @When("user search for {string}")
    public void user_search_for(String bookName) {

        booksPage_ny.searchInputBox.sendKeys(bookName + Keys.ENTER );

    }

    @Then("books table should contain results matching")
    public void books_table_should_contain_results_matching( Map<String, String> dataTable) {


        Assert.assertEquals(booksPage_ny.expectedMap(),dataTable);







    }
}

/*
        List<WebElement> actualInfo_as_a_webElement = new ArrayList<>();

        for (int i = 2; i <= 5; i++) {

            actualInfo_as_a_webElement.add(Driver.getDriver().findElement(By.xpath("//tbody//td[" + i + "]")));
        }

        List<String> actualInfo_as_a_string = new ArrayList<>();


        for (WebElement each : actualInfo_as_a_webElement) {
            actualInfo_as_a_string.add(each.getText());
        }

*/


