package com.llemonade.stepdefinitions;

import com.llemonade.pages.BasePage;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Searchstepdefinitions {
BasePage basePage=new BasePage();

    @Given("the user enter following {string}")
    public void the_user_enter_following(String input) {
 basePage.searchinput.sendKeys(input);
    }

    @When("the user click search button")
    public void the_user_click_search_button() {
      basePage.searchbutton.click();
    }

    @Then("the title should be contain {string}")
    public void the_title_should_be_contain(String input) {
        Assert.assertTrue(basePage.title.getText().contains(input));

    }


}
