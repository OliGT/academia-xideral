package EjercicioClaseAbstracta;

public class Pasta extends Comida{
    public Pasta(String nombre, String pais) {
        super(nombre, pais);
    }

    @Override
    public String comer() {
        return "Se come con tenedor";
    }
}