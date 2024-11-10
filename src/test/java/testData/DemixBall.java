package testData;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class DemixBall {
    private final String textForInput = "мяч";
    private final SelenideElement searchSelector = $("#MP002XG01OCM");
    private final String Article = "MP002XG01OCM";
    private final String Brand = "Demix";
    private final String Category = "Мяч гимнастический 17 см";

    public String getTextForInput() {
        return textForInput;
    }

    public SelenideElement getSearchSelector() {
        return searchSelector;
    }

    public String getArticle() {
        return Article;
    }

    public String getBrand() {
        return Brand;
    }

    public String getCategory() {
        return Category;
    }
}