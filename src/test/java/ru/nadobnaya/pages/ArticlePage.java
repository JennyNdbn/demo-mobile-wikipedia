package ru.nadobnaya.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static io.appium.java_client.AppiumBy.id;

public class ArticlePage {
    private final SelenideElement article = $(id("org.wikipedia.alpha:id/page_web_view"));
    private final SelenideElement articleHeader = $x("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android" +
                ".widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout" +
                ".widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.view" +
                ".ViewGroup/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view" +
                ".View/android.view.View[1]/android.view.View[1]")
    ;

    @Step("Verify that the opened article has text '{text}'")
    public void verifyArticleHeaderHaveText(String text) {
        article.click();
        articleHeader.shouldHave(text(text));
    }


}
