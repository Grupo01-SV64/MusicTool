package pe.edu.upc.musictool.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "chats")
public class Chats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id_one")
    private Users usersIdOne;
    @ManyToOne
    @JoinColumn(name = "user_id_two")
    private Users usersIdTwo;

    public Chats(Integer id, Users usersIdOne, Users usersIdTwo) {
        this.id = id;
        this.usersIdOne = usersIdOne;
        this.usersIdTwo = usersIdTwo;
    }

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
