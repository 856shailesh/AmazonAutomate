package com.sk.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

    private WebDriver driver;

    public ElementUtil(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getElement(By locator){
        WebElement ele = driver.findElement(locator);
        return ele;
    }

    public void doSendKeys(By locator , String value){
        WebElement ele = getElement(locator);
        ele.clear();
        ele.sendKeys(value);
    }

    public void doClick(By locator){
        WebElement ele = getElement(locator);
        ele.click();
    }
}
