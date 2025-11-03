package festivosdepais.api.dto;

import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class festivoDto {

    @Id
    private String nombre;
    private LocalDate fecha;
    private String tipo;
    private String pais;

    // Constructor vacío (obligatorio para JPA)
    public festivoDto() {
    }

    // Constructor con todos los campos
    public festivoDto(String nombre, LocalDate fecha, String tipo, String pais) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.tipo = tipo;
        this.pais = pais;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
