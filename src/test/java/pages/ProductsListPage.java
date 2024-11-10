package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$;

public class ProductsListPage {
    private final ElementsCollection filterSelector = $$(".v-popper");
    private final ElementsCollection materialListItemSelector = $$("[class*='_valueTitle_']");
    private final ElementsCollection confirmButtonSelector = $$(".x-button");
    private final ElementsCollection colourListItemSelector = $$("[class*='_value_']");
    private final ElementsCollection sizeListItemSelector = $$(".x-checkbox");
    private final ElementsCollection brandListItemSelector = $$("[class*='_valueTitle_']");
    private final ElementsCollection countryListItemSelector = $$("[class*='_valueTitle_']");
    private final ElementsCollection sortingListItemSelector = $$("[class*='_item_']");
    private final SelenideElement firstProductPriceElement = $$("[class*='_price_']:not(.x-product-card-description__price-old):not(.x-product-card-description__price-second-old)").get(0);
    private final SelenideElement secondProductPriceElement = $$("[class*='_price_']:not(.x-product-card-description__price-old):not(.x-product-card-description__price-second-old)").get(1);

    public ElementsCollection getFilterSelector() {
        return filterSelector;
    }

    public String getMaterialFilterText() {
        return "Материалы";
    }

    public ElementsCollection getMaterialListItemSelector() {
        return materialListItemSelector;
    }

    public String getPolymerText() {
        return "Полимер";
    }

    public ElementsCollection getConfirmButtonSelector() {
        return confirmButtonSelector;
    }

    public String getConfirmButtonText() {
        return "Применить";
    }

    public String getColourFilterText() {
        return "Цвет";
    }

    public ElementsCollection getColourListItemSelector() {
        return colourListItemSelector;
    }

    public String getMulticolourText() {
        return "Мультиколор";
    }

    public String getSizeFilterText() {
        return "Размер";
    }

    public ElementsCollection getSizeListItemSelector() {
        return sizeListItemSelector;
    }

    public String getSizeText() {
        return "7";
    }

    public String getBrandFilterText() {
        return "Бренд";
    }

    public ElementsCollection getBrandListItemSelector() {
        return brandListItemSelector;
    }

    public String getGsdText() {
        return "GSD";
    }

    public String getCountryFilterText() {
        return "Страна производства";
    }

    public ElementsCollection getCountryListItemSelector() {
        return countryListItemSelector;
    }

    public String getChinaText() {
        return "Китай";
    }

    public String getSortingText() {
        return "Подобрали для вас";
    }

    public ElementsCollection getSortingListItemSelector() {
        return sortingListItemSelector;
    }

    public String getSortingFromCheapest() {
        return "Сначала дешевле";
    }

    public SelenideElement getFirstProductPriceElement() {
        return firstProductPriceElement;
    }

    public SelenideElement getSecondProductPriceElement() {
        return secondProductPriceElement;
    }
}