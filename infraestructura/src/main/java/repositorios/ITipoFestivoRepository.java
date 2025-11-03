package festivosdepais.api.infraestructura.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import festivosdepais.api.dominio.entidades;

@Repository
public interface ITipoFestivoRepository extends JpaRepository<TipoFestivo, integer>  {

    @Query("SELECT t FROM TipoFestivo t WHERE p.nombre LIKE '%' || ?1 || '&' ORDER BY t.nombre ASC ")
    public List <TipoFestivo> buscar (string nombre);

}
