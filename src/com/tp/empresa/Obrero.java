package com.tp.empresa;

public class Obrero extends Maestro {
    public Obrero(String nombre, int dni, int telefono,int edad){
        super(nombre,dni,telefono,edad);
        int costo=1500;
    }


    @Override
    public void funcion() {
        System.out.println("Soy obrero y construyo");
    }


    public String toStringObrero() {
        return super.toString() + "<Obrero  edad:" + getEdad() +  ">";
    }
}
