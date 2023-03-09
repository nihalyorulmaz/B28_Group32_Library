package com.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UsersPage_JI extends Login_Base_Page {


@FindBy(xpath = "//span[normalize-space()='Users']")
public WebElement usersbutton;


    @FindBy(xpath = "//div[@class='table-scrollable']//tbody//tr//td[2]")
    public List<WebElement> rows;

}
