package pages.components;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class SizeSelector {

    private final ElementsCollection sizeSelector = $$("[class*='_firstRow_']");

    public void selectSize(String size){
        sizeSelector.filterBy(text(size)).first().click();
    }
}