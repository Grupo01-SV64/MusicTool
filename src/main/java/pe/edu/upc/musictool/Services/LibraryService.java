package pe.edu.upc.musictool.Services;

import pe.edu.upc.musictool.DTOs.LibraryDTO;
import pe.edu.upc.musictool.Entities.Library;

import java.util.List;

public interface LibraryService {
    public Library save(Library library);

    public List<Library> list();

    public void delete (Integer id);

    public Library findbyId(Integer id);

    public List<Library> findByAccesibilidadAndNombre(boolean access, String nombre);
}
