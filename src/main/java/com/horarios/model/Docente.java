package com.horarios.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name="docente")
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@Column(name = "iddocente")
    private int iddocente;

    @NotNull
    private String nombres;
    @NotNull
    private String apellidos;
    @NotNull
    private String limfisica;
    @NotNull
    private String correo;
    @NotNull
    private String telefono;

    public Docente() {
    }
    public Docente(int id) {
        this.iddocente = id;
    }

    public Docente(String nombres, String apellidos, String limfisica, String correo, String telefono) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.limfisica = limfisica;
        this.correo = correo;
        this.telefono = telefono;
    }

    public int getId() {
        return iddocente;
    }

    public void setId(int id) {
        this.iddocente = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getLimfisica() {
        return limfisica;
    }

    public void setLimfisica(String limfisica) {
        this.limfisica = limfisica;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
