package helpers;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Good;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class JsonChecker {

    ClassLoader cl = JsonChecker.class.getClassLoader();

    public void checkJson(String fileName, String category, String brand) throws IOException {
        String jsonString = readJsonFromResource(fileName);
        ObjectMapper objectMapper = new ObjectMapper();
        Good good = objectMapper.readValue(jsonString, Good.class);
        assertThat(good.getCategory()).isEqualTo(category);
        assertThat(good.getBrand()).isEqualTo(brand);
    }

    public String readJsonFromResource(String fileName) throws IOException {
        try (InputStream inputStream = cl.getResourceAsStream(fileName)) {
            assert inputStream != null;
            try (Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8)) {
                return scanner.useDelimiter("\\A").next();
            }
        }
    }
}