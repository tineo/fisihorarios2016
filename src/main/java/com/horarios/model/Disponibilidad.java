package com.horarios.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name="disponibilidad")
public class Disponibilidad {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int iddisponibilidad;

    @NotNull
    @ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
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

    //constructor
    public Disponibilidad() {
    }
    public Disponibilidad(int id) {
        this.iddisponibilidad = id;
    }

    public Disponibilidad(Docente iddocente, String horainicio, String horafinal, String dia, String ciclo) {
        this.iddocente = iddocente;
        this.horainicio = horainicio;
        this.horafinal = horafinal;
        this.dia = dia;
        this.ciclo = ciclo;
    }

    //getter and setter
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
