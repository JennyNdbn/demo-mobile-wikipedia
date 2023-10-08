package ru.nadobnaya.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import ru.nadobnaya.pages.AccountCreationPage;
import ru.nadobnaya.pages.LogInPage;
import ru.nadobnaya.pages.components.MainDrawerComponent;

import static ru.nadobnaya.tests.TestData.INCORRECT_USERNAME_OR_PASSWORD_ENTERED;

@Feature("Testing of logging in on Wikipedia mobile app")
@Execution(ExecutionMode.CONCURRENT)
public class AuthTest extends TestBase {

    MainDrawerComponent mainDrawerComponent = new MainDrawerComponent();
    AccountCreationPage accountCreationPage = new AccountCreationPage();
    LogInPage logInPage = new LogInPage();
    TestData data = new TestData();

    @Tag("negative")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Authentication with incorrect random data test")
    @Test
    void authWithFakeDataNegativeTest() {
        onboardingPage.skipOnboardingPage();
        mainPage.pressMenuIcon();
        mainDrawerComponent.pressLogInJoinButton();
        accountCreationPage.pressLogInButton();
        logInPage.setUsername(data.username)
                .setPassword(data.password)
                .pressLogInButton()
                .verifyErrorText(INCORRECT_USERNAME_OR_PASSWORD_ENTERED);
    }
}
