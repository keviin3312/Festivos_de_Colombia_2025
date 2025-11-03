package festivosdepais.api.infraestructura.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import festivosdepais.api.dominio.entidades;

@Repository
public interface IpaisRepository extends JpaRepository<Pais, integer> {

    @Query("SELECT p FROM pais p WHERE p.nombre LIKE '%' || ?1 || '&' ORDER BY p.nombre ASC ")
    public List <pais> buscar (string nombre);

}
