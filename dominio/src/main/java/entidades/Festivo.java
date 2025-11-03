package entidades;

import org.hibernate.annotations.Collate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table(name = "Festivo")
public class Festivo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "secuencia_festivo")
    @SequenceGenerator(name = "secuencia_festivo", sequenceName = "secuencia_festivo", allocationSize= 1)

    private int id;

    @Column(name = "Festivo", length = 100, unique = true)
    private String idPais;

    @Column(name = "name", length = 100, unique = true)
    private String name;

    @Column(name = "Dia", length = 100, unique = true)
    private int Dia;

    @Column(name = "Mes", length = 100, unique = true)
    private int Mes;

    @Column(name = "DiasPascua", length = 100, unique = true)
    private int DiasPascua;

    @ManyToOne
    @JoinColumn(name = "IdTipo", referencedColumnName = "id")
    private TipoFestivo IdTipo;

    public Festivo() {
    }

    public Festivo(int id, String idPais, String name, int dia, int mes, int diasPascua, TipoFestivo idTipo) {
        this.id = id;
        this.idPais = idPais;
        this.name = name;
        Dia = dia;
        Mes = mes;
        DiasPascua = diasPascua;
        IdTipo = idTipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdPais() {
        return idPais;
    }

    public void setIdPais(String idPais) {
        this.idPais = idPais;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDia() {
        return Dia;
    }

    public void setDia(int dia) {
        Dia = dia;
    }

    public int getMes() {
        return Mes;
    }

    public void setMes(int mes) {
        Mes = mes;
    }

    public int getDiasPascua() {
        return DiasPascua;
    }

    public void setDiasPascua(int diasPascua) {
        DiasPascua = diasPascua;
    }

    public TipoFestivo getIdTipo() {
        return IdTipo;
    }

    public void setIdTipo(TipoFestivo idTipo) {
        IdTipo = idTipo;
    }

    

}
