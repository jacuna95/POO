package com.ucreativa.vacunacion;

public class Persona {
    private String Nombre;
    private String Id;
    private int Edad;
    private boolean Riesgo;

    public Persona(String nombre, String id, int edad, boolean riesgo) {
        Nombre = nombre;
        Id = id;
        Edad = edad;
        Riesgo = riesgo;
    }
    public String getNombre() {
        return Nombre;
    }

    public String getId() {
        return Id;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public boolean getRiesgo() {
        return Riesgo;
    }

    public void setRiesgo(boolean riesgo) {
        Riesgo = riesgo;
    }
}