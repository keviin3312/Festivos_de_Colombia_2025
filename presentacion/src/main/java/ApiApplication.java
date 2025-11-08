import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(
        scanBasePackages = {
                "festivosdepais",   // dominio, infraestructura, core
                "servicios",        // tu servicio de la capa aplicacion
                "controladores"     // tu controller de arriba
        }
)
@EntityScan(basePackages = {
        "festivosdepais.dominio.entidades"
})
@EnableJpaRepositories(basePackages = {
        "festivosdepais.infraestructura.repositorios"
})
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
}
