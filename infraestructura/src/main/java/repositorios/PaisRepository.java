package festivosdepais.infraestructura.repositorios;

import festivosdepais.dominio.entidades.Pais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Integer> {

    // si algún día quieres buscar por nombre:
    Pais findByNombre(String nombre);
}
