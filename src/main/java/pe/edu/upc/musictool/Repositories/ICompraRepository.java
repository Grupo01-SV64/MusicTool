package pe.edu.upc.musictool.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.musictool.Entities.Compra;
@Repository
public interface ICompraRepository extends JpaRepository <Compra, Integer> {

}
