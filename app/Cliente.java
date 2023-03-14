package app;

public class Cliente {

    private String nombres;
    private String apellidos;
    private String numCuenta;
    private TipoDeCuenta tipoDeCuenta;
    private double saldo;

    public Cliente(String nombres, String apellidos, String numCuenta, TipoDeCuenta tipoDeCuenta, double saldo) {
        super();
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numCuenta = numCuenta;
        this.tipoDeCuenta = tipoDeCuenta;
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public TipoDeCuenta getTipoDeCuenta() {
        return tipoDeCuenta;
    }

    public void setTipoDeCuenta(TipoDeCuenta tipoDeCuenta) {
        this.tipoDeCuenta = tipoDeCuenta;
    }

    public void imprimirDatosCuenta() {
        System.out.println("Datos de la cuenta bancaria:");
        System.out.println("Nombres del titular: " + nombres);
        System.out.println("Apellidos del titular: " + apellidos);
        System.out.println("Número de cuenta: " + numCuenta);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo actual: " + saldo);
    }

    // Método para consultar el saldo de la cuenta

    public void consultarSaldo() {
        System.out.println("El saldo actual de la cuenta es: " + saldo);
    }

    // Método para depositar dinero en la cuenta

    public void consignar(double valor) {
        saldo += valor;
        System.out.println("Se ha consignado exitosamente el valor de " + valor + " en la cuenta de: " + nombres + "");
        System.out.println("El nuevo saldo de la cuenta es: " + saldo);
    }

    // Método para retirar dinero de la cuenta

    public void retirar(double valor) {
        if (valor > saldo) {
            System.out.println(
                    "No se puede realizar el retiro porque el valor solicitado supera el saldo actual de la cuenta.");
        } else {
            saldo -= valor;
            System.out.println("Se ha retirado exitosamente el valor de " + valor + " de la cuenta.");
            System.out.println("El nuevo saldo de la cuenta es: " + saldo);
        }
    }

    public boolean transferir(double valor) {
        if (valor > saldo) {
            System.out.println(
                    "No se puede realizar el retiro porque el valor solicitado supera el saldo actual de la cuenta.");
            return false;
        } else {
            saldo -= valor;
            System.out.println("Se ha retirado correctamente el valor de " + valor + " de la cuenta.");
            System.out.println("El nuevo saldo de la cuenta es: " + saldo);
            return true;
        }
    }

    public boolean compararSaldo(Cliente otraCuenta) {
        if (this.saldo >= otraCuenta.saldo) {
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(Cliente cuentaDestino, double valorTransferencia) {
        boolean operacionRetiroExitosa = this.transferir(valorTransferencia);
        if (operacionRetiroExitosa) {
            cuentaDestino.consignar(valorTransferencia);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "\nCliente: \n Nombre: " + nombres + "\n Apellidos: " + apellidos + "\n Numero De Cuenta: " + numCuenta +
                "\n Tipo de Cuenta: " + tipoDeCuenta + "\n Saldo: " + saldo + "";
    }

}
