package com.ucreativa.vacunacion.entities;

public class Familiar extends Persona {

    private String parentesco;

    public Familiar(String nombre,int edad, boolean riesgo, String parentesco) {
        super(nombre, "N/A", edad, riesgo);
        this.parentesco = parentesco;
    }
    public String getParentesco() {
        return this.parentesco;
    }

    public String toString(){
        return  this.parentesco+" "+super.getNombre();
    }
}
