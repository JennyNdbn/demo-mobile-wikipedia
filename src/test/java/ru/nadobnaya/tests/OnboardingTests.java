package ru.nadobnaya.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static ru.nadobnaya.tests.TestData.*;

@Feature("Testing of passing the onboarding screen on Wikipedia mobile app")
public class OnboardingTests extends TestBase {

    @Tag("positive")
    @DisplayName("Onboarding screen test")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    void gettingStartedTest() {
        onboardingPage.checkTextOnTextView(FIRST_ONBOARDING_SCREEN_TEXT)
                .pressContinueButton()
                .checkTextOnTextView(SECOND_ONBOARDING_SCREEN_TEXT)
                .pressContinueButton()
                .checkTextOnTextView(THIRD_ONBOARDING_SCREEN_TEXT)
                .pressContinueButton()
                .checkTextOnTextView(FOURTH_ONBOARDING_SCREEN_TEXT)
                .pressAcceptButton();
        mainPage.verifyMainPageOpened();
    }

}
