package com.ucreativa.vacunacion.entities;

public class amigo extends Persona {

    private String relacion;
    private String facebook;

    public amigo (String nombre, String id, int edad, boolean riesgo, String relacion, String facebook) {
        super(nombre, id, edad, riesgo);
        this.relacion = relacion;
        this.facebook = facebook;
    }

    public String getRelacion() {
        return relacion;
    }

    public String getFacebook() {
        return facebook;
    }
}
