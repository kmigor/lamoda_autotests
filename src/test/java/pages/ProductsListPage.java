package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import helpers.PriceOperator;
import pages.components.ProductListPageFilters.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductsListPage {
    private final ElementsCollection filterSelector = $$(".v-popper");
    private final ElementsCollection productPriceElement = $$("[class*='_price_']:not(.x-product-card-description__price-old):not(.x-product-card-description__price-second-old)");
    private final MaterialFilter materialFilter = new MaterialFilter();
    private final ColourFilter colourFilter = new ColourFilter();
    private final SizeFilter sizeFilter = new SizeFilter();
    private final BrandFilter brandFilter = new BrandFilter();
    private final CountryFilter countryFilter = new CountryFilter();
    private final SortingFilter sortingFilter = new SortingFilter();

    public void findGood(String article) {
        String selector = "#" + article;
        $(selector).should(Condition.exist)
                .scrollTo()
                .click();
    }

    public void addMaterialFilter(String material){
        filterSelector.filterBy(text(materialFilter.getName()))
                .first().should(exist).shouldBe(visible).click();
        materialFilter.selectMaterial(material);
    }

    public void addColourFilter(String colour){
        filterSelector.filterBy(text(colourFilter.getName()))
                .first().should(exist).shouldBe(visible).click();
        colourFilter.selectColour(colour);
    }

    public void addSizeFilter(String size){
        filterSelector.filterBy(text(sizeFilter.getName()))
                .first().should(exist).shouldBe(visible).click();
        sizeFilter.selectSize(size);
    }

    public void addBrandFilter(String brand){
        filterSelector.filterBy(text(brandFilter.getName()))
                .first().should(exist).shouldBe(visible).click();
        brandFilter.selectBrand(brand);
    }

    public void addCountryFilter(String country){
        filterSelector.filterBy(text(countryFilter.getName()))
                .first().should(exist).shouldBe(visible).click();
        countryFilter.selectCountry(country);
    }

    public void addSortingFromCheapest(){
        filterSelector.filterBy(text(sortingFilter.getName()))
                .first().should(exist).shouldBe(visible).click();
        sortingFilter.sortFromCheapest();
    }

    public void checkSorting(){
        double firstProductPrice = PriceOperator.parsePrice(productPriceElement.get(0).getText());
        double secondProductPrice = PriceOperator.parsePrice(productPriceElement.get(1).getText());

        assertTrue(firstProductPrice <= secondProductPrice, "Цена первого товара должна быть " +
                "меньше, чем второго");
    }
}