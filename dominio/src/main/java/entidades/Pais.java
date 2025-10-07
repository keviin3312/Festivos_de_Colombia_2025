package festivosdepais.api.dominio.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "Pais")
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "secuencia_pais")
    @SequenceGenerator(name = "secuencia_pais", sequenceName = "secuencia_pais", allocationSize = 1)

    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "Nombre", referencedColumnName = "id")
    private Festivo Nombre;

    public Pais() {
    }

    public Pais(int id, TipoFestivo nombre) {
        this.id = id;
        Nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoFestivo getNombre() {
        return Nombre;
    }

    public void setNombre(TipoFestivo nombre) {
        Nombre = nombre;
    }

    
    
}
