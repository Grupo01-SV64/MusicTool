package pe.edu.upc.musictool.Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="Roles")
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombreRol", nullable = false, length = 35)
    private String nombreRol;

    @Column(name = "descripcionRol",nullable = false, length = 255)
    private String descripcionRol;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public String getDescripcionRol() {
        return descripcionRol;
    }

    public void setDescripcionRol(String descripcionRol) {
        this.descripcionRol = descripcionRol;
    }

    public Roles(int id, String nombreRol, String descripcionRol) {
        this.id = id;
        this.nombreRol = nombreRol;
        this.descripcionRol = descripcionRol;
    }

    public Roles() {
    }
}
