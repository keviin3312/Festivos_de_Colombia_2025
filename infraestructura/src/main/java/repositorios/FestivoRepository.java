package festivosdepais.infraestructura.repositorios;

import festivosdepais.dominio.entidades.Festivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FestivoRepository extends JpaRepository<Festivo, Integer> {

    // trae todos los festivos definidos para un país
    List<Festivo> findByIdPais(Integer idPais);
}
