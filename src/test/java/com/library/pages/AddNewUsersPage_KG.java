package com.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewUsersPage_KG extends Login_Base_Page{

    @FindBy(xpath = "//span[text()='Users']")
    public WebElement UsersButton;

    @FindBy(xpath = "//a[@class='btn btn-lg btn-outline btn-primary btn-sm']")
    public WebElement addUser;

    @FindBy(xpath = "//input[@name='full_name']")
    public WebElement fullName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement eMail;

    @FindBy(xpath = "//textarea[@id='address']")
    public WebElement address;



}
