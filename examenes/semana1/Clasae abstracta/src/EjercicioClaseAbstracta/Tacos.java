package EjercicioClaseAbstracta;

public class Tacos extends Comida {

    public Tacos(String nombre, String pais) {
        super(nombre, pais);
    }

    @Override
    public String comer() {
        return "Se come con las manitas";
    }


}
