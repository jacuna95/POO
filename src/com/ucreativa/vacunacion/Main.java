package com.ucreativa.vacunacion;


import com.ucreativa.vacunacion.entities.BitacoraVacunas;
import com.ucreativa.vacunacion.entities.Familiar;
import com.ucreativa.vacunacion.entities.Persona;
import com.ucreativa.vacunacion.entities.amigo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        List<BitacoraVacunas> db = new ArrayList<>();

        while (true) {
            String nombre, cedula, edad, riesgo, isAmigo, relacion, facebook, parentesco, marca;
            Persona persona;

            System.out.println("Digite su nombre: ");
            nombre = in.nextLine();
            System.out.println("Digite su # de cédula: ");
            cedula = in.nextLine();
            System.out.println("Digite su edad: ");
            edad = in.nextLine();
            System.out.println("es de Riesgo (S/N): ");
            riesgo = in.nextLine();
            System.out.println("es amigo indique letra (A)// Es familiar indique letra (F): ");
            isAmigo = in.nextLine();
            if (isAmigo.equals("A")) {
                System.out.println("Relación: ");
                relacion = in.nextLine();
                System.out.println("Facebook: ");
                facebook = in.nextLine();
                persona = new amigo(nombre, cedula, Integer.parseInt(edad), riesgo.equals("S"), relacion, facebook);
            } else {
                System.out.println("Parentesco: ");
                parentesco = in.nextLine();
                persona = new Familiar(nombre, cedula, Integer.parseInt(edad), riesgo.equals("S"), parentesco);
            }
            System.out.println("Vacuna--Marca:");
            marca = in.nextLine();

            db.add(new BitacoraVacunas(persona, marca, new Date()));


            System.out.println("Quiere imprimir listado, indique (S): ");
            String print = in.nextLine();
            if (print.equals("S")) {
                for (BitacoraVacunas item : db) {
                    System.out.println(item.getPersona().getNombre() + "vacunado el:" + item.getFecha());
                }

            }


        }

    }
}