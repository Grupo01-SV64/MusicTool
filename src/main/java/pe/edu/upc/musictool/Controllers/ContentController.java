package pe.edu.upc.musictool.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.musictool.DTOs.ContentDTO;
import pe.edu.upc.musictool.Entities.Content;
import pe.edu.upc.musictool.Services.iContentService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("musictool/contents")
public class ContentController {

    @Autowired
    private iContentService Cs;

    @PostMapping
    public void create(@RequestBody ContentDTO contentDTO) {
        ModelMapper m = new ModelMapper();
        Content c = m.map(contentDTO, Content.class);
        Cs.save(c);
    }
    @GetMapping
    public List<ContentDTO> list() {
        return Cs.listContent().stream().map(
                y -> {
                    ModelMapper m = new ModelMapper();
                    return m.map(y, ContentDTO.class);
                }
        ).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name = "id") Integer id) {
        Cs.delete(id);
    }

    @GetMapping("/cantidadpornombre")
    public List<ContentDTO> quantityContentByLibraryName(@RequestParam String n){
        return Cs.contentByLibraryName(n).stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,ContentDTO.class);
        }).collect(Collectors.toList());
    }
    @GetMapping("/cantidadporid")
    public List<ContentDTO> quantityContentByLibraryId(@RequestParam Integer id){
        return Cs.contentByLibraryId(id).stream().map(y->{
            ModelMapper m = new ModelMapper();
            return m.map(y,ContentDTO.class);
        }).collect(Collectors.toList());
    }

}
