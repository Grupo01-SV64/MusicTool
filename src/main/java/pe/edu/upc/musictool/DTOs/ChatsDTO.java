package pe.edu.upc.musictool.DTOs;

import jakarta.persistence.*;
import pe.edu.upc.musictool.Entities.Users;

public class ChatsDTO {
    private Integer id;
    private Users usersIdOne;
    private Users usersIdTwo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Users getUsersIdOne() {
        return usersIdOne;
    }

    public void setUsersIdOne(Users usersIdOne) {
        this.usersIdOne = usersIdOne;
    }

    public Users getUsersIdTwo() {
        return usersIdTwo;
    }

    public void setUsersIdTwo(Users usersIdTwo) {
        this.usersIdTwo = usersIdTwo;
    }
}
