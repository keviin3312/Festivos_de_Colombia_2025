package festivosdepais.aplicacion.servicios;

import festivosdepais.core.servicios.ServicioFechas;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class FestivoServicio {

    public LocalDate calcularPascua(int anio) {
        return ServicioFechas.getDomingoPascua(anio);
    }

    public LocalDate calcularSiguienteLunes(LocalDate fecha) {
        return ServicioFechas.siguienteLunes(fecha);
    }
}
