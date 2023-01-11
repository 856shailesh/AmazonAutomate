package com.sk.utils;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ElementUtil {

    private WebDriver driver;

    public ElementUtil(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getElement(By locator) {
        WebElement ele = driver.findElement(locator);
        return ele;
    }

    public List<WebElement> getElements(By locator) {
        return driver.findElements(locator);
    }

    public List<String> getElementsText(By locator) {
        List<WebElement> all = driver.findElements(locator);
        List<String> allText = new ArrayList<String>();
        for (WebElement text : all) {
            String t = text.getText();
            allText.add(t);
        }
        return allText;
    }

    public void doSendKeys(By locator, String value) {
        WebElement ele = getElement(locator);
        ele.clear();
        ele.sendKeys(value);
    }

    public void doClick(By locator) {
        WebElement ele = getElement(locator);
        ele.click();
    }

    public String doGetTitle() {
        return driver.getTitle();
    }

    public String doGetText(By locator) {
        return driver.findElement(locator).getText();
    }

}
