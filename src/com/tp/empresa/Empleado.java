package com.tp.empresa;

public abstract class Empleado {
    private String nombre;
    private int dni;
    private int telefono;
    private double costo;


    public Empleado (String nombre, int dni, int telefono,double costo){
        this.nombre=nombre;
        this.dni=dni;
        this.telefono=telefono;
        this.costo=costo;
    }

    public double getCosto() {
        return costo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public abstract void funcion();


    public String toString() {
        return "<Empleado:" +
                "Nombre: " + nombre +
                "- Dni: " + dni +
                "- Telefono: " + telefono +
                ">   ";
    }


}
