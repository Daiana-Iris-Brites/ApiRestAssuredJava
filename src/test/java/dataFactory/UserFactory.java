package dataFactory;

import com.github.javafaker.Faker;
import pojo.UsuarioPojo;

public class UserFactory {
    private static final Faker faker = new Faker();

    public static UsuarioPojo createUser() {
        return new UsuarioPojo(faker.name().firstName(), faker.job().title());
    }
}
