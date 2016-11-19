package com.horarios.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table (name="dictado")
public class Dictado {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "iddictado")
    private int idDictado;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "iddocente")
    private Docente iddocente;


    @NotNull
    @ManyToOne
    @JoinColumn(name = "idasignatura")
    private Asignatura idasignatura;



    //constructor
    public Dictado() {
    }

    public Dictado(int id) {
        this.idDictado = id;
    }

    public Dictado(Docente iddocente, Asignatura idasignatura) {
        this.iddocente = iddocente;
        this.idasignatura = idasignatura;

    }

    public int getIdDictado() {
        return idDictado;
    }

    public void setIdDictado(int idDictado) {
        this.idDictado = idDictado;
    }

    public Docente getIddocente() {
        return iddocente;
    }

    public void setIddocente(Docente iddocente) {
        this.iddocente = iddocente;
    }

    public Asignatura getIdasignatura() {
        return idasignatura;
    }

    public void setIdasignatura(Asignatura idasignatura) {
        this.idasignatura = idasignatura;
    }



}
