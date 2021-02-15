package com.llemonade.stepdefinitions;

import com.llemonade.pages.BasePage;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class changelanguagestepdefinitions {
BasePage basePage=new BasePage();
    @When("the user select Espanol")
    public void the_user_select() {

    basePage.languages.get(10).click();
    }

    @Then("language should be changed as {string}")
    public void language_should_be_changed(String language) {
        Assert.assertTrue(basePage.text.getText().contains(language));

    }
}
