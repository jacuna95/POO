package com.ucreativa.vacunacion;


import com.ucreativa.vacunacion.repositories.FileRepository;
import com.ucreativa.vacunacion.services.BitacoraService;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        BitacoraService service = new BitacoraService(new FileRepository());

        while (true) {
            String nombre, cedula, edad, riesgo, isAmigo, relacion = "", facebook = "", parentesco = "", marca;

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
            } else {
                System.out.println("Parentesco: ");
                parentesco = in.nextLine();
            }
            System.out.println("Vacuna--Marca:");
            marca = in.nextLine();

            service.save(nombre,cedula,edad,riesgo,isAmigo,relacion,facebook,parentesco,marca);

            System.out.println("Quiere imprimir listado, indique (S): ");
            String print = in.nextLine();
            if (print.equals("S")) {

            service.get();
            }
        }
    }
}