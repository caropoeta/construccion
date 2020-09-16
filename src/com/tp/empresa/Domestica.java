package com.tp.empresa;

public class Domestica extends Obra {
    private int habitaciones;

    public Domestica(String direccion, double metros2, int tiempoEstimado, double costoM2,int habitaciones){
        super(direccion,metros2,tiempoEstimado,costoM2);
        this.habitaciones=habitaciones;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public String toStringDomestica(){
        return toString() +
                "<Esta obra es domestica y tiene " + habitaciones +
                " habitaciones>" ;
    }
}
