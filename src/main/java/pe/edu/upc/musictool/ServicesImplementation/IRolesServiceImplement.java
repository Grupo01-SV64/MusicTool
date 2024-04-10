package pe.edu.upc.musictool.ServicesImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.musictool.Entities.Roles;
import pe.edu.upc.musictool.Repositories.IRolesRepository;
import pe.edu.upc.musictool.Services.IRolService;


import java.util.List;

@Service
public class IRolesServiceImplement implements IRolService {
    @Autowired
    private IRolesRepository gaR;
    @Override
    public void insert(Roles ga) {
        gaR.save(ga);
    }

    @Override
    public List<Roles> list() {
        return gaR.findAll();
    }

    @Override
    public void Delete(Integer id) {
        gaR.deleteById(id);
    }

    @Override
    public Roles findById(Integer id) {
       return gaR.findById(id).orElseThrow();
    }

    @Override
    public List<Roles>findByName(String name) {
        return gaR.findByNombreRol(name);
    }

}
