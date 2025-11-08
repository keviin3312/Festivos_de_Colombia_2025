package festivosdepais.dominio.dto;

import java.time.LocalDate;

public class FestivoRespuestaDto {

    private String festivo;
    private LocalDate fecha;

    public FestivoRespuestaDto(String festivo, LocalDate fecha) {
        this.festivo = festivo;
        this.fecha = fecha;
    }

    public String getFestivo() {
        return festivo;
    }

    public LocalDate getFecha() {
        return fecha;
    }
}
