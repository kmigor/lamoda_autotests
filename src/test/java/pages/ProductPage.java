package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import helpers.JsonChecker;
import pages.components.CartPopUp;
import pages.components.SizeSelector;

import java.io.IOException;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductPage {
    private final SelenideElement brandTitleSelector = $(".product-title__brand-name");
    private final SelenideElement categoryTitleSelector = $("[class*='_modelName_']");
    private final ElementsCollection addButtonSelector = $$(".x-button");
    private final String addButtonText = "Добавить в корзину";
    private final SizeSelector sizeSelect = new SizeSelector();
    private final CartPopUp cartPopUp = new CartPopUp();

    public void checkPage(String jsonName) {
        JsonChecker jsonChecker = new JsonChecker();
        try {
            jsonChecker.checkJson(jsonName, categoryTitleSelector.getText(), brandTitleSelector.getText());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void addToCart(String size) {
        addButtonSelector.filterBy(text(addButtonText)).first().click();
        sizeSelect.selectSize(size);
    }

    public void openCart() {
        cartPopUp.openCart();
    }
}