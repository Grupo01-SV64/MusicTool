package pe.edu.upc.musictool.Entities;

import jakarta.persistence.*;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
@Entity
@Table(name = "Mensaje")
public class Mensaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mensajeId;
    @Column(name = "contenidoMensaje",length = 250, nullable = false )
    private String contenidoMensaje;
    @Column(name = "fechaDeMensaje", nullable = false )
    private Timestamp fechaDeMensaje;
   
   /*
    @ManyToOne
       @JoinColumn(name = "conversacionId")
    private Conversacion conversacionId;
    */


    public Mensaje() {
    }
    public Mensaje(int mensajeId, String contenidoMensaje, Timestamp fechaDeMensaje) {
        this.mensajeId = mensajeId;
        this.contenidoMensaje = contenidoMensaje;
        this.fechaDeMensaje = fechaDeMensaje;
       /// this.conversacionId = conversacionId;
    }

    public int getMensajeId() {
        return mensajeId;
    }

    public void setMensajeId(int mensajeId) {
        this.mensajeId = mensajeId;
    }

    public String getContenidoMensaje() {
        return contenidoMensaje;
    }

    public void setContenidoMensaje(String contenidoMensaje) {
        this.contenidoMensaje = contenidoMensaje;
    }

    public Timestamp getFechaDeMensaje() {
        return fechaDeMensaje;
    }

    public void setFechaDeMensaje(Timestamp fechaDeMensaje) {
        this.fechaDeMensaje = fechaDeMensaje;
    }

    /*
      public Conver getConversacionPorId() {
        return conversacionId;
    }

    public void setConversacionPorId(int conversacionPorId) {
        this.conversacionId = conversacionPorId;
    }
     */

}
