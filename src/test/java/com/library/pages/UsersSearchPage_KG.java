package com.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersSearchPage_KG extends Login_Base_Page {

    @FindBy(xpath = "//span[text()='Users']")
    public WebElement UsersButton;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy(xpath = "//table[@id='tbl_users']/tbody//td[2]")
    public WebElement userIDHeader;

    @FindBy(xpath = "//table[@id='tbl_users']/tbody//td[3]")
    public WebElement fullNameHeader;

    @FindBy(xpath = "//table[@id='tbl_users']/tbody//td[4]")
    public WebElement emailHeader;

}
