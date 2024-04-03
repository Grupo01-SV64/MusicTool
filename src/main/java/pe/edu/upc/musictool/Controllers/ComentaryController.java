
package pe.edu.upc.musictool.Controllers;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.musictool.DTOs.ComentarieDTO;
import pe.edu.upc.musictool.Entities.Comentaries;
import pe.edu.upc.musictool.Services.ComentariosService;

import java.util.List;


@RestController
@RequestMapping("api/comentarios")
public class ComentaryController {
    @Autowired
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

}
