package Cuenta;

public class CuentaCredito extends Cuenta{
    //atributos
    boolean tasaFijaInteres;

    //constructor
    public CuentaCredito(String tipo, long numCuenta, String nombrePropietario, double saldo, boolean tasaFijaInteres) {
        super(tipo, numCuenta, nombrePropietario, saldo);
        this.tasaFijaInteres = tasaFijaInteres;
    }
}
