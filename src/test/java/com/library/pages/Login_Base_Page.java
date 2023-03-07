package com.library.pages;

import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class Login_Base_Page {


    public Login_Base_Page(){
        PageFactory.initElements( Driver.getDriver(),this );
    }

    @FindBy(id="inputEmail")
    public WebElement emailBox;

    @FindBy(css="#inputPassword")
    public WebElement passwordBox;

    @FindBy(css="button[class='btn btn-lg btn-primary btn-block']")
    public WebElement signInBtn;


    public void webPage(){
        Driver.getDriver().get( ConfigurationReader.getProperty("url") );
    }

    public void login(String user){
        String userEmail= ConfigurationReader.getProperty(user+"_username");
        String userPassword=ConfigurationReader.getProperty( user+"_password");
        emailBox.sendKeys( userEmail );
        passwordBox.sendKeys( userPassword );
        signInBtn.click();
    }


}
