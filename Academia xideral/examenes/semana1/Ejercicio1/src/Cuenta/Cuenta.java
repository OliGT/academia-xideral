package Cuenta;

public abstract class Cuenta {
    //atributos
    private String tipo;
    private long numCuenta;
    private String nombrePropietario;
    private double saldo;

    //constructor
    public Cuenta(String tipo, long numCuenta, String nombrePropietario, double saldo) {
        this.tipo = tipo;
        this.numCuenta = numCuenta;
        this.nombrePropietario = nombrePropietario;
        this.saldo = saldo;
    }

    //métodos
    public double deposito(double deposito){
        saldo += deposito;
        return  saldo;
    }
    public double retiro (double retiro){
        saldo-= retiro;
        return  saldo;
    }

}
