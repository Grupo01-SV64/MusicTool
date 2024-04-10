package pe.edu.upc.musictool.Entities;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="Compra")
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int compraId;
    @Column(name="fechaCompra", nullable = false)
    private LocalDate fechaCompra;
    @Column(name="estadoDePago", nullable = false)
    private int estadoDePago;
    @Column(name="totalDeCompra", nullable = false)
    private Float totalDeCompra;
    @Column(name="planesId", nullable = false)
    private int planesId;
    /*
    @ManyToOne
    @JoinColumn(name = "userID")
    private  User usuariosId;
     */

    public Compra() {
    }

    public Compra(int compraId, LocalDate fechaCompra, int estadoDePago, Float totalDeCompra, int planesId) {
        this.compraId = compraId;
        this.fechaCompra = fechaCompra;
        this.estadoDePago = estadoDePago;
        this.totalDeCompra = totalDeCompra;
        this.planesId = planesId;
     //   this.usuariosId = usuariosId;
    }

    public int getCompraId() {
        return compraId;
    }

    public void setCompraId(int compraId) {
        this.compraId = compraId;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public int getEstadoDePago() {
        return estadoDePago;
    }

    public void setEstadoDePago(int estadoDePago) {
        this.estadoDePago = estadoDePago;
    }

    public Float getTotalDeCompra() {
        return totalDeCompra;
    }

    public void setTotalDeCompra(Float totalDeCompra) {
        this.totalDeCompra = totalDeCompra;
    }

    public int getPlanesId() {
        return planesId;
    }

    public void setPlanesId(int planesId) {
        this.planesId = planesId;
    }

    /*
     public User getUsuariosId() {
        return usuariosId;
    }

    public void setUsuariosId(User usuariosId) {
        this.usuariosId = usuariosId;
    }
     */

}
