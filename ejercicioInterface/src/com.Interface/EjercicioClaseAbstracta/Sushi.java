package com.Interface.EjercicioClaseAbstracta;

public class Sushi extends Comida {
    public Sushi(String nombre, String pais) {
        super(nombre, pais);
    }

    @Override
    public String comer() {
        return "Se come con palillos";
    }
}
