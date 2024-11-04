package tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.CartPage;
import pages.MainPage;
import pages.HomePage;

public class LamodaTests extends TestBase {

    WebSteps webSteps = new WebSteps();

    @Test
    @DisplayName("Тест открытия главной страницы")
    @Feature("Основные страницы")
    @Story("Создание главной страницы")
    @Owner("kmigor")
    @Severity(SeverityLevel.CRITICAL)
    public void mainPageTest(){

        MainPage mainPage = new MainPage();

        webSteps.openPage("/");
        webSteps.checkHeader(mainPage.getHeader(), mainPage.getHeaderText());
        webSteps.checkTitle(mainPage.getTitle(), mainPage.getTitleText());
        webSteps.checkFooter(mainPage.getFooter(), mainPage.getFooterText());
    }

    @Test
    @DisplayName("Тест открытия страницы женских товаров")
    @Feature("Основные страницы")
    @Story("Создание страницы женских товаров")
    @Owner("kmigor")
    @Severity(SeverityLevel.CRITICAL)
    public void womenHomeTest(){
        HomePage homePage = new HomePage();

        webSteps.openPage("/women-home");
        webSteps.checkHeader(homePage.getHeader(), homePage.getHeaderText());
        webSteps.checkActivePage(homePage.getActivePage(), homePage.getWomenPage());
        webSteps.checkFooter(homePage.getFooter(), homePage.getFooterText());
    }

    @Test
    @DisplayName("Тест открытия страницы мужских товаров")
    @Feature("Основные страницы")
    @Story("Создание страницы мужских товаров")
    @Owner("kmigor")
    @Severity(SeverityLevel.CRITICAL)
    public void menHomeTest(){
        HomePage homePage = new HomePage();

        webSteps.openPage("/men-home");
        webSteps.checkHeader(homePage.getHeader(), homePage.getHeaderText());
        webSteps.checkActivePage(homePage.getActivePage(), homePage.getMenPage());
        webSteps.checkFooter(homePage.getFooter(), homePage.getFooterText());
    }

    @Test
    @DisplayName("Тест открытия страницы детских товаров")
    @Feature("Основные страницы")
    @Story("Создание страницы детских товаров")
    @Owner("kmigor")
    @Severity(SeverityLevel.CRITICAL)
    public void kidsHomeTest(){
        HomePage homePage = new HomePage();

        webSteps.openPage("/kids-home");
        webSteps.checkHeader(homePage.getHeader(), homePage.getHeaderText());
        webSteps.checkActivePage(homePage.getActivePage(), homePage.getKidsPage());
    }

    @Test
    @DisplayName("Тест открытия пустой корзины")
    @Feature("Основные страницы")
    @Story("Создание страницы корзины товаров")
    @Owner("kmigor")
    @Severity(SeverityLevel.CRITICAL)
    public void cartTest(){
        CartPage cartPage = new CartPage();

        webSteps.openPage("/checkout/cart");
        webSteps.checkHeader(cartPage.getHeader(), cartPage.getHeaderText());
        webSteps.checkActivePage(cartPage.getTitle(), cartPage.getTitleText());
    }
}