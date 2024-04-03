package pe.edu.upc.musictool.Services;

import pe.edu.upc.musictool.Entities.Library;
import pe.edu.upc.musictool.Entities.Plans;

import java.util.List;

public interface PlanService {
    public void insert(Plans p);

    public List<Plans> list();

    public void delete (Integer id);

    public Plans findbyId(Integer id);

    public List<Plans> findByNombre(String nombrePlanes);
}