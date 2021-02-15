package com.llemonade.utilities;

import com.llemonade.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {

    public static List<String> getelementtext(By locator ){

            List<WebElement> elems = Driver.get().findElements(locator);
            List<String> elemTexts = new ArrayList<>();

            for (WebElement el : elems) {
                elemTexts.add(el.getText());
            }

            return elemTexts;
        }


    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }





    }







