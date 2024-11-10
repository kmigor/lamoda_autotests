package testData;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class GsdBall {
    private final SelenideElement searchSelector = $("#MP002XU0D9YZ");

    public String getTextForInput() {
        return "мяч";
    }

    public SelenideElement getSearchSelector() {
        return searchSelector;
    }

    public String getArticle() {
        return "MP002XU0D9YZ";
    }

    public String getBrand() {
        return "GSD";
    }

    public String getCategory() {
        return "Мяч баскетбольный";
    }
}