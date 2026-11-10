package prueba;

import vehiculos.Vehiculo;
import vehiculos.Moto;

public class PruebaVehiculos {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Auto");
        Moto m = new Moto("Moto deportiva", 600);

        // v.mostrarTipo();
        // m.mostrarTipo();

        m.mostrarDatos();
    }
}
