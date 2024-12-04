package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Good {
    private String category;
    private String brand;

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }
}