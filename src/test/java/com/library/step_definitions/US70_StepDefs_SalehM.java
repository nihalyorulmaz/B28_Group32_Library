package com.library.step_definitions;

import com.library.pages.LoginPage_SalehM;
import com.library.utilities.BrowserUtils;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US70_StepDefs_SalehM {

    LoginPage_SalehM loginPage_salehM=new LoginPage_SalehM();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
    loginPage_salehM.webPage();
    }
    @When("user enter valid username")
    public void user_enter_valid_username() {
    loginPage_salehM.login( "librarian" );
    }

    @Then("user should see dashboard page")
    public void userShouldSeeDashboardPage() {
        BrowserUtils.sleep( 2 );
        BrowserUtils.verifyURLContains( "dashboard" );
    }
}
