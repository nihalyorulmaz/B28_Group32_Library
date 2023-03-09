package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BooksPage_NY extends Login_Base_Page{

    @FindBy(xpath = "//span[normalize-space()='Books']")
    public WebElement booksButton;

    @FindBy(xpath = "//input[@type='search']")
    public WebElement searchInputBox;

    @FindBy(xpath = "//th[2]")
    public WebElement isbnHead;

    @FindBy(xpath = "//th[3]")
    public WebElement bookNameHead;

    @FindBy(xpath = "//th[4]")
    public WebElement authorHead;

    @FindBy(xpath = "//th[5]")
    public WebElement categoryHead;

    @FindBy(xpath = "//th[6]")
    public WebElement yearHead;

    @FindBy(xpath = "//tbody//td[2]")
    public WebElement ISBNBox;

    @FindBy(xpath = "//tbody//td[3]")
    public WebElement bookNameBox;

    @FindBy(xpath = "//tbody//td[4]")
    public WebElement authorNameBox;

    @FindBy(xpath = "//tbody//td[5]")
    public WebElement categoryBox;

    @FindBy(xpath = "//tbody//td[6]")
    public WebElement yearBox;

    @FindBy(xpath = "//tbody//td")
    public List<WebElement> actualBookInfo;

    public Map<String,String> expectedMap(){
        Map<String,String> elements=new HashMap<>();
        for (int i = 2; i <=6 ; i++) {
            String headElements = Driver.getDriver().findElement( By.xpath( "//tr//th[" + i + "]" ) ).getText();
            for (int j = 2; j <=6 ; j++) {
                String subElements = Driver.getDriver().findElement( By.xpath( "//tr//td[" + i + "]" )).getText();
                elements.put( headElements,subElements );
            }
        }
        return elements;
    }








}
