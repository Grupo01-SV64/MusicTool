package pe.edu.upc.musictool.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.musictool.Entities.Comentaries;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ComentariosRepository extends JpaRepository<Comentaries,Integer> {
    public List<Comentaries>findByfechaComentario (LocalDate fecha);
}
