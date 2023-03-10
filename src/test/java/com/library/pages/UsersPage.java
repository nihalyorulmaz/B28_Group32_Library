package com.library.pages;

import com.library.utilities.BrowserUtils;
import com.library.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UsersPage extends BrowserUtils {
    public UsersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='tbl_users_length']//label//select")
    private WebElement defaultRecordsElement;

    public UsersPage verifyDefaultRecords(String defaultRecords) {
        Assert.assertTrue(getElementText(defaultRecordsElement).contains(defaultRecords));
        return this;
    }

    public UsersPage verifyOptionRecords(List<String> expectedRecords) {
        List<String> actualRecords = BrowserUtils.dropdownOptions_as_STRING(defaultRecordsElement);

        System.out.println("--expectedRecords are: " + expectedRecords);
        System.out.println("--actualRecords are: " + actualRecords);

        Assert.assertEquals(expectedRecords, actualRecords);
        return this;
    }
}
