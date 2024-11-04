package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage extends Page {

    private final SelenideElement title = $("._title_16eml_8");
    private final String titleText = "Выберите интересующий вас раздел";

    public SelenideElement getTitle() {
        return title;
    }

    public String getTitleText() {
        return titleText;
    }
}