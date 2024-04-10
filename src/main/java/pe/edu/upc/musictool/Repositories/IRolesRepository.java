package pe.edu.upc.musictool.Repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.musictool.Entities.Roles;

import java.util.List;
@Repository
public interface IRolesRepository extends JpaRepository<Roles, Integer> {
    public List<Roles> findByNombreRol(String nombreRol);
}

