package com.tp.empresa;

import com.tp.empresa.Comercial;

public class Comercio extends Comercial {
    private String rubro;

    public Comercio(String direccion, double metros2, int tiempoEstimado, double costoM2, String nombreObra, String rubro){
        super(direccion,metros2,tiempoEstimado,costoM2,nombreObra);
        this.rubro=rubro;
    }

    public String getRubro() {
        return rubro;
    }

    public String toStringComercio(){
        return toStringComercial() + "<Comercio del rubro: " + rubro + ">";
    }
}
