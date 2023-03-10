package com.library.step_definitions;

import com.library.pages.UsersPage_NY;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class US63_StepDefs_NY {

    UsersPage_NY usersPage_ny = new UsersPage_NY();

    @Given("the user on the login page")
    public void the_user_on_the_login_page() {
        usersPage_ny.webPage();
    }
    @Given("user login as a librarian")
    public void user_login_as_a_librarian() {
        usersPage_ny.login("librarian");
    }


    @Given("user click on Users link")
    public void user_click_on_link() {
        usersPage_ny.clickUsersBtn();
    }


    @When("user select Show {string} records")
    public void user_select_show_records(String count) {
        Select select = new Select(usersPage_ny.recordsDropdown);
        select.selectByValue( count);
    }


    @And("show records value should be {string}")
    public void show_records_value_should_be(String count) {

        String actualValue = usersPage_ny.recordsDropdown.getAttribute("value");
        String expectedValue = count;

        Assert.assertEquals(actualValue,expectedValue);

    }


    @Then("the users table must display {string} records")
    public void the_users_table_must_display_records(String count) {

        String actualNumberOfRow = "" + usersPage_ny.rows.size();
        String expectedNumberOfRow = count;

        Assert.assertEquals(actualNumberOfRow,expectedNumberOfRow);

    }






}
