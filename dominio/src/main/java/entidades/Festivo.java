// dominio/src/main/java/festivosdepais/dominio/entidades/Festivo.java
package festivosdepais.dominio.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "\"Festivo\"")
public class Festivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // en tu tabla esto es INT NOT NULL
    @Column(name = "idpais", nullable = false)
    private Integer idPais;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    // para festivos fijos
    @Column(name = "dia", nullable = false)
    private Integer dia;

    @Column(name = "mes", nullable = false)
    private Integer mes;

    // para festivos por pascua
    @Column(name = "diaspascua", nullable = false)
    private Integer diasPascua;

    @ManyToOne
    @JoinColumn(name = "idtipo", nullable = false)
    private TipoFestivo tipoFestivo;

    // getters/setters
}
