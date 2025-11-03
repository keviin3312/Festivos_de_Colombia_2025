package festivosdepais.api.dto;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public record festivoDto(

       @Id
       private String nombre,
       private LocalDate fecha,
       private String tipo,
       private String pais

       
) {

    public String nombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate fecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String tipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String pais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }}

