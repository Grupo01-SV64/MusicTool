package pe.edu.upc.musictool.Controllers;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.musictool.DTOs.LibraryDTO;
import pe.edu.upc.musictool.Entities.Library;
import pe.edu.upc.musictool.Services.LibraryService;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@RestController
@RequestMapping("api/libraries")
public class LibraryController {

    private LibraryService libraryService;
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Library save(@RequestBody @Validated LibraryDTO libraryDTO){
        ModelMapper m = new ModelMapper();
        Library l = m.map(libraryDTO,Library.class);
        return libraryService.save(l);
    }
    @GetMapping
    public List<LibraryDTO> list(){
        return libraryService.list().stream().map(y-> {
            ModelMapper m = new ModelMapper();
            return m.map(y,LibraryDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        libraryService.delete(id);
    }

    @GetMapping("/{id}")
    public LibraryDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        LibraryDTO libraryDTO=m.map(libraryService.findbyId(id),LibraryDTO.class);
        return libraryDTO;
    }
    @GetMapping("/find")
    public List<LibraryDTO> buscarFecha(@RequestParam boolean acess , @RequestParam String nombre){
        return libraryService.findByAccesibilidadAndNombre(acess,nombre).stream().map(y->{
            ModelMapper m= new ModelMapper();
            return m.map(y,LibraryDTO.class);
        }).collect(Collectors.toList());
    }

}
