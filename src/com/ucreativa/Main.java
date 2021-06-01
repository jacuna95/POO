package com.ucreativa;

import com.ucreativa.familia.Martha;
import com.ucreativa.familia.Nacho;
import com.ucreativa.familia.prueba;
import com.ucreativa.vacunacion.Familiar;
import com.ucreativa.vacunacion.Persona;
import com.ucreativa.vacunacion.amigo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Familiar mama = new Familiar("marta","1234",42,false,"mama");

        Familiar hermano = new Familiar("jonathan","345",23,false,"hermano");

        amigo compaTrabajo = new amigo("josue","956",26,true,"amigo",
                "JosueGaitan");


        List<Persona> familia = new ArrayList<>();
        familia.add(mama);
        familia.add(hermano);
        familia.add(compaTrabajo);

    }

}
