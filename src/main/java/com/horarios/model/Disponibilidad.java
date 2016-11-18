package com.horarios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table (name="disponibilidad")
public class Disponibilidad {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int iddisponibilidad;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "iddocente")
    private Docente iddocente;

    @NotNull
    private String horainicio;
    @NotNull
    private String horafinal;
    @NotNull
    private String dia;
    @NotNull
    private String ciclo;

    public Disponibilidad() {
    }

    /*public Disponibilidad(int id) { this.iddocente = id; }*/

    public Disponibilidad(Docente iddocente, String horainicio, String horafinal, String dia, String ciclo) {
        this.iddocente = iddocente;
        this.horainicio = horainicio;
        this.horafinal = horafinal;
        this.dia = dia;
        this.ciclo = ciclo;
    }

    public int getIddisponibilidad() {
        return iddisponibilidad;
    }

    public void setIddisponibilidad(int iddisponibilidad) {
        this.iddisponibilidad = iddisponibilidad;
    }

    public Docente getIddocente() {
        return iddocente;
    }

    public void setIddocente(Docente iddocente) {
        this.iddocente = iddocente;
    }

    public String getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(String horainicio) {
        this.horainicio = horainicio;
    }

    public String getHorafinal() {
        return horafinal;
    }

    public void setHorafinal(String horafinal) {
        this.horafinal = horafinal;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }
}
