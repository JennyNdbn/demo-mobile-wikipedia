package ru.nadobnaya.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static io.appium.java_client.AppiumBy.id;

public class LogInPage {

    private final SelenideElement logInButton = $(id("org.wikipedia.alpha:id/login_button"));
    private final SelenideElement snackbar = $(id("org.wikipedia.alpha:id/snackbar_text"));
    private final SelenideElement usernameInput = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
                    "android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget" +
                    ".FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout" +
                    "/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText");
    private final SelenideElement passwordInput = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/" +
                    "android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget" +
                    ".FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout" +
                    "/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");

    @Step("Set username '{username}'")
    public LogInPage setUsername(String username) {
        usernameInput.sendKeys(username);
        return this;
    }

    @Step("Set password '{password}'")
    public LogInPage setPassword(String password) {
        passwordInput.sendKeys(password);
        return this;
    }

    @Step("Press 'LOG IN' button")
    public LogInPage pressLogInButton() {
        logInButton.click();
        return this;
    }

    @Step("Verify error text in snackbar")
    public void verifyErrorText(String text) {
        snackbar.shouldHave(text(text));
    }
}
