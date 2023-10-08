package ru.nadobnaya.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import ru.nadobnaya.pages.ArticlePage;
import ru.nadobnaya.pages.SearchResultsPage;
import ru.nadobnaya.pages.components.SearchComponent;

import static ru.nadobnaya.tests.TestData.SOVCOMBANK;

@Feature("Testing of searching on Wikipedia mobile app")
@Execution(ExecutionMode.CONCURRENT)
public class SearchTests extends TestBase {
    SearchComponent searchComponent = new SearchComponent();
    SearchResultsPage searchResultsPage = new SearchResultsPage();
    ArticlePage articlePage = new ArticlePage();

    @Tag("positive")
    @Severity(SeverityLevel.CRITICAL)
    @DisplayName("Search 'Sovcombank' and verify that opened article contains 'Sovcombank' as a header")
    @Test
    void searchAndOpenArticleTest() {
        onboardingPage.skipOnboardingPage();
        mainPage.clickSearch();
        searchComponent.setSearchValue(SOVCOMBANK);
        searchResultsPage.checkResultsExistence()
                         .openArticle();
        articlePage.verifyArticleHeaderHaveText(SOVCOMBANK);
    }
}
