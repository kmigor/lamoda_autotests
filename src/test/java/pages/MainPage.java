package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private final SelenideElement inputSelector = $("[class*='_input_']");

    public SelenideElement getInputSelector() {
        return inputSelector;
    }
}