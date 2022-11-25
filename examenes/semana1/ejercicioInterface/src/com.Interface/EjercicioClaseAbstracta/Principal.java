package com.Interface.EjercicioClaseAbstracta;

import java.util.List;

public class Principal {
    public static void main(String[] args) {

        List<Comida> listaComida = getComida();

        for(Comida platillo: listaComida){
            System.out.println(platillo);
            System.out.println(platillo.comer());
        }
    }



    static List<Comida> getComida(){
        return List.of(new Tacos("tacos al pastor", "mexico"),
                new Sushi("rollos philadelphia", "japon"),
                new Pasta("Pasta a la boloñesa", "italia")
        );
    }

}
