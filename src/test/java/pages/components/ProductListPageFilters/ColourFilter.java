package pages.components.ProductListPageFilters;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class ColourFilter {
    private final String name = "Цвет";
    private final ElementsCollection colourListItemSelector = $$("[class*='_value_']");
    private final ElementsCollection confirmButtonSelector = $$(".x-button");
    private final String confirmButtonText = "Применить";

    public void selectColour(String colour){
        colourListItemSelector.filterBy(text(colour))
                .first().click();
        confirmButtonSelector.filterBy(text(confirmButtonText))
                .first().click();
    }

    public String getName() {
        return name;
    }
}
