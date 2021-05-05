package com.example.demo;

public class SueldoFuncionario {
    private String apellidoYnombre;
    private String cuil;
    private int anio;
    private String reparticion;
    private int mes;
    private String asignacion;
    private String aguinaldo;
    private String observaciones;
    private String total;

    public SueldoFuncionario(String cuil, int anio, int mes, String apellidoYnombre, String reparticion, String asignacion, String aguinaldo, String total, String observaciones) {
        this.cuil = cuil;
        this.anio = anio;
        this.mes = mes;
        this.apellidoYnombre = apellidoYnombre;
        this.reparticion = reparticion;
        this.asignacion = asignacion;
        this.aguinaldo = aguinaldo;
        this.total = total;
        this.observaciones = observaciones;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getApellidoYnombre() {
        return apellidoYnombre;
    }

    public void setApellidoYnombre(String apellidoYnombre) {
        this.apellidoYnombre = apellidoYnombre;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public int getAño() {
        return anio;
    }

    public void setAño(int año) {
        this.anio = año;
    }

    public String getReparticion() {
        return reparticion;
    }

    public void setReparticion(String reparticion) {
        this.reparticion = reparticion;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(String asignacion) {
        this.asignacion = asignacion;
    }

    public String getAguinaldo() {
        return aguinaldo;
    }

    public void setAguinaldo(String aguinaldo) {
        this.aguinaldo = aguinaldo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
