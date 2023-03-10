package com.library.step_definitions;
import com.library.pages.Login_Base_Page;
import com.library.pages.UsersPage_NY;
import com.library.pages.UsersPage_SM;
import com.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US65_StepDefs_SM {
   UsersPage_NY login = new UsersPage_NY();
   UsersPage_SM users = new UsersPage_SM();

    @Given("I login as a librarian And I click on {string} link")
    public void i_login_as_a_librarian_and_i_click_on_link(String string) {
        login.login("librarian");
        users.usersPageLink.click();

    }
    @When("I search for {string}")
    public void i_search_for(String word) throws InterruptedException {
       users.searchBox.sendKeys(word + Keys.ENTER);
       Thread.sleep(5000);
    }
    @Then("table should contain rows with {string}")
    public void table_should_contain_rows_with(String search) throws InterruptedException {


        List<WebElement> tablesRows = Driver.getDriver().findElements(By.xpath("//tbody//tr"));

            for (WebElement eachRow : tablesRows) {
                String eachRowsData = eachRow.getText();

                if(eachRowsData.contains(search)){
                    Assert.assertTrue(true);
                }else {
                    Assert.assertTrue(false);
                }
            }
    }
    @Then("table should have following column names:")
    public void table_should_have_following_column_names(List <String> dataTable) {

        List<WebElement> topRow = Driver.getDriver().findElements(By.xpath("//thead//tr//th"));
        List<String> dataNames = new ArrayList<>();

        for (WebElement each : topRow) {
            String eachName = each.getText();
            dataNames.add(eachName);
        }
        Assert.assertEquals(dataTable, dataNames);
    }

    }
































