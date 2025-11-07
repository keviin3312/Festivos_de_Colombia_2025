package festivosdepais.presentacion.controladores;

import festivosdepais.aplicacion.servicios.FestivoServicio;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.Map;

@RestController
@RequestMapping("/api/festivos")
public class FechasControlador {

    private final FestivoServicio servicio;

    public FechasControlador(FestivoServicio servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/pascua/{anio}")
    public Map<String, String> obtenerPascua(@PathVariable("anio") int anio) {
        LocalDate fecha = servicio.calcularPascua(anio);
        return Map.of("anio", String.valueOf(anio), "domingoPascua", fecha.toString());
    }

    @GetMapping("/siguiente-lunes")
    public Map<String, String> obtenerSiguienteLunes(@RequestParam String fecha) {
        LocalDate original = LocalDate.parse(fecha);
        LocalDate siguiente = servicio.calcularSiguienteLunes(original);
        return Map.of("original", original.toString(), "siguienteLunes", siguiente.toString());
    }
}
