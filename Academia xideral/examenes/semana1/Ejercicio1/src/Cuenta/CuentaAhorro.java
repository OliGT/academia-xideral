package Cuenta;

public class CuentaAhorro extends Cuenta{
    //atributos
    double interesRendimiento;

    //constructor
    public CuentaAhorro(String tipo, long numCuenta, String nombrePropietario, double saldo, double interesRendimiento) {
        super(tipo, numCuenta, nombrePropietario, saldo);
        this.interesRendimiento = interesRendimiento;
    }



}
