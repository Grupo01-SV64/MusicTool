package pe.edu.upc.musictool.ServicesImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.musictool.DTOs.LibraryDTO;
import pe.edu.upc.musictool.Entities.Library;
import pe.edu.upc.musictool.Repositories.LibraryRepository;
import pe.edu.upc.musictool.Services.LibraryService;

import java.util.List;

@Service
public class LibraryServiceImplementation implements LibraryService {

    @Autowired
    private LibraryRepository libraryRepository;
    @Override
    public Library save(Library library) {
        return libraryRepository.save(library);
    }

    @Override
    public List<Library> list() {
        return libraryRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        libraryRepository.deleteById(id);
    }

    @Override
    public Library findbyId(Integer id) {
        return libraryRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Library> findByAccesibilidadAndNombre(boolean access, String nombre) {
        return findByAccesibilidadAndNombre(access,nombre);
    }
}
