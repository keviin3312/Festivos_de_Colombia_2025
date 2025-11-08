package servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import festivosdepais.infraestructura.repositorios.FestivoRepository;
import festivosdepais.dominio.entidades.Festivo;

@Service
public class CalendarioFestivosServicio {

    private final FestivoRepository festivoRepository;

    public CalendarioFestivosServicio(FestivoRepository festivoRepository) {
        this.festivoRepository = festivoRepository;
    }

    /**
     * Por ahora devolvemos los festivos tal cual están en la tabla
     * filtrados solo por país, porque la entidad del dominio no expone
     * todos los getters que intentábamos usar.
     * Si luego quieres aplicar la lógica por año, la metemos aquí.
     */
    public List<Festivo> obtenerFestivosPorPaisYAnio(Integer idPais, Integer anio) {
        return festivoRepository.findByIdPais(idPais);
    }
}
