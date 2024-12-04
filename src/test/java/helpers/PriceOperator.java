package helpers;

public class PriceOperator {

    public static double parsePrice(String priceText) {
        // Убираем валюту и пробелы, затем преобразуем в double
        String price = priceText.replaceAll("[^\\d,]", "").replace(",", ".");
        return Double.parseDouble(price);
    }
}