package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$;

public class ProductsListPage {
    private final ElementsCollection filterSelector = $$(".v-popper");
    private final String materialFilterText = "Материалы";
    private final ElementsCollection materialListItemSelector = $$("[class*='_valueTitle_']");
    private final String polymerText = "Полимер";
    private final ElementsCollection confirmButtonSelector = $$(".x-button");
    private final String confirmButtonText = "Применить";
    private final String colourFilterText = "Цвет";
    private final ElementsCollection colourListItemSelector = $$("[class*='_value_']");
    private final String multicolourText = "Мультиколор";
    private final String sizeFilterText = "Размер";
    private final ElementsCollection sizeListItemSelector = $$(".x-checkbox");
    private final String sizeText = "7";
    private final String brandFilterText = "Бренд";
    private final ElementsCollection brandListItemSelector = $$("[class*='_valueTitle_']");
    private final String gsdText = "GSD";
    private final String countryFilterText = "Страна производства";
    private final ElementsCollection countryListItemSelector = $$("[class*='_valueTitle_']");
    private final String chinaText = "Китай";
    private final String sortingText = "Подобрали для вас";
    private final ElementsCollection sortingListItemSelector = $$("[class*='_item_']");
    private final String sortingFromCheapest = "Сначала дешевле";
    private final SelenideElement firstProductPriceElement = $$("[class*='_price_']:not(.x-product-card-description__price-old):not(.x-product-card-description__price-second-old)").get(0);
    private final SelenideElement secondProductPriceElement = $$("[class*='_price_']:not(.x-product-card-description__price-old):not(.x-product-card-description__price-second-old)").get(1);

    public ElementsCollection getFilterSelector() {
        return filterSelector;
    }

    public String getMaterialFilterText() {
        return materialFilterText;
    }

    public ElementsCollection getMaterialListItemSelector() {
        return materialListItemSelector;
    }

    public String getPolymerText() {
        return polymerText;
    }

    public ElementsCollection getConfirmButtonSelector() {
        return confirmButtonSelector;
    }

    public String getConfirmButtonText() {
        return confirmButtonText;
    }

    public String getColourFilterText() {
        return colourFilterText;
    }

    public ElementsCollection getColourListItemSelector() {
        return colourListItemSelector;
    }

    public String getMulticolourText() {
        return multicolourText;
    }

    public String getSizeFilterText() {
        return sizeFilterText;
    }

    public ElementsCollection getSizeListItemSelector() {
        return sizeListItemSelector;
    }

    public String getSizeText() {
        return sizeText;
    }

    public String getBrandFilterText() {
        return brandFilterText;
    }

    public ElementsCollection getBrandListItemSelector() {
        return brandListItemSelector;
    }

    public String getGsdText() {
        return gsdText;
    }

    public String getCountryFilterText() {
        return countryFilterText;
    }

    public ElementsCollection getCountryListItemSelector() {
        return countryListItemSelector;
    }

    public String getChinaText() {
        return chinaText;
    }

    public String getSortingText() {
        return sortingText;
    }

    public ElementsCollection getSortingListItemSelector() {
        return sortingListItemSelector;
    }

    public String getSortingFromCheapest() {
        return sortingFromCheapest;
    }

    public SelenideElement getFirstProductPriceElement() {
        return firstProductPriceElement;
    }

    public SelenideElement getSecondProductPriceElement() {
        return secondProductPriceElement;
    }
}