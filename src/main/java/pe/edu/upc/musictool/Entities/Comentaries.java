
package pe.edu.upc.musictool.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;


@Entity
public class Comentaries {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "comentario",nullable = false, length = 255)
    private String comentario;

    @Column(name = "fechaComentario",nullable = false)
    private LocalDate fechaComentario;

    public Comentaries(Integer id, String comentario, LocalDate fechaComentario) {
        this.id = id;
        this.comentario = comentario;
        this.fechaComentario = fechaComentario;
    }

    public Comentaries() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDate getFechaComentario() {
        return fechaComentario;
    }

    public void setFechaComentario(LocalDate fechaComentario) {
        this.fechaComentario = fechaComentario;
    }
}
