package pages.components.ProductListPageFilters;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$$;

public class SortingFilter {

    private final String name = "Подобрали для вас";
    private final String sortingFromCheapest = "Сначала дешевле";
    private final ElementsCollection sortingListItemSelector = $$("[class*='_item_']");

    public void sortFromCheapest(){
        sortingListItemSelector.filterBy(text(sortingFromCheapest))
                .first().click();
    }

    public String getName() {
        return name;
    }
}
