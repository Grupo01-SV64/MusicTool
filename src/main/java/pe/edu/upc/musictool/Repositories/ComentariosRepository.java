package pe.edu.upc.musictool.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.musictool.Entities.Comentaries;

@Repository
public interface ComentariosRepository extends JpaRepository<Comentaries,Integer> {
}
