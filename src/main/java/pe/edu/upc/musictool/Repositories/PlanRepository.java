package pe.edu.upc.musictool.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.musictool.Entities.Plans;

import java.util.List;

@Repository
public interface PlanRepository extends JpaRepository<Plans,Integer> {
    public List<Plans> findByNombrePlanes(String nombrePlanes);
}
