package com.tp.empresa;

import com.tp.empresa.Empleado;

import java.util.ArrayList;
import java.util.List;

public class Obra  {
    private String direccion;
    private double metros2;       //Cantidad de metros cuadrados
    private int tiempoEstimado;   //En dias
    private double costoXM2;     //costo por metro cuadrado
    private ArrayList<Empleado> listaEmpleados;
    private double precioTotal;

    public Obra(String direccion, double metro2, int tiempoEstimado, double costoXM2){
        this.direccion=direccion;
        this.metros2=metro2;
        this.tiempoEstimado=tiempoEstimado;
        this.costoXM2=costoXM2;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public double getMetros2() {
        return metros2;
    }

    public double getCostoXM2() {
        return costoXM2;
    }

    public int getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setListaEmpleados(ArrayList listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }


    public void calcularPrecioTotal(){
        precioTotal= ((getCostoXM2()*getMetros2())+(2*getTiempoEstimado()));
    }

    public String toString(){
        return "Obra<"+
                " Direccion: " + direccion +
                " Cantidad de metros2: " + metros2+
                " Tiempo estimado:" + tiempoEstimado +
                " Costo por metro2: " + costoXM2 +
                " Listado Personal Asignado: " + listaEmpleados +
                " Precio total de obra: " + precioTotal +
                ">";
    }
}
