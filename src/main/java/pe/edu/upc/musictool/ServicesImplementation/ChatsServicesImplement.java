package pe.edu.upc.musictool.ServicesImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.musictool.Entities.Chats;
import pe.edu.upc.musictool.Repositories.IChatsRepository;
import pe.edu.upc.musictool.Services.IChatsService;

import java.util.List;

@Service
public class ChatsServicesImplement implements IChatsService {

    @Autowired
    private IChatsRepository Cr;

    @Override
    public void save(Chats c) {
        Cr.save(c);
    }

    @Override
    public void delete(Integer id) {
       Cr.deleteById(id);
    }

    @Override
    public List<Chats> listChats() {
        return Cr.findAll();
    }
}
