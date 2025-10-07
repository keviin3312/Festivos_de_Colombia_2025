package festivosdepais.api.dominio.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "festivo")
public class TipoFestivo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "secuencia_Tipo_Festivo")
    @SequenceGenerator(name = "secuencia_Tipo_Festivo", sequenceName = "secuencia_Tipo_Festivo", allocationSize = 1)

    @Column(name = "id")
    private int id;

    @Column(name = "festivo", length = 100, unique = true)
    private String tipo;

    public TipoFestivo() {
    }

    public TipoFestivo(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}