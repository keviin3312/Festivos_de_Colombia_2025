package festivosdepais.infraestructura.repositorios;

import festivosdepais.dominio.entidades.TipoFestivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoFestivoRepository extends JpaRepository<TipoFestivo, Integer> {

    // por si quieres buscarlo por nombre
    TipoFestivo findByTipo(String tipo);
}
