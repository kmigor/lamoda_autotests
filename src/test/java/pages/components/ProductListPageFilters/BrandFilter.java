package pages.components.ProductListPageFilters;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class BrandFilter {

    private final String name = "Бренд";
    private final ElementsCollection brandListItemSelector = $$("[class*='_valueTitle_']");
    private final ElementsCollection confirmButtonSelector = $$(".x-button");
    private final String confirmButtonText = "Применить";

    public void selectBrand(String brand){
        brandListItemSelector.filterBy(text(brand))
                .first().click();
        confirmButtonSelector.filterBy(text(confirmButtonText))
                .first().click();
    }

    public String getName() {
        return name;
    }

}
