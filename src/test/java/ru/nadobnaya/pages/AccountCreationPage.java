package ru.nadobnaya.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class AccountCreationPage {

    private final SelenideElement logInButton = $(id("org.wikipedia.alpha:id/create_account_login_button"));

    @Step("Press 'LOG IN' button")
    public void pressLogInButton() {
        logInButton.click();
    }
}
