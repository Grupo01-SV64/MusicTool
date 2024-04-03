package pe.edu.upc.musictool.Controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.musictool.DTOs.RolesDTO;
import pe.edu.upc.musictool.Entities.Roles;
import pe.edu.upc.musictool.Services.IRolService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
public class RolesController {
    @Autowired
    private IRolService iG;

    @PostMapping
    public void insertar(@RequestBody RolesDTO rolesDTO){
       try{
           ModelMapper m=new ModelMapper();
           Roles g=m.map(rolesDTO,Roles.class);
           iG.insert(g);
       }catch (Exception e){
           e.printStackTrace();
          // Log.i("ERROR POST MAPPING", e.toString());
       }
    }

    @GetMapping
    public List<RolesDTO> listar(){

        return iG.list().stream().map(y->{
            ModelMapper m=new ModelMapper();
            return m.map(y,RolesDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping
    public void delete(Integer id){
        iG.Delete(id);
    }

    @GetMapping("/{id}")
    public RolesDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
       Roles result = iG.findById(id);
        RolesDTO rolesDTO =m.map(result,RolesDTO.class);
        return rolesDTO;
    }


    @GetMapping("/buscar")
    public List<RolesDTO> findByName(@RequestParam String name) {
        return iG.findByName(name).stream().map(y -> {
            ModelMapper m = new ModelMapper();
            return m.map(y, RolesDTO.class);
        }).collect(Collectors.toList());
    }

}