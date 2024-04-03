package pe.edu.upc.musictool.Services;

import pe.edu.upc.musictool.Entities.Comentaries;

import java.util.List;

public interface ComentariosService {
    public void create(Comentaries comentarios);
    public List<Comentaries> COMENTARIOS_LIST();
    public void delete (Integer id);

    public Comentaries findbyId(Integer id);

    public List<Comentaries> findByAccesibilidadAndNombre(boolean access, String nombre);
}
