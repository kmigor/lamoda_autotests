package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.CartPage;
import pages.MainPage;
import pages.ProductPage;
import pages.ProductsListPage;
import testData.DemixBall;
import testData.GsdBall;
import testData.Plaid;
import testData.Ring;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LamodaTests extends TestBase {
    @Test
    @Owner("kmigor")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка поиска кольца по артикулу")
    public void searchProductByArticleTest() {
        MainPage mainPage = new MainPage();
        ProductPage productPage = new ProductPage();
        Ring ring = new Ring();

        step("Открываем главную страницу", () -> open("/"));
        step("Ищем товар в поиске по артикулу", () -> {
            mainPage.getInputSelector().setValue(ring.getArticle()).pressEnter();
        });
        step("Проверяем, что открылась правильная страница товара", () -> {
            productPage.getBrandTitleSelector().shouldHave(text(ring.getBrand()));
            productPage.getCategoryTitleSelector().scrollTo().shouldHave(text(ring.getCategory()));
            productPage.getArticleTitleSelector().scrollTo().shouldHave(text(ring.getArticle()));
        });
    }

    @Test
    @Owner("kmigor")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка поиска мяча Demix через ключевое слово")
    public void searchProductByNameTest() {
        MainPage mainPage = new MainPage();
        DemixBall demixBall = new DemixBall();
        ProductPage productPage = new ProductPage();

        step("Открываем главную страницу", () -> open("/"));
        step("Ищем товар в поиске по названию", () -> {
            mainPage.getInputSelector().setValue(demixBall.getTextForInput()).pressEnter();
        });
        step("Ищем в каталоге требуемый товар", () -> demixBall.getSearchSelector().should(Condition.exist)
                .scrollTo().click());
        step("Проверяем, что октрылась правильная страница товара", () -> {
            productPage.getBrandTitleSelector().shouldHave(text(demixBall.getBrand()));
            productPage.getCategoryTitleSelector().scrollTo().shouldHave(text(demixBall.getCategory()));
            productPage.getArticleTitleSelector().scrollTo().shouldHave(text(demixBall.getArticle()));
        });
    }

    @Test
    @Owner("kmigor")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка работы корзины. Добавление товара в корзину, удаление товара из корзины.")
    public void cartTest() {
        MainPage mainPage = new MainPage();
        ProductPage productPage = new ProductPage();
        CartPage cartPage = new CartPage();
        Ring ring = new Ring();

        step("Открываем главную страницу", () -> open("/"));
        step("Ищем товар в поиске по артикулу", () -> {
            mainPage.getInputSelector().setValue(ring.getArticle()).pressEnter();
        });
        step("Проверяем, что октрылась правильная страница товара", () -> {
            productPage.getBrandTitleSelector().shouldHave(text(ring.getBrand()));
            productPage.getCategoryTitleSelector().scrollTo().shouldHave(text(ring.getCategory()));
        });
        step("Добавляем товар в корзину", () -> {
            productPage.getAddButtonSelector().filterBy(text(productPage.getAddButtonText())).first().click();
            productPage.getSizeSelector().filterBy(text(productPage.getSizeText())).first().click();
        });
        step("Переходим в корзину", () -> {
            sleep(2000);
            productPage.getCartButtonSelector()
                .filterBy(text(productPage.getCartButtonText())).first().click();
        });
        step("Проверяем корзину", () -> {
            cartPage.getGoodsInCartTitleSelector().shouldHave(text(cartPage.getGoodsInCartTitleText()));
        });
        step("Удаляем товар из корзины", () -> {
            cartPage.getGoodsIncrementerSelector().hover();
            cartPage.getRemoveButtonSelector().click();
            cartPage.getEmptyCartTitleSelector().shouldHave(text(cartPage.getEmptyCartTitleText()));
        });
    }

    @Test
    @Owner("kmigor")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка работы фильтров Материала, Цвета, Размера, Бренда, Страны производства.")
    public void filtersTest() {
        MainPage mainPage = new MainPage();
        ProductPage productPage = new ProductPage();
        GsdBall gsdBall = new GsdBall();
        ProductsListPage productsListPage = new ProductsListPage();

        step("Открываем главную страницу", () -> open("/"));
        step("Ищем товар в поиске по названию", () -> {
            mainPage.getInputSelector().setValue(gsdBall.getTextForInput()).pressEnter();
        });
        step("Настраиваем фильтр материалов", () -> {
            sleep(2000);
            productsListPage.getFilterSelector().filterBy(text(productsListPage.getMaterialFilterText()))
                    .first().click();
            productsListPage.getMaterialListItemSelector().filterBy(text(productsListPage.getPolymerText()))
                    .first().click();
            productsListPage.getConfirmButtonSelector().filterBy(text(productsListPage.getConfirmButtonText()))
                    .first().click();
        });
        step("Настраиваем фильтр цвета", () -> {
            productsListPage.getFilterSelector().filterBy(text(productsListPage.getColourFilterText()))
                    .first().click();
            productsListPage.getColourListItemSelector().filterBy(text(productsListPage.getMulticolourText()))
                    .first().click();
            productsListPage.getConfirmButtonSelector().filterBy(text(productsListPage.getConfirmButtonText()))
                    .first().click();
        });
        step("Настраиваем фильтр размера", () -> {
            productsListPage.getFilterSelector().filterBy(text(productsListPage.getSizeFilterText())).first().click();
            productsListPage.getSizeListItemSelector().filterBy(text(productsListPage.getSizeText())).first().click();
            productsListPage.getConfirmButtonSelector().filterBy(text(productsListPage.getConfirmButtonText()))
                    .first().click();
        });
        step("Настраиваем фильтр бренда", () -> {
            productsListPage.getFilterSelector().filterBy(text(productsListPage.getBrandFilterText())).first().click();
            productsListPage.getBrandListItemSelector().filterBy(text(productsListPage.getGsdText())).first().click();
            productsListPage.getConfirmButtonSelector().filterBy(text(productsListPage.getConfirmButtonText()))
                    .first().click();
        });
        step("Настраиваем фильтр страны производства", () -> {
            productsListPage.getFilterSelector().filterBy(text(productsListPage.getCountryFilterText()))
                    .first().click();
            productsListPage.getCountryListItemSelector().filterBy(text(productsListPage.getChinaText()))
                    .first().click();
            productsListPage.getConfirmButtonSelector().filterBy(text(productsListPage.getConfirmButtonText()))
                    .first().click();
        });
        step("Ищем в отфильтрованном списке товар", () -> gsdBall.getSearchSelector().should(Condition.exist)
                .scrollTo().click());
        step("Проверяем, что октрылась правильная страница товара", () -> {
            productPage.getBrandTitleSelector().shouldHave(text(gsdBall.getBrand()));
            productPage.getCategoryTitleSelector().scrollTo().shouldHave(text(gsdBall.getCategory()));
            productPage.getArticleTitleSelector().scrollTo().shouldHave(text(gsdBall.getArticle()));
        });
    }

    @Test
    @Owner("kmigor")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка сортировки товара по цене, по возрастанию.")
    public void sortingTest() {
        MainPage mainPage = new MainPage();
        ProductsListPage productsListPage = new ProductsListPage();
        Plaid plaid = new Plaid();

        step("Открываем главную страницу", () -> open("/"));
        step("Ищем товар в поиске по названию", () -> {
            mainPage.getInputSelector().setValue(plaid.getTextForInput()).pressEnter();
        });
        step("Настраиваем сортировку товаров по цене (по возрастанию)", () -> {
            sleep(2000);
            productsListPage.getFilterSelector().filterBy(text(productsListPage.getSortingText())).first().click();
            productsListPage.getSortingListItemSelector().filterBy(text(productsListPage.getSortingFromCheapest()))
                    .first().click();
        });
        step("Проверяем сортировку по цене", () -> {
            sleep(3000);
            double firstProductPrice = parsePrice(productsListPage.getFirstProductPriceElement().getText());
            double secondProductPrice = parsePrice(productsListPage.getSecondProductPriceElement().getText());

            assertTrue(firstProductPrice < secondProductPrice, "Цена первого товара должна быть " +
                    "меньше, чем второго");
        });
    }

    private double parsePrice(String priceText) {
        // Убираем валюту и пробелы, затем преобразуем в double
        String price = priceText.replaceAll("[^\\d,]", "").replace(",", ".");
        return Double.parseDouble(price);
    }
}