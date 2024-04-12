package pe.edu.upc.musictool.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.musictool.DTOs.PlanDTO;
import pe.edu.upc.musictool.Entities.Plans;
import pe.edu.upc.musictool.Services.PlanService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("musictool/plans")
public class PlanController {
    @Autowired
    private PlanService iP;

    @PostMapping
    public void insertar(@RequestBody PlanDTO planesDto){
        ModelMapper m = new ModelMapper();
        Plans p = m.map(planesDto,Plans.class);
        iP.insert(p);
    }

    @GetMapping
    public List<PlanDTO> listar(){
        return iP.list().stream().map(y-> {
            ModelMapper m = new ModelMapper();
            return m.map(y,PlanDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        iP.delete(id);
    }

    @GetMapping("/{id}")
    public PlanDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        PlanDTO planDTO=m.map(iP.findbyId(id),PlanDTO.class);
        return planDTO;
    }
    @GetMapping("/find")
    public List<PlanDTO> buscarFecha(@RequestParam String nombrePlanes){
        return iP.findByNombrePlanes(nombrePlanes).stream().map(y->{
            ModelMapper m= new ModelMapper();
            return m.map(y,PlanDTO.class);
        }).collect(Collectors.toList());
    }
}