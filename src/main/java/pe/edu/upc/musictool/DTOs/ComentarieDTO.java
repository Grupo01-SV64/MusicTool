package pe.edu.upc.musictool.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDate;


public class ComentarieDTO {
    private String comentario;

    private LocalDate fechaComentario;

    public ComentarieDTO(String comentario, LocalDate fechaComentario) {
        this.comentario = comentario;
        this.fechaComentario = fechaComentario;
    }

    public ComentarieDTO() {
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
