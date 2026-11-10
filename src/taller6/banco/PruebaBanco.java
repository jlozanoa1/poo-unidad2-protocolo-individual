package banco;

public class PruebaBanco {
    public static void main(String[] args) {
        Banco b = new Banco(100);
        b.saldo = -5000;
        System.out.println(b.saldo);
    }
}
