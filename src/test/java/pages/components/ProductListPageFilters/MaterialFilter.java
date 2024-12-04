package pages.components.ProductListPageFilters;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class MaterialFilter {
    private final String name = "Материалы";
    private final ElementsCollection materialListItemSelector = $$("[class*='_valueTitle_']");
    private final ElementsCollection confirmButtonSelector = $$(".x-button");
    private final String confirmButtonText = "Применить";

    public void selectMaterial(String material){
        materialListItemSelector.filterBy(text(material))
                .first().click();
        confirmButtonSelector.filterBy(text(confirmButtonText))
                .first().click();
    }

    public String getName() {
        return name;
    }
}
