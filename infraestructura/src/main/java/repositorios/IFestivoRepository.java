package festivosdepais.infraestructura.repository;

import entidades.Festivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IFestivoRepository extends JpaRepository<Festivo, Integer> {

    // buscar por nombre (en tu entidad el campo se llama "name")
    @Query("SELECT f FROM Festivo f WHERE LOWER(f.name) LIKE LOWER(CONCAT('%', :nombre, '%')) ORDER BY f.name ASC")
    List<Festivo> buscar(String nombre);
}
