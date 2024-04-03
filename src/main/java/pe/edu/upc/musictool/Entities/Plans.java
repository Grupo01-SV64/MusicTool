package pe.edu.upc.musictool.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="Plans")
public class Plans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPlanes;

    @Column(name = "nombrePlan", nullable = false, length = 30)
    private String nombrePlanes;

    @Column(name = "precioPlan", nullable = false)
    private float precioPlanes;

    @Column(name = "descripcionPlan", nullable = false, length = 250)
    private String descripcionPlanes;

    @Column(name = "fechainicioPlan", nullable = false)
    private LocalDate fechainicioPlanes;

    @Column(name = "fechafinPlan", nullable = false)
    private LocalDate fechafinPlanes;

    public Plans(int idPlanes, String nombrePlanes, float precioPlanes, String descripcionPlanes, LocalDate fechainicioPlanes, LocalDate fechafinPlanes) {
        this.idPlanes = idPlanes;
        this.nombrePlanes = nombrePlanes;
        this.precioPlanes = precioPlanes;
        this.descripcionPlanes = descripcionPlanes;
        this.fechainicioPlanes = fechainicioPlanes;
        this.fechafinPlanes = fechafinPlanes;
    }

    public Plans() {
    }

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
