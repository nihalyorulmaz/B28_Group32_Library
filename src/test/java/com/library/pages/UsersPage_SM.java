package com.library.pages;


import net.bytebuddy.dynamic.scaffold.TypeWriter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsersPage_SM extends Login_Base_Page {



    @FindBy (xpath = "//span[text() = 'Users']")
    public WebElement usersPageLink;

    @FindBy (xpath = "//input[@type = 'search']")
    public WebElement searchBox;


}
