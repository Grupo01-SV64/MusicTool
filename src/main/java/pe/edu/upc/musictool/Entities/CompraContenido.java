package pe.edu.upc.musictool.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "CompraContenido")
public class CompraContenido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int compraContenidoId;
    @Column(name ="precioCompraContenido")
    private Float precioCompraContenido;
    /*
    @Column(name ="contenidoId")
    private Contenido contenidoId;
     */
    @ManyToOne
    @JoinColumn(name = "compraId")
    private Compra compraId;
    @Column(name ="descargasDisponibles")
    private int descargasDisponibles;


    public int getCompraContenidoId() {
        return compraContenidoId;
    }

    public void setCompraContenidoId(int compraContenidoId) {
        this.compraContenidoId = compraContenidoId;
    }

    public Float getPrecioCompraContenido() {
        return precioCompraContenido;
    }

    public void setPrecioCompraContenido(Float precioCompraContenido) {
        this.precioCompraContenido = precioCompraContenido;
    }

    /*
     public Compra getContenidoId() {
        return contenidoId;
    }

    public void setContenidoId(int contenidoId) {
        this.contenidoId = contenidoId;
    }
     */


    public Compra getCompraId() {
        return compraId;
    }

    public void setCompraId(Compra compraId) {
        this.compraId = compraId;
    }

    public int getDescargasDisponibles() {
        return descargasDisponibles;
    }

    public void setDescargasDisponibles(int descargasDisponibles) {
        this.descargasDisponibles = descargasDisponibles;
    }
}
