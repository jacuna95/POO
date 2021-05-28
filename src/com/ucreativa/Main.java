package com.ucreativa;

import com.ucreativa.familia.Martha;
import com.ucreativa.familia.Nacho;
import com.ucreativa.familia.prueba;

public class Main {

    public static void main(String[] args) {

        Nacho yo = new Nacho("Hi class",25,"I like to sleep");

        Martha madre= new Martha("Hola profesor de Nacho",42,"go for a walk");
        madre.setAge();

        int age= madre.getAge();

        String hobby= madre.getHobby();

        System.out.println("My age is: " + age+" and i like "+hobby);

//----------------------------------PRACTICA -------------------------------------------------------------

        prueba practica= new prueba(40227,"Josue",100.05);

        System.out.println(practica.getNombre());
        practica.setNombre("NACHO");
        practica.setID(12);

        System.out.println("Mi nombre es: "+practica.getNombre()+" mi id es: "+ practica.getID());
        System.out.println(practica);
    }

}
