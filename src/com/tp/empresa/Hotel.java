package com.tp.empresa;

import com.tp.empresa.Comercial;

public class Hotel extends Comercial {
    private int pisos;

    public Hotel(String direccion, double metros2, int tiempoEstimado, double costoM2, String nombreObra, int pisos){
        super(direccion,metros2,tiempoEstimado,costoM2,nombreObra);
        this.pisos=pisos;
    }

    public int getPisos() {
        return pisos;
    }

    public String toStringHotel(){
        return toStringComercial() + "<Es un hotel con " + pisos + " pisos>";
    }
}
