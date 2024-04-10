package pe.edu.upc.musictool.Services;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.musictool.Entities.Content;

import java.util.List;

public interface iContentService {
    public void save(Content c);
    public void delete(Integer id);
    public List<Content> listContent();
    public List<Content> contentByLibraryName(String n);
    public List<Content> contentByLibraryId(Integer id);
}
