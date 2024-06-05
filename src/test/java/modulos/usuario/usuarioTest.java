package modulos.usuario;
import base.ApiConfig;
import pojo.UsuarioPojo;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@Feature("User Creation")
@DisplayName("Teste de API Rest do modulo de Usuario com sucesso")
public class usuarioTest extends ApiConfig {
    @Test
    @Description("Teste de criação de novo usuário com dados dinâmicos")
    @Step("Criando usuário com sucesso e validando a resposta")
    public void testCreateUser() {

        UsuarioPojo user = dataFactory.UserFactory.createUser();

        given()
             .contentType(ContentType.JSON)
             .body(user)
        .when()
                .post("/users")
        .then()
                .log().all()  // Logar todos os detalhes da resposta
                .assertThat()
                    .statusCode(201)
                    .body(matchesJsonSchemaInClasspath("createUserSchema.json"))
                    .body("id", notNullValue())
                    .body("createdAt", notNullValue())
                    .body("name", equalTo(user.getName()))
                    .body("job", equalTo(user.getJob()));
    }
//    @Test
//    @Description("Validar a criação de um usuário com nome em branco")
//    @Step("Criar usuário com nome em branco e validar resposta")
//    public void createUserWithBlankName() {
//        UsuarioPojo user = new UsuarioPojo("", "Software Developer");
//
//        given()
//                .contentType(ContentType.JSON)
//                .body(user)
//                .when()
//                .post("/users")
//                .then()
//                .statusCode(400)
//                .body("error", equalTo("Missing name"));
//    }
//
//    @Test
//    @Description("Validar a criação de um usuário com job em branco")
//    @Step("Criar usuário com job em branco e validar resposta")
//    public void createUserWithBlankJob() {
//        UsuarioPojo user = new UsuarioPojo("John Doe", "");
//
//        given()
//                .contentType(ContentType.JSON)
//                .body(user)
//                .when()
//                .post("/users")
//                .then()
//                .statusCode(400)
//                .body("error", equalTo("Missing job"));
//    }
//
//    @Test
//    @Description("Validar a criação de um usuário com nome e job em branco")
//    @Step("Criar usuário com nome e job em branco e validar resposta")
//    public void createUserWithBlankNameAndJob() {
//        UsuarioPojo user = new UsuarioPojo("", "");
//
//        given()
//                .contentType(ContentType.JSON)
//                .body(user)
//                .when()
//                .post("/users")
//                .then()
//                .statusCode(400)
//                .body("error", equalTo("Missing name and job"));
//    }
}
