package com.tp.empresa;

import com.tp.empresa.Empleado;
import com.tp.empresa.Obra;
import java.util.ArrayList;
import java.util.Iterator;

public class Empresa {
    private String nombreEmpresa;
    private ArrayList listaEmpleado;
    private ArrayList listaObras;


    public Empresa(String nombreEmpresa){
        this.nombreEmpresa=nombreEmpresa;
    }

    public ArrayList getListaEmpleado() {
        return listaEmpleado;
    }

    public ArrayList getListaObras() {
        return listaObras;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setListaEmpleado(ArrayList<Empleado> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }

    public void setListaObras(ArrayList<Obra> listaObras) {
        this.listaObras = listaObras;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public void listarEmpleados(){
        Iterator iterador = listaEmpleado.listIterator();
        System.out.println("Listado de Empleados:");
        while( iterador.hasNext() ){
            System.out.println(listaEmpleado.toString());
        }
    }

    public void listarObras(){
        Iterator iterador= listaObras.listIterator();
        System.out.println("Listado de Obras:");
        while(iterador.hasNext()){
            System.out.println(listaObras.toString());
        }
    }

    public void toStringEmpresa(){
        System.out.println("Empresa: " + nombreEmpresa);
        listarEmpleados();
        listarObras();

    }
}
