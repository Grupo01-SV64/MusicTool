package pe.edu.upc.musictool.DTOs;

import java.time.LocalDate;

public class PlanDTO {
    private int idPlanes;

    private String nombrePlanes;

    private float precioPlanes;

    private String descripcionPlanes;

    private LocalDate fechainicioPlanes;

    private LocalDate fechafinPlanes;

    public int getIdPlanes() {
        return idPlanes;
    }

    public void setIdPlanes(int idPlanes) {
        this.idPlanes = idPlanes;
    }

    public String getNombrePlanes() {
        return nombrePlanes;
    }

    public void setNombrePlanes(String nombrePlanes) {
        this.nombrePlanes = nombrePlanes;
    }

    public float getPrecioPlanes() {
        return precioPlanes;
    }

    public void setPrecioPlanes(float precioPlanes) {
        this.precioPlanes = precioPlanes;
    }

    public String getDescripcionPlanes() {
        return descripcionPlanes;
    }

    public void setDescripcionPlanes(String descripcionPlanes) {
        this.descripcionPlanes = descripcionPlanes;
    }

    public LocalDate getFechainicioPlanes() {
        return fechainicioPlanes;
    }

    public void setFechainicioPlanes(LocalDate fechainicioPlanes) {
        this.fechainicioPlanes = fechainicioPlanes;
    }

    public LocalDate getFechafinPlanes() {
        return fechafinPlanes;
    }

    public void setFechafinPlanes(LocalDate fechafinPlanes) {
        this.fechafinPlanes = fechafinPlanes;
    }
}
