package com.Interface.EjercicioClaseAbstracta;

public abstract class Comida implements IComida {
    //atributos
    private String nombre;
    private String pais;

    //constructor

    public Comida(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Comida{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}

