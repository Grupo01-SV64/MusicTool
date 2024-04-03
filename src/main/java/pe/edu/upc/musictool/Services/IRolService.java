package pe.edu.upc.musictool.Services;


import pe.edu.upc.musictool.Entities.Roles;

import java.util.List;

public interface IRolService {

     void insert(Roles ga);
     List<Roles> list();

    void Delete(Integer id);

    Roles findById(Integer id);


    List<Roles> findByName(String name);


}







