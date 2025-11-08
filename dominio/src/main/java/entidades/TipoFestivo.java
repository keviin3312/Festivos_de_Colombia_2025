package festivosdepais.dominio.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "tipofestivo")
public class TipoFestivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "tipo", nullable = false, unique = true, length = 100)
    private String tipo;

    public TipoFestivo() {
    }

    public TipoFestivo(Integer id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
