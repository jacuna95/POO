package com.ucreativa;

import com.ucreativa.familia.Martha;
import com.ucreativa.familia.Nacho;

public class Main {

    public static void main(String[] args) {

        Nacho trabaja= new Nacho();
        System.out.println("Hola Clase");

        Martha madre= new Martha("Hola profesor de Nacho");
        madre.setAge();

        int age= madre.getAge();

        String hobby= madre.getHobby();

        System.out.println("My age is: " + age+" and i like "+hobby);
    }



}
