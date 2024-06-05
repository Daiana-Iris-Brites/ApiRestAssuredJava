package base;

import org.junit.jupiter.api.BeforeEach;
import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;

public class ApiConfig {
    @BeforeEach
    public void setup() {
        baseURI = "https://reqres.in";
        basePath = "/api";
    }
}
