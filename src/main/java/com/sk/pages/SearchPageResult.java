package com.sk.pages;

import com.sk.utils.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchPageResult {
    private WebDriver driver;
    private ElementUtil elementUtil;

    private By resultsText = By.xpath("//span[contains(text(),'RESULTS')]");
    private By resultsCount = By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']");

    public SearchPageResult(WebDriver driver) {
        this.driver = driver;
        elementUtil = new ElementUtil(this.driver);
    }

    public String getSearchPageTitle() {
        return driver.getTitle();
    }

    public List<String> getAllResults() {
        List<String> ar = elementUtil.getElementsText(resultsCount);
        return ar;
    }
}
