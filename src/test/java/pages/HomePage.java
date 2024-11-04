package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class HomePage extends Page {
    private final SelenideElement activePage = $("._genderWrapper_i3n1m_74 .router-link-active");

    private final String womenPage = "Женщинам";
    private final String menPage = "Мужчинам";
    private final String kidsPage = "Детям";

    public SelenideElement getActivePage() {
        return activePage;
    }

    public String getWomenPage() {
        return womenPage;
    }

    public String getMenPage() {
        return menPage;
    }

    public String getKidsPage() {
        return kidsPage;
    }
}