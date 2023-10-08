package ru.nadobnaya.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

import static io.appium.java_client.AppiumBy.id;

public class OnboardingPage {

    private final SelenideElement textView = $(id("org.wikipedia.alpha:id/primaryTextView"));
    private final SelenideElement forwardButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_forward_button"));
    private final SelenideElement skipButton = $(id("org.wikipedia.alpha:id/fragment_onboarding_skip_button"));
    private final SelenideElement acceptButton = $(id("org.wikipedia.alpha:id/acceptButton"));

    @Step("Check text '{text}' on the onboarding page")
    public OnboardingPage checkTextOnTextView(String text) {
        textView.shouldHave(text(text));
        return this;
    }
    @Step("Press continue button")
    public OnboardingPage pressContinueButton() {
        forwardButton.click();
        return this;
    }
    @Step("Press accept button")
    public void pressAcceptButton() {
        acceptButton.click();
    }

    @Step("Skip the onboarding page")
    public void skipOnboardingPage() {
        skipButton.click();
    }
}
