package ar.edu.unju.edm.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;



@Embeddable
public class ComentarioKey implements Serializable {
    private static final long serialVersionUID = 1L;
	@Column(name = "turista_id")
    public int turistaId;
    @Column(name = "punto_id")
    public int puntoId;

    public ComentarioKey() {
    }

    public ComentarioKey(int turistaId, int puntoId) {
        this.turistaId = turistaId;
        this.puntoId = puntoId;
    }

    public int getTuristaId() {
        return turistaId;
    }

    public void setTuristaId(int turistaId) {
        this.turistaId = turistaId;
    }

    public int getPuntoId() {
        return puntoId;
    }

    public void setPuntoId(int puntoId) {
        this.puntoId = puntoId;
    }
}
