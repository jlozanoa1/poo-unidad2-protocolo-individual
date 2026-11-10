package vehiculos;

public class Moto extends Vehiculo {
    int cilindrada;

    public Moto(String tipo, int cilindrada) {
        super(tipo);
        this.cilindrada = cilindrada;
    }

    public void mostrarDatos() {
        System.out.println("Tipo heredado: " + tipo);
        mostrarTipo();
        System.out.println("Cilindrada: " + cilindrada + "cc");
    }
}
