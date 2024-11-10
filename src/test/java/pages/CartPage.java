package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CartPage {
    private final SelenideElement goodsInCartTitleSelector = $(".ui-checkout-cart__products-count");
    private final SelenideElement goodsIncrementerSelector = $("[class*='_incrementor_']");
    private final SelenideElement removeButtonSelector = $(".ui-checkout-cart__item-remove-from-cart");
    private final SelenideElement emptyCartTitleSelector = $("[class*='_rootLogout_']")
            .$("[class*='_title_']");

    public SelenideElement getGoodsInCartTitleSelector() {
        return goodsInCartTitleSelector;
    }

    public String getGoodsInCartTitleText() {
        return "1 товар";
    }

    public SelenideElement getGoodsIncrementerSelector() {
        return goodsIncrementerSelector;
    }

    public SelenideElement getRemoveButtonSelector() {
        return removeButtonSelector;
    }

    public SelenideElement getEmptyCartTitleSelector() {
        return emptyCartTitleSelector;
    }

    public String getEmptyCartTitleText() {
        return "Корзина пока пустая";
    }
}