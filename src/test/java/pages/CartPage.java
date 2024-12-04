package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {
    private final SelenideElement goodsInCartTitleSelector = $(".ui-checkout-cart__products-count");
    private final SelenideElement goodsIncrementerSelector = $("[class*='_incrementor_']");
    private final SelenideElement removeButtonSelector = $(".ui-checkout-cart__item-remove-from-cart");
    private final SelenideElement emptyCartTitleSelector = $("[class*='_content_']").$("[class*='_root_']")
            .$("[class*='_title_']");
    private final String goodsInCartTitleText = "1 товар";
    private final String emptyCartTitleText = "Корзина пока пустая";

    public void checkPage(){
        goodsInCartTitleSelector.shouldHave(text(goodsInCartTitleText));
    }
    public void removeGood(){
        goodsIncrementerSelector.hover();
        removeButtonSelector.click();
        emptyCartTitleSelector.shouldHave(text(emptyCartTitleText));
    }

}