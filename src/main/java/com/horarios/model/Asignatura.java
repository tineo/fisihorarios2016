package com.horarios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table (name="asignatura")
public class Asignatura {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int idasignatura;
    @NotNull
    private String codigo;
    @NotNull
    private String nombre;
    @NotNull
    private int horas;
    @NotNull
    private String ciclo;
    @NotNull
    private String plan;
    @NotNull
    private String creditos;
    @NotNull
    private int estado;
    @NotNull
    private int horaspractica;
    @NotNull
    private int horasteoria;
    @NotNull
    private int horaslaboratorio;

    public Asignatura() {
    }
    public Asignatura(int idasignatura) {
        this.idasignatura = idasignatura;
    }

    public Asignatura(String codigo, String nombre, int horas, String ciclo, String plan, String creditos, int estado, int horaspractica, int horasteoria, int horaslaboratorio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horas = horas;
        this.ciclo = ciclo;
        this.plan = plan;
        this.creditos = creditos;
        this.estado = estado;
        this.horaspractica = horaspractica;
        this.horasteoria = horasteoria;
        this.horaslaboratorio = horaslaboratorio;
    }

    public int getIdasignatura() {
        return idasignatura;
    }

    public void setIdasignatura(int idasignatura) {
        this.idasignatura = idasignatura;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getHoraspractica() {
        return horaspractica;
    }

    public void setHoraspractica(int horaspractica) {
        this.horaspractica = horaspractica;
    }

    public int getHorasteoria() {
        return horasteoria;
    }

    public void setHorasteoria(int horasteoria) {
        this.horasteoria = horasteoria;
    }

    public int getHoraslaboratorio() {
        return horaslaboratorio;
    }

    public void setHoraslaboratorio(int horaslaboratorio) {
        this.horaslaboratorio = horaslaboratorio;
    }
}
