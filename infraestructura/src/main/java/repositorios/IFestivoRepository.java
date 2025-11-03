package repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import entidades.Festivo;

@Repository
public interface IFestivoRepository extends JpaRepository<Festivo, Long> {

    @Query("SELECT f FROM Festivo f " +
           "WHERE LOWER(f.nombre) LIKE LOWER(CONCAT('%', :nombre, '%')) " +
           "ORDER BY f.nombre ASC")
    List<Festivo> buscar(String nombre);
}



// package festivosdepais.api.infraestructura.repository;

// import java.util.List;
// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.stereotype.Repository;
// import festivosdepais.api.dominio.entidades;

// @Repository
// public interface IFestivoRepository extends JpaRepository<Festivo, integer> {
 
//   @Query("SELECT f FROM Festivo f WHERE f.nombre LIKE '%' || ?1 || '&' ORDER BY f.nombre ASC ")
//   public List <Festivo> buscar (string nombre);

// }
