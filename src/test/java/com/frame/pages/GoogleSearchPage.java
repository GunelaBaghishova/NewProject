package com.frame.pages;

import com.frame.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "q")
    public WebElement searchBox;

    @FindBy(xpath="(//div[@class='FPdoLc lJ9FBc']/center/input)[1]")
    public WebElement searchButton;

    @FindBy(xpath = "//a[@class='FLP8od']")
    public WebElement capital;




}
