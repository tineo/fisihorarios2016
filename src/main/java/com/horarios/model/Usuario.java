package com.horarios.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name="usuario")
public class Usuario {

    @Id

    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idusuario;

    @NotNull
    private String nombres;
    @NotNull
    private String apepaterno;
    @NotNull
    private String apematerno;
    @NotNull
    private String username;
    @NotNull
    @Size(min = 4, max = 80)
    private String password;
    @NotNull
    private int estado;
    @NotNull
    private String email;
    @NotNull
    private String telefono;

    public Usuario() {}
    public Usuario(int id) {
        this.idusuario = id;
    }

    public Usuario(String nombre, String apepaterno, String apematerno, String username, String password, int estado, String email, String telefono) {
        this.nombres = nombre;
        this.apepaterno = apepaterno;
        this.apematerno = apematerno;
        this.username = username;
        this.password = password;
        this.estado = estado;
        this.email = email;
        this.telefono = telefono;

    }

    public int getId() {
        return idusuario;
    }

    public void setId(int id) {
        this.idusuario = id;
    }

    public String getNombre() {
        return nombres;
    }

    public void setNombre(String nombre) {
        this.nombres = nombre;
    }

    public String getApepaterno() {
        return apepaterno;
    }

    public void setApepaterno(String apepaterno) {
        this.apepaterno = apepaterno;
    }

    public String getApematerno() {
        return apematerno;
    }

    public void setApematerno(String apematerno) {
        this.apematerno = apematerno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Object getAuthorities() {
        return null;
    }
}
