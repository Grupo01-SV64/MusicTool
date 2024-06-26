package pe.edu.upc.musictool.ServicesImplementation;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.musictool.DTOs.ComentarieDTO;
import pe.edu.upc.musictool.Entities.Comentaries;
import pe.edu.upc.musictool.Repositories.ComentariosRepository;
import pe.edu.upc.musictool.Services.ComentariosService;

import java.time.LocalDate;
import java.util.List;

@Service
public class ComentarioServiceImplementation implements ComentariosService {

    @Autowired
    private ComentariosRepository comentariosRepository;

    @Override
    public void create(Comentaries comentarios) {
        comentariosRepository.save(comentarios);
    }

    @Override
    public List<Comentaries> COMENTARIOS_LIST() {
        return comentariosRepository.findAll();

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Comentaries findbyId(Integer id) {
        return null;
    }

    @Override
    public List<Comentaries> COMENTARIES_LIST(LocalDate fecha) {
        return comentariosRepository.findByfechaComentario(fecha);
    }

}
