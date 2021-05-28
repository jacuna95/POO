package com.ucreativa.familia;

public class prueba {

    private int ID;
    private String nombre;
    private double Valor;

    public prueba(int ID, String nombre, double valor) {
        this.ID = ID;
        this.nombre = nombre;
        Valor = valor;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double valor) {
        Valor = valor;
    }

    @Override
    public String toString() {
        return "prueba{" +
                "ID=" + ID +
                ", nombre='" + nombre + '\'' +
                ", Valor=" + Valor +
                '}';
    }
}
