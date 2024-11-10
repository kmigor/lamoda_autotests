package testData;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DemixBall {
    private final SelenideElement searchSelector = $("#MP002XG01OCM");

    public String getTextForInput() {
        return "мяч";
    }

    public SelenideElement getSearchSelector() {
        return searchSelector;
    }

    public String getArticle() {
        return "MP002XG01OCM";
    }

    public String getBrand() {
        return "Demix";
    }

    public String getCategory() {
        return "Мяч гимнастический 17 см";
    }
}