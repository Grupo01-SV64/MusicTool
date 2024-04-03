
package pe.edu.upc.musictool.Controllers;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.musictool.DTOs.ComentarieDTO;
import pe.edu.upc.musictool.Entities.Comentaries;
import pe.edu.upc.musictool.Services.ComentariosService;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@RestController
@RequestMapping("api/comentarios")
public class ComentaryController {

    private ComentariosService  libraryService;

    private ComentariosService comentariosService;


    @PostMapping
    public void save(@RequestBody ComentarieDTO comentariosDTO) {
        ModelMapper m = new ModelMapper();
        Comentaries comentarios = m.map(comentariosDTO, Comentaries.class);
        comentariosService.create(comentarios);
    }

    @GetMapping
    public List<Comentaries> comentariosList() {
        return comentariosService.COMENTARIOS_LIST();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        comentariosService.delete(id);
    }
    @GetMapping("/{id}")
    public ComentarieDTO listarId(@PathVariable("id") Integer id, ComentarieDTO ComentarieDTO){
        ModelMapper m=new ModelMapper();
        ComentarieDTO libraryDTO=m.map(comentariosService.findbyId(id),ComentarieDTO.class);
        return ComentarieDTO;
    }
    @GetMapping("/find")
    public List<ComentarieDTO> buscarFecha(@RequestParam boolean acess , @RequestParam String nombre){
        return comentariosService.findByAccesibilidadAndNombre(acess,nombre).stream().map(y->{
            ModelMapper m= new ModelMapper();
            return m.map(y,ComentarieDTO.class);
        }).collect(Collectors.toList());
    }
}
