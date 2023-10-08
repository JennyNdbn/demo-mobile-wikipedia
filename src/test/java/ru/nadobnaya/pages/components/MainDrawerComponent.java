package ru.nadobnaya.pages.components;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static io.appium.java_client.AppiumBy.id;

public class MainDrawerComponent {

    private final SelenideElement logInJoinButton = $(id("org.wikipedia.alpha:id/main_drawer_login_button"));

    @Step("Press 'LOG IN / JOIN WIKIPEDIA' button")
    public void pressLogInJoinButton() {
        logInJoinButton.click();
    }
}
