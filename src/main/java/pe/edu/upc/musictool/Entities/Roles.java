package pe.edu.upc.musictool.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="Roles")
public class Roles {

    @Getter
    @Id
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Getter
    @Setter
    @Column(name = "nombreRol", nullable = false, length = 35)
    private String nombreRol;
    @Getter
    @Setter
    @Column(name = "descripcion",nullable = false, length = 255)
    private String descripcionRol;



    @Override
    public String toString() {
        return "Roles{" +
                "id=" + id +
                ", nombreRol='" + nombreRol + '\'' +
                ", descripcionRol='" + descripcionRol + '\'' +
                '}';
    }
}
