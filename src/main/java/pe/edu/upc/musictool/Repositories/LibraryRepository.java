package pe.edu.upc.musictool.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.musictool.Entities.Library;

import java.util.List;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Integer> {
    public List<Library> findByAccesibilidadAndNombre(boolean access, String Nombre);
}
