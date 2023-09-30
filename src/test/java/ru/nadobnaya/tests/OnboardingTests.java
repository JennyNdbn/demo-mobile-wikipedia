package ru.nadobnaya.tests;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;

public class OnboardingTests extends TestBase {

    @Tag("positive")
    @DisplayName("Onboarding screen test")
    @Test
    void gettingStartedTest() {

        SelenideElement textView = $(id("org.wikipedia.alpha:id/primaryTextView")),
                forwardButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")),
                acceptButton = $(id("org.wikipedia.alpha:id/acceptButton")),
                searchInput = $(accessibilityId("Search Wikipedia"));

        step("Check text on the first page and go forward", () -> {
            textView.shouldHave(text("The Free Encyclopedia …in over 300 languages"));
            forwardButton.click();
        });
        step("Check text on the second page and go forward", () -> {
            textView.shouldHave(text("New ways to explore"));
            forwardButton.click();
        });
        step("Check text on the third page and go forward", () -> {
            textView.shouldHave(text("Reading lists with sync"));
            forwardButton.click();
        });
        step("Check text on the fourth page and accept", () -> {
            textView.shouldHave(text("Send anonymous data"));
            acceptButton.click();
        });
        step("Verify main page opened", () -> {
            searchInput.shouldBe(visible);
        });

    }
}
