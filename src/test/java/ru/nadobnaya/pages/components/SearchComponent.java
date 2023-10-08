package ru.nadobnaya.pages.components;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class SearchComponent {

    @Step("Set search value '{value}'")
    public void setSearchValue(String value) {
        $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys(value);
    }
}
