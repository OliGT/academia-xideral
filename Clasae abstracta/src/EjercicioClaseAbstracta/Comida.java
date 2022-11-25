package EjercicioClaseAbstracta;

public abstract class Comida {
    //atributos
    private String nombre;
    private String pais;

    //constructor

    public Comida(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }
    //metodo

    public abstract String comer();

    //toString

    @Override
    public String toString() {
        return "Comida{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}

