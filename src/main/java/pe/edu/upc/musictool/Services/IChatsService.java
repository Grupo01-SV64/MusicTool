package pe.edu.upc.musictool.Services;

import pe.edu.upc.musictool.Entities.Chats;

import java.util.List;

public interface IChatsService {
    public void save(Chats c);
    public void delete(Integer id);
    public List<Chats> listChats();

}
