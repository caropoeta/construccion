package com.tp.empresa;

public class Arquitecto extends Empleado {
    private int matricula;

    public Arquitecto(int matricula, String nombre, int dni, int telefono){
        super(nombre,dni,telefono,2000);
        this.matricula=matricula;
    }

    public int getMatricula() {
        return matricula;
    }


    @Override
    public void funcion() {
        System.out.println("Creando mi proximo plano");
    }


    public String toStringArquitecto() {
         return super.toString() + "<Arquitecto matricula:" + matricula +  ">";
    }
}
