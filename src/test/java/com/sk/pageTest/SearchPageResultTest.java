package com.sk.pageTest;


import com.sk.utils.Constants;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class SearchPageResultTest extends BaseTest {

    @BeforeClass
    public void LoginPageSetup() {
        searchPageResult = landingPage.doSearch("Apple");
    }

    @Test
    public void searchPageURLTest() {
        Assert.assertEquals(searchPageResult.getSearchPageTitle(), Constants.SEARCH_PAGE_TITLE);
    }

    @Test
    public void displaySearchResult() {
        List<String> s = searchPageResult.getAllResults();
        for (String str : s) {
            System.out.println(str);
        }
    }
}
