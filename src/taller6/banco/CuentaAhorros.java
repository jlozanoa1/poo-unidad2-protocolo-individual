package banco;

public class CuentaAhorros extends Banco {
    public CuentaAhorros(double saldoInicial) {
        super(saldoInicial);
    }

    public void hacerTrampa() {
        saldo = 1_000_000;
    }
}
