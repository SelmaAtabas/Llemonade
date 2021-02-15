package com.llemonade.stepdefinitions;

import com.llemonade.pages.BasePage;

import com.llemonade.utilities.BrowserUtils;
import com.llemonade.utilities.ConfigurationReader;
import com.llemonade.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.jsoup.Connection;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

public class contentsstepdefinitions {

    @Given("the user is in the wikipedia home page")
    public void the_user_is_in_the_wikipedia_home_page() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user clicks Contents")
    public void the_user_clicks_Contents() {
     new BasePage().contents.click();
    }

    @Then("the user should be able to see following options")
    public void the_user_should_be_able_to_see_following_options(List<String> options) {
    List<String > Actualoptions=BrowserUtils.getElementsText(new BasePage().getContents);
   // List <String> actual= BrowserUtils.getelementtext(By.cssSelector(".hlist.noprint>ul>li"));
        Assert.assertEquals(options,Actualoptions);

    }

}
