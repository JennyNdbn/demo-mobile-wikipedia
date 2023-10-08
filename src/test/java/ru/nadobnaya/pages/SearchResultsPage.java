package ru.nadobnaya.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.id;

public class SearchResultsPage {

    @Step("Verify results existence")
    public SearchResultsPage checkResultsExistence() {
        $$(id("org.wikipedia.alpha:id/search_container")).shouldHave(sizeGreaterThan(0));
        return this;
    }

    @Step("Open first article")
    public void openArticle() {
        $(id("org.wikipedia.alpha:id/page_list_item_title")).click();
    }
}
