package testData;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class GsdBall {
    private final String textForInput = "мяч";
    private final SelenideElement searchSelector = $("#MP002XU0D9YZ");
    private final String Article = "MP002XU0D9YZ";
    private final String Brand = "GSD";
    private final String Category = "Мяч баскетбольный";

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