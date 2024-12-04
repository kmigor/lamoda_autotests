package pages.components;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class CartPopUp {

    private final ElementsCollection cartButtonSelector = $$(".x-button");
    private final String cartButtonText = "Перейти в корзину";

    public void openCart(){
        cartButtonSelector.filterBy(text(cartButtonText)).first().should(exist).shouldBe(visible).click();
    }
}