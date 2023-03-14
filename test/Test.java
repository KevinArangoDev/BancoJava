package test;

import app.Banco;
import app.Cliente;
import app.TipoDeCuenta;

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // Creamos el Banco
        Banco banco = new Banco("Bancolombina");

        // Creamos los clientes
        Cliente cliente1 = new Cliente("Kevin", "Arango", "12345", TipoDeCuenta.CUENTADEAHORROS, 0.0);
        Cliente cliente2 = new Cliente("Steven", "Velasquez", "678910", TipoDeCuenta.CUENTACORRIENTE, 0.0);

        // Añadimos los clientes a la lista del Banco
        banco.getListaClientes().add(cliente1);
        banco.getListaClientes().add(cliente2);

        // Imprimimos la Información de los clientes
        System.out.println(banco.getListaClientes());

        // Consignamos el saldo a las cuentas
        cliente1.consignar(1000);
        cliente2.consignar(2000);

        // Con este metodo accedemos al saldo del cliente (Quitar el signo de barra para
        // comprobar):

        // cliente1.consultarSaldo();

        // Con este metodo depositamos saldo (Quitar el signo de barra para comprobar):

        // cliente1.consignar(1000);

        // Con este metodo retiramos saldo y se comprueba el nuevo saldo (Quitar el
        // signo de barra para comprobar):

        // cliente1.retirar(1100);
        // cliente1.consultarSaldo();

        // Con este metodo vemos que no es posible retirar un valor superior al saldo
        // actual (Quitar el signo de barra para comprobar):

        // cliente1.consignar(1000);
        // cliente1.retirar(1200);

        // Este codigo nos ayuda a comparar los saldos de los clientes
        if (cliente1.compararSaldo(cliente2)) {
            System.out.println(
                    "El saldo de " + cliente1.getNombres() + " " + cliente1.getSaldo() +
                            " es mayor o igual al saldo de " + cliente2.getNombres() + ""
                            + cliente2.getSaldo() + ": ");
        } else {
            System.out.println(
                    "El saldo de " + cliente1.getNombres() + " " + cliente1.getSaldo() +
                            " es menor que el saldo de " + cliente2.getNombres() + ": "
                            + cliente2.getSaldo() + " ");
        }

        // Transferimos el valor de la cuenta 1 a la 2
        double valorTransferencia = 900;
        boolean transferenciaExitosa = cliente1.transferir(cliente2, valorTransferencia);

        // Metodo que nos ayuda a comprobar si la tranferencia fue exitosa
        if (transferenciaExitosa) {
            System.out.println("Transferencia exitosa. Saldo de la cuenta 1: " + cliente1.getSaldo()
                    + ", saldo de la cuenta 2: " + cliente2.getSaldo());
        } else {
            System.out.println("No se pudo realizar la transferencia. Saldo de la cuenta 1: "
                    + cliente1.getSaldo() + ", saldo de la cuenta 2: " + cliente2.getSaldo());
        }
    }
}
