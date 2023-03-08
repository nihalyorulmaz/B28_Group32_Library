package com.library.pages;

import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UsersPage_NY extends Login_Base_Page {


    @FindBy(xpath = "//span[normalize-space()='Users']")
    public WebElement usersButton;

    public void clickUsersBtn(){
        WebElement userButton = Driver.getDriver().findElement(By.xpath("//span[normalize-space()='Users']"));
        userButton.click();
    }

    @FindBy(name = "tbl_users_length")
    public WebElement recordsDropdown;

    @FindBy(xpath = "//div[@class='table-scrollable']//tbody//tr")
    public List<WebElement> rows;






}
