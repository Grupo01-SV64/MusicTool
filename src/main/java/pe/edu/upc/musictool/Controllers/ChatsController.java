package pe.edu.upc.musictool.Controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.musictool.DTOs.ChatsDTO;
import pe.edu.upc.musictool.DTOs.LibraryDTO;
import pe.edu.upc.musictool.Entities.Chats;
import pe.edu.upc.musictool.Entities.Library;
import pe.edu.upc.musictool.Services.IChatsService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("musictool/chats")
public class ChatsController {

    @Autowired
    private IChatsService Cs;
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void save(@RequestBody ChatsDTO chatsDTO){
        ModelMapper m = new ModelMapper();
        Chats c = m.map(chatsDTO, Chats.class);
        Cs.save(c);
    }
    @GetMapping
    public List<ChatsDTO> list(){
        return Cs.listChats().stream().map(y-> {
            ModelMapper m = new ModelMapper();
            return m.map(y,ChatsDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        Cs.delete(id);
    }

}
