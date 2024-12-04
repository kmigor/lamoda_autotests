package tests;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.*;


import static io.qameta.allure.Allure.step;

public class LamodaTests extends TestBase {
    MainPage mainPage = new MainPage();
    ProductPage productPage = new ProductPage();
    ProductsListPage productsListPage = new ProductsListPage();

    @Test
    @Owner("kmigor")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Т001 - Проверка поиска кольца по артикулу.")
    public void searchProductByArticleTest() {
        String article = "MPJWLXW00FFK";

        step("Открываем главную страницу", mainPage::openPage);
        step("Ищем товар в поиске по артикулу", () -> mainPage.findGood(article));
        step("Проверяем, что открылась правильная страница товара", () -> productPage.checkPage("goods/Ring.json"));
    }

    @Test
    @Owner("kmigor")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Т002 - Проверка поиска мяча Demix через ключевое слово.")
    public void searchProductByNameTest() {
        String keyWord = "мяч";
        String article = "MP002XG01OCM";

        step("Открываем главную страницу", mainPage::openPage);
        step("Ищем товар в поиске по названию", () -> mainPage.findGood(keyWord));
        step("Ищем в каталоге требуемый товар", () -> productsListPage.findGood(article));
        step("Проверяем, что октрылась правильная страница товара", () -> productPage.checkPage("goods/DemixBall.json"));
    }

    @Test
    @Owner("kmigor")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Т003 - Проверка работы корзины. Добавление товара в корзину, удаление товара из корзины.")
    public void cartTest() {
        String article = "MPJWLXW00FFK";
        String size = "16 RUS";
        CartPage cartPage = new CartPage();

        step("Открываем главную страницу", mainPage::openPage);
        step("Ищем товар в поиске по артикулу", () -> mainPage.findGood(article));
        step("Проверяем, что открылась правильная страница товара", () -> productPage.checkPage("goods/Ring.json"));
        step("Добавляем товар в корзину", () -> productPage.addToCart(size));
        step("Переходим в корзину", productPage::openCart);
        step("Проверяем корзину", cartPage::checkPage);
        step("Удаляем товар из корзины", cartPage::removeGood);
    }

    @Test
    @Owner("kmigor")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Т004 - Проверка работы фильтров Материала, Цвета, Размера, Бренда, Страны производства.")
    public void filtersTest() {
        String keyWord = "мяч";
        String material = "Полимер";
        String colour = "Мультиколор";
        String size = "7";
        String brand = "GSD";
        String country = "Китай";
        String article = "MP002XU0D9YZ";

        step("Открываем главную страницу", mainPage::openPage);
        step("Ищем товар в поиске по названию", () -> mainPage.findGood(keyWord));
        step("Настраиваем фильтр материалов", () -> productsListPage.addMaterialFilter(material));
        step("Настраиваем фильтр цвета", () -> productsListPage.addColourFilter(colour));
        step("Настраиваем фильтр размера", () -> productsListPage.addSizeFilter(size));
        step("Настраиваем фильтр бренда", () -> productsListPage.addBrandFilter(brand));
        step("Настраиваем фильтр страны производства", () -> productsListPage.addCountryFilter(country));
        step("Ищем в отфильтрованном списке товар", () -> productsListPage.findGood(article));
        step("Проверяем, что октрылась правильная страница товара", () -> productPage.checkPage("goods/GsdBall.json"));
    }

    @Test
    @Owner("kmigor")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Т005 - Проверка сортировки товара по цене, по возрастанию.")
    public void sortingTest() {
        String keyWord = "плед";

        step("Открываем главную страницу", mainPage::openPage);
        step("Ищем товар в поиске по названию", () -> mainPage.findGood(keyWord));
        step("Настраиваем сортировку товаров по цене (по возрастанию)", productsListPage::addSortingFromCheapest);
        step("Проверяем сортировку по цене", productsListPage::checkSorting);
    }
}