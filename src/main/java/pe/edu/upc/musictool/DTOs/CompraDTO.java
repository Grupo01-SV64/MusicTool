package pe.edu.upc.musictool.DTOs;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

public class CompraDTO {

    private int compraId;
    private LocalDate fechaCompra;
    private int estadoDePago;
    private Float totalDeCompra;
    private int planesId;
    public CompraDTO(){}
    public CompraDTO(int compraId, LocalDate fechaCompra, int estadoDePago, Float totalDeCompra, int planesId) {
        this.compraId = compraId;
        this.fechaCompra = fechaCompra;
        this.estadoDePago = estadoDePago;
        this.totalDeCompra = totalDeCompra;
        this.planesId = planesId;
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
}
