package com.tp.empresa;

import com.tp.empresa.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Ejercicio 2A
        Arquitecto empleado1= new Arquitecto(12,"Carlos",1234567,2343234);
        Maestro empleado2= new Maestro("Juan",40138237,3009927,23);
        Obrero empleado3= new Obrero ("Pedro",38395156,6833924,25);
        Arquitecto empleado4= new Arquitecto(10,"Ezequiel",38395624,5456345);
        Arquitecto empleado5=new Arquitecto(2,"Manuel",32453959,5555123);
        Maestro empleado6=new Maestro("Carla",12987654,5123456,60);
        Maestro empleado7=new Maestro("Marta",28543333,5609159,40);
        Obrero empleado8= new Obrero("Brian",40111111,5396624,21);
        Obrero empleado9=new Obrero("Thiago",34666798,5554345,30);

        System.out.println(empleado1.toStringArquitecto());
        empleado1.funcion();
        System.out.println(empleado2.toStringMaestro());
        empleado2.funcion();
        System.out.println(empleado3.toStringObrero());
        empleado3.funcion();

        Empresa miempresa = new Empresa ("ConstruccionAR SA");
        ArrayList newLista= new ArrayList();
        newLista.add(empleado1);
        newLista.add(empleado2);
        newLista.add(empleado3);
        newLista.add(empleado4);
        newLista.add(empleado5);
        newLista.add(empleado6);
        newLista.add(empleado7);
        newLista.add(empleado8);
        newLista.add(empleado9);
        miempresa.setListaEmpleado(newLista);


        Hotel obra1= new Hotel("Santa fe 2450",560,34,5340,"Primacy",11);
        Domestica obra2= new Domestica("Rivas 2930",100,10,456,5);
        Comercio obra3=new Comercio("Sarmiento 1220",32,2,155,"Kiosco","Almacenes y kiosco");


        ArrayList newLista2= new ArrayList();
        newLista2.add(obra1);
        newLista2.add(obra2);
        newLista2.add(obra3);
        obra1.setListaEmpleados(empleado4);
        obra1.setListaEmpleados(empleado2);
        obra1.setListaEmpleados(empleado3);
        obra1.setListaEmpleados(empleado8);

        miempresa.setListaObras(newLista2);
        miempresa.toStringEmpresa();


    }
}
