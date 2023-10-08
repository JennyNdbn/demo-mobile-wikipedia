package ru.nadobnaya.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;

public class MainPage {

    private final SelenideElement
            searchInput = $(accessibilityId("Search Wikipedia"));
    private final SelenideElement menuButton = $(id("org.wikipedia.alpha:id/menu_icon"));

    @Step("Verify that main page has opened")
    public void verifyMainPageOpened() {
        searchInput.shouldBe(visible);
    }

    @Step("Press menu icon")
    public void pressMenuIcon() {
        menuButton.click();
    }

    @Step("Click on search input")
    public void clickSearch() {
        searchInput.click();
    }
}
