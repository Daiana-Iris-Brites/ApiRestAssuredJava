package modulos.usuario;
import dataFactory.UsuarioDataFactory;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@Feature("User Creation")
@DisplayName("Teste de API Rest do modulo de Usuario")
public class usuarioTest {
    @BeforeEach
    public void setup() {
        baseURI = "https://reqres.in";
        basePath = "/api";
    }

    @Test
    @Description("Teste de criação de novo usuário com dados dinâmicos")
    @Step("Criando usuário e validando a resposta")
    public void testCreateUser() {
        // Gerar dados de usuário fictícios usando Faker
        given()
             .contentType(ContentType.JSON)
             .body(UsuarioDataFactory.createUsuario())
        .when()
                .post("/users")
        .then()
                .log().all()  // Logar todos os detalhes da resposta
                .assertThat()
                    .statusCode(201)
                    .body(matchesJsonSchemaInClasspath("createUserSchema.json"))
                    .body("name", notNullValue())
                    .body("job", notNullValue())
                    .body("id", notNullValue())
                    .body("createdAt", notNullValue());
    }
}
