package com.library.step_definitions;

import com.library.pages.UsersSearchPage_KG;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US68_StepDefs_KG {

    UsersSearchPage_KG usersSearchPage = new UsersSearchPage_KG();


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
       usersSearchPage.webPage();
    }
    @Given("user login as a librarian")
    public void user_login_as_a_librarian() {
    usersSearchPage.login("librarian");
    }
    @Given("user click on Users link")
    public void user_click_on_users_link() {
    usersSearchPage.UsersButton.click();
    }
    @When("user enters {string} in the search box")
    public void user_enters_in_the_search_box(String searchValue) {
    usersSearchPage.searchBox.sendKeys(searchValue);
    }

    @Then("user should sees {string} is in the userIDHeader")
    public void user_should_sees_is_in_the_user_id_header(String expectedValue) {
        String actualUserID = usersSearchPage.userIDHeader.getText();
    }
    @Then("user should sees {string} is in the fullNameHeader")
    public void user_should_sees_is_in_the_full_name_header(String expectedValue) {

    }
    @Then("user should sees {string}  is in the emailHeader")
    public void user_should_sees_is_in_the_email_header(String expectedValue) {

    }



}
