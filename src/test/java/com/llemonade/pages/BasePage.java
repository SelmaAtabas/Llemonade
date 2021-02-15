package com.llemonade.pages;

import com.llemonade.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public  class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this); }

    @FindBy(linkText= "Contents")
    public WebElement contents;

    @FindBy(css = ".hlist.noprint>ul>li")
    public List<WebElement> getContents;

    @FindBy(xpath = "//*[@id=\"p-lang\"]/div/ul/li/a")
    public List<WebElement> languages;

    @FindBy(xpath = "//*[@id=\"mw-content-text\"]/div[1]/div[1]/div[2]/p/a")
    public WebElement text;

    @FindBy(id = "searchInput")
    public WebElement searchinput;

    @FindBy(id = "searchButton")
    public WebElement searchbutton;

    @FindBy(css = ".firstHeading")
    public WebElement title;


}
