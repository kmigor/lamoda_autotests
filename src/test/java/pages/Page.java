package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Page {

    private final String headerText = "Новинки";

    private final String footerText = "Lamoda — это онлайн-площадка для модного шопинга. Здесь собраны более 4 тысяч мировых и российских брендов и более 5 миллионов товаров: одежда, обувь, косметика, товары для детей и дома. Быстрая доставка, примерка перед покупкой, программа скидок и бонусов — мы делаем всё, чтобы шопинг был приятным и удобным.";

    private final SelenideElement header = $(".top-menu_discovery");

    private final SelenideElement footer = $(".x-footer-seo-menu-tab-description");

    public SelenideElement getHeader() {
        return header;
    }

    public SelenideElement getFooter() {
        return footer;
    }

    public String getHeaderText() {
        return headerText;
    }

    public String getFooterText() {
        return footerText;
    }
}