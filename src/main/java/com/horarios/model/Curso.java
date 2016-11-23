package com.horarios.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name="curso")
public class Curso {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idcurso;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "iddocente")
    private Docente iddocente;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "idasignatura")
    private Asignatura idasignatura;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "idaula")
    private Aula idaula;

    @NotNull
    private String horainicio;
    @NotNull
    private String horafinal;
    @NotNull
    private String dia;
    @NotNull
    private String seccion;



    //constructor
    public Curso() {
    }

    public Curso(Docente iddocente, Asignatura idasignatura, Aula idaula, String horainicio, String horafinal, String seccion, String dia) {
        this.iddocente = iddocente;
        this.idasignatura = idasignatura;
        this.idaula = idaula;
        this.horainicio = horainicio;
        this.horafinal = horafinal;
        this.seccion = seccion;
        this.dia =dia;
    }
    public Curso(int id) {
        this.idcurso = id;
    }

    //getter and setter
    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
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

    public Aula getIdaula() {
        return idaula;
    }

    public void setIdaula(Aula idaula) {
        this.idaula = idaula;
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

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
}
