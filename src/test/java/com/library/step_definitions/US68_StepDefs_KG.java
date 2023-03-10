package com.library.step_definitions;

import com.library.pages.AddNewUsersPage_KG;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US68_StepDefs_KG {

    AddNewUsersPage_KG addNewUsersPage  = new AddNewUsersPage_KG();

    @When("user click on the Add User")
    public void user_click_on_the_add_user() {

        addNewUsersPage.addUser.click();
    }
    @Then("dialog field match {string} Name placeholder")
    public void dialog_field_match_name_placeholder(String expectedValue) {

    String actualPlaceHolder = addNewUsersPage.fullName.getAttribute("placeholder");
    Assert.assertEquals(actualPlaceHolder, expectedValue );

    }
    @Then("dialog field match {string} email placeholder")
    public void dialog_field_match_email_placeholder(String expectedValue) {
        String actualPlaceHolder = addNewUsersPage.eMail.getAttribute("placeholder");
        Assert.assertEquals(actualPlaceHolder, expectedValue );
    }
    @Then("dialog field match {string} password placeholder")
    public void dialog_field_match_password_placeholder(String expectedValue) {
        String actualPlaceHolder = addNewUsersPage.password.getAttribute("placeholder");
        Assert.assertEquals(actualPlaceHolder, expectedValue );
    }

    @Then("dialog field match address placeholder")
    public void dialog_field_match_address_placeholder() {
        boolean actualPlaceHolder = addNewUsersPage.address.getAttribute("value").isEmpty();
        Assert.assertTrue(actualPlaceHolder);

    }





}
