package tests;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class WebSteps {

    @Step("Проверяем header")
    public void checkHeader(SelenideElement header, String page) {
        header.shouldHave(text(page));
    }

    @Step("Проверяем title")
    public void checkTitle(SelenideElement title, String titleText) {
        title.shouldHave(text(titleText));
    }

    @Step("Проверяем footer")
    public void checkFooter(SelenideElement footer, String footerText) {
        footer.shouldHave(text(footerText));
    }

    @Step("Открываем выбранную страницу")
    public void openPage(String path) {
        open(path);
    }

    @Step("Проверяем активную страницу")
    public void checkActivePage(SelenideElement activePage, String text) {
        activePage.shouldHave(text(text));
    }
}