package prueba;

import vehiculos.Vehiculo;
import vehiculos.Moto;

public class PruebaVehiculos {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Auto", "Toyota");
        Moto m = new Moto("Deportiva", "Yamaha", 600);

        // System.out.println(v.tipo);
        // System.out.println(m.marca);

        m.mostrarDatos();
    }
}
