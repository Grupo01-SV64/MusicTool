package pe.edu.upc.musictool.Repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upc.musictool.Entities.Roles;

import java.util.List;

public interface IRolesRepository extends JpaRepository<Roles, Integer> {
    public List<Roles> findByNombreRol(String nombreRol);
}
