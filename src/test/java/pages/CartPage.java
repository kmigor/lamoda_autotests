package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CartPage extends Page {

    private final SelenideElement title = $("._title_k4g9v_9");

    private final String titleText = "Корзина пока пустая";

    public SelenideElement getTitle() {
        return title;
    }
    public String getTitleText() {
        return titleText;
    }
}