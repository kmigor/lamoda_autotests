package pages.components.ProductListPageFilters;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class SizeFilter {
    private final String name = "Размер";
    private final ElementsCollection sizeListItemSelector = $$(".x-checkbox");
    private final ElementsCollection confirmButtonSelector = $$(".x-button");
    private final String confirmButtonText = "Применить";

    public void selectSize(String size){
        sizeListItemSelector.filterBy(text(size))
                .first().click();
        confirmButtonSelector.filterBy(text(confirmButtonText))
                .first().click();
    }

    public String getName() {
        return name;
    }
}
