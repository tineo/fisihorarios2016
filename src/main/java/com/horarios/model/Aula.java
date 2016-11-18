package com.horarios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name="aula")
public class Aula {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idaula;

    @NotNull
    private String nroaula;
    @NotNull
    private String aforomax;
    @NotNull
    private String pizarra;
    @NotNull
    private String proyecto;
    @NotNull
    private String audio;
    @NotNull
    private String ecram;
    @NotNull
    private String equipopc;
    @NotNull
    private String nivel;
    @NotNull
    private int estado;

    //constructor
    public Aula() {
    }

    public Aula(int id) {
        this.idaula = id;
    }

    public Aula(String nroaula, String aforomax, String pizarra, String proyecto, String audio, String ecram, String equipopc, String nivel, int estado) {
        this.nroaula = nroaula;
        this.aforomax = aforomax;
        this.pizarra = pizarra;
        this.proyecto = proyecto;
        this.audio = audio;
        this.ecram = ecram;
        this.equipopc = equipopc;
        this.nivel = nivel;
        this.estado = estado;
    }

    //getter and setter
    public int getIdaula() {
        return idaula;
    }

    public void setIdaula(int idaula) {
        this.idaula = idaula;
    }

    public String getNroaula() {
        return nroaula;
    }

    public void setNroaula(String nroaula) {
        this.nroaula = nroaula;
    }

    public String getAforomax() {
        return aforomax;
    }

    public void setAforomax(String aforomax) {
        this.aforomax = aforomax;
    }

    public String getPizarra() {
        return pizarra;
    }

    public void setPizarra(String pizarra) {
        this.pizarra = pizarra;
    }

    public String getProyecto() {
        return proyecto;
    }

    public void setProyecto(String proyecto) {
        this.proyecto = proyecto;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getEcram() {
        return ecram;
    }

    public void setEcram(String ecram) {
        this.ecram = ecram;
    }

    public String getEquipopc() {
        return equipopc;
    }

    public void setEquipopc(String equipopc) {
        this.equipopc = equipopc;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}
