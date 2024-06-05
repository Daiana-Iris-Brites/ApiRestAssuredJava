package dataFactory;
import pojo.UsuarioPojo;
import com.github.javafaker.Faker;

public class UsuarioDataFactory {
      public static UsuarioPojo createUsuario() {

        Faker faker = new Faker();
        UsuarioPojo usuario = new UsuarioPojo();
        String name = faker.name().fullName();
        String job = faker.job().title();
        usuario.setName(name);
        usuario.setJob(job);

        return usuario;
    }
}
