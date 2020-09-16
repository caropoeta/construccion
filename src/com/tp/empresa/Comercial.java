package com.tp.empresa;

public class Comercial extends Obra {
    private String nombreObra;

    public Comercial(String direccion, double metros2, int tiempoEstimado, double costoM2,String nombreObra){
        super(direccion,metros2,tiempoEstimado,costoM2);
        this.nombreObra=nombreObra;
    }

    public String getNombreObra() {
        return nombreObra;
    }

    public String toStringComercial(){
        return toString() + "<Esta obra es comercial, y su nombre es: " + nombreObra +" >";
    }
}
