package Cuenta;
//Aplica el concepto de polimorfismo usando clases abstractas
public class Principal {
    public static void main(String[] args) {
        CuentaNomina cuenta1 = new CuentaNomina("nomina", 17272617, "Juan Carlos Bodoque", 3000);
        CuentaAhorro cuenta2 = new CuentaAhorro("ahorro", 18376481, "Juanin Juan Harry", 3500, .05);
        CuentaCredito cuenta3 = new CuentaCredito("credito", 19263818, "Policarpo Avendaño", 5000, true);

        double resultado = cuenta1.deposito(400);
        System.out.println("el nuevo saldo es = " + resultado);

    }
}
