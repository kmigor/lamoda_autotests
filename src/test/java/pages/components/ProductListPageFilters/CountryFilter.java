package pages.components.ProductListPageFilters;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class CountryFilter {

    private final String name = "Страна производства";
    private final ElementsCollection countryListItemSelector = $$("[class*='_valueTitle_']");
    private final ElementsCollection confirmButtonSelector = $$(".x-button");
    private final String confirmButtonText = "Применить";

    public void selectCountry(String country){
        countryListItemSelector.filterBy(text(country))
                .first().click();
        confirmButtonSelector.filterBy(text(confirmButtonText))
                .first().click();
    }

    public String getName() {
        return name;
    }

}
