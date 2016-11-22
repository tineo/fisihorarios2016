package com.horarios.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name="carga")
public class Carga {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idcarga;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "idasignatura")
    private Asignatura idasignatura;

    @NotNull
    private int num_alumnos_por_llevar ;

    public Carga() {
    }
    public Carga(int id) {
        this.idcarga = id;
    }

    public Carga(Asignatura idasignatura, int num_alumnos_por_llevar) {
        this.idasignatura = idasignatura;
        this.num_alumnos_por_llevar = num_alumnos_por_llevar;
    }

    public int getIdcarga() {
        return idcarga;
    }


    public void setIdcarga(int idcarga) {
        this.idcarga = idcarga;
    }

    public Asignatura getIdasignatura() {
        return idasignatura;
    }

    public void setIdasignatura(Asignatura idasignatura) {
        this.idasignatura = idasignatura;
    }

    public int getNum_alumnos_por_llevar() {
        return num_alumnos_por_llevar;
    }

    public void setNum_alumnos_por_llevar(int num_alumnos_por_llevar) {
        this.num_alumnos_por_llevar = num_alumnos_por_llevar;
    }
}
