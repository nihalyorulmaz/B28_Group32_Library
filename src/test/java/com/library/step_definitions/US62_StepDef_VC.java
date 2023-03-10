package com.library.step_definitions;

import com.library.pages.HomePage;
import com.library.pages.LoginPage;
import com.library.pages.UsersPage;
import com.library.utilities.BrowserUtils;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US62_StepDef_VC {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    UsersPage usersPage = new UsersPage();

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage.launchingWebPage();
    }

    @Given("I login as a {string} user")
    public void iLoginAsALibrarian(String librarianUser) {
        loginPage.enterEmailAddress(librarianUser)
                .enterPassword(librarianUser)
                .clickSignInButton();
    }

    @When("I click on 'Users' link")
    public void iClickOnLink() {
        homePage.clickUsersHeader();
    }

    @Then("Show records default value should be {string}")
    public void showRecordsDefaultValueShouldBe(String defaultRecords) {
        usersPage.verifyDefaultRecords(defaultRecords);
    }

    @Then("show records should have following options:")
    public void showRecordsShouldHaveFollowingOptions(List<String> optionsRecords) {
        usersPage.verifyOptionRecords(optionsRecords);
    }
}
