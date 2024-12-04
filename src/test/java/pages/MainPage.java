package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {
    private final SelenideElement inputSelector = $("[class*='_input_']");

    public void openPage(){
        open("/");
    }

    public void findGood(String request){
        inputSelector.setValue(request).pressEnter();
    }
}