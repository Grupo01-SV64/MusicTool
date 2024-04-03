package pe.edu.upc.musictool.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class LibraryDTO {
    @NotNull
    private boolean accesibilidad;
    @NotNull
    @NotBlank
    @Size(min = 5,max = 25)
    private String nombre;
    @NotNull
    @NotBlank
    @Size(min = 25,max = 255)
    private String descripcion;
}
