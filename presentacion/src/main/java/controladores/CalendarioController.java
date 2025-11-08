package controladores;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import festivosdepais.dominio.entidades.Festivo;
import servicios.CalendarioFestivosServicio;

@RestController
public class CalendarioController {

    private final CalendarioFestivosServicio calendarioFestivosServicio;

    public CalendarioController(CalendarioFestivosServicio calendarioFestivosServicio) {
        this.calendarioFestivosServicio = calendarioFestivosServicio;
    }

    // GET http://localhost:8080/festivos/1/2023
    @GetMapping("/festivos/{idPais}/{anio}")
    public List<Festivo> listar(@PathVariable Integer idPais, @PathVariable Integer anio) {
        return calendarioFestivosServicio.obtenerFestivosPorPaisYAnio(idPais, anio);
    }
}
