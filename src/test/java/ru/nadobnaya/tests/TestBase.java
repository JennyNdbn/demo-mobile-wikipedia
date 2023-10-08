package ru.nadobnaya.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Owner;
import ru.nadobnaya.drivers.LocalMobileDriver;
import ru.nadobnaya.helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import ru.nadobnaya.pages.MainPage;
import ru.nadobnaya.pages.OnboardingPage;

import static com.codeborne.selenide.Selenide.*;

@Owner("Evgeniia Nadobnaia")
public class TestBase {

    OnboardingPage onboardingPage = new OnboardingPage();
    MainPage mainPage = new MainPage();

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = null;
        Configuration.browser = LocalMobileDriver.class.getName();
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open();
    }

    @AfterEach
    void afterEach() {
        Attach.pageSource();
        closeWebDriver();
    }
}
