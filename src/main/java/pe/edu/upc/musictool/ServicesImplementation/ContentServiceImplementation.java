package pe.edu.upc.musictool.ServicesImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.musictool.Entities.Content;
import pe.edu.upc.musictool.Repositories.iContentRepository;
import pe.edu.upc.musictool.Services.iContentService;

import java.util.List;

@Service
public class ContentServiceImplementation implements iContentService {

    @Autowired
    private iContentRepository cR;

    @Override
    public void save(Content c) {
        cR.save(c);
    }
    @Override
    public void delete(Integer id) {
        cR.deleteById(id);
    }
    @Override
    public List<Content> listContent() {
        return cR.findAll();
    }
    @Override
    public List<Content> contentByLibraryName(String n) {
        return cR.contentByLibraryName(n);
    }
    @Override
    public List<Content> contentByLibraryId(Integer id) {
        return cR.contentByLibraryId(id);
    }
}
