package pe.edu.upc.musictool.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;
import pe.edu.upc.musictool.Entities.Content;

import java.util.List;

@Repository
public interface iContentRepository extends JpaRepository<Content,Integer> {

    @Query("from Content c where c.library.nombre=:n")
    public List<Content> contentByLibraryName(@Param("n") String n);

    @Query("from Content c where c.library.id=:d")
    public List<Content> contentByLibraryId(@Param("d") Integer d);

//    @Query("from Content c where c.")
//    public List<String[]> quantityContentByLibrary();
}
