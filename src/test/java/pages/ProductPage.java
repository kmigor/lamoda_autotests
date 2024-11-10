package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ProductPage {
    private final SelenideElement brandTitleSelector = $(".product-title__brand-name");
    private final SelenideElement categoryTitleSelector = $("[class*='_modelName_']");
    private final SelenideElement articleTitleSelector = $(".ui-product-description-attribute-sku");
    private final ElementsCollection addButtonSelector = $$(".x-button");
    private final String addButtonText = "Добавить в корзину";
    private final ElementsCollection sizeSelector = $$("[class*='_firstRow_']");
    private final String sizeText = "16 RUS";
    private final ElementsCollection cartButtonSelector = $$(".x-button");
    private final String cartButtonText = "Перейти в корзину";

    public SelenideElement getBrandTitleSelector() {
        return brandTitleSelector;
    }

    public SelenideElement getCategoryTitleSelector() {
        return categoryTitleSelector;
    }

    public SelenideElement getArticleTitleSelector() {
        return articleTitleSelector;
    }

    public ElementsCollection getAddButtonSelector() {
        return addButtonSelector;
    }

    public String getAddButtonText() {
        return addButtonText;
    }

    public ElementsCollection getSizeSelector() {
        return sizeSelector;
    }

    public String getSizeText() {
        return sizeText;
    }

    public ElementsCollection getCartButtonSelector() {
        return cartButtonSelector;
    }

    public String getCartButtonText() {
        return cartButtonText;
    }
}