package pe.edu.upc.musictool.ServicesImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.musictool.Entities.Plans;
import pe.edu.upc.musictool.Services.PlanService;
import pe.edu.upc.musictool.Repositories.PlanRepository;
import java.util.List;

@Service
public class PlanServiceImplementation implements PlanService {
    @Autowired

    private PlanRepository pR;

    @Override
    public void insert(Plans p) { pR.save(p); }

    @Override
    public List<Plans> list() { return pR.findAll(); }

    @Override
    public void delete(Integer id) {
        pR.deleteById(id);
    }

    @Override
    public Plans findbyId(Integer id) {
        return pR.findById(id).orElseThrow();
    }

    @Override
    public List<Plans> findByNombrePlanes(String nombrePlanes) {
        return findByNombrePlanes(nombrePlanes);
    }
}