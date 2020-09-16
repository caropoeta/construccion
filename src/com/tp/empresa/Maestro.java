package com.tp.empresa;

import com.tp.empresa.Empleado;

public class Maestro extends Empleado {
    private int edad;

    public Maestro(String nombre, int dni, int telefono,int edad){
        super(nombre,dni,telefono,1800);
        this.edad=edad;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public void funcion() {
        System.out.println("Soy Maestro y superviso las construcciones");
    }

    public String toStringMaestro() {
        return super.toString() + "<Maestro  edad:" + edad +  ">";
    }
}
