package com.horarios.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table (name="asignatura")
public class Dictado {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "iddictado")
    private int idDictado;

    @NotNull
    private int iddocente;


    //@NotNull
    //@ManyToOne
    //@JoinColumn(name = "idasignatura")
    //private int idasignatura;


}
