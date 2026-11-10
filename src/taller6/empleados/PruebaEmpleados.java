package empleados;

public class PruebaEmpleados {
    public static void main(String[] args) {
        Empleado e = new Empleado("Luis", 2500);
        Gerente g = new Gerente("Ana", 5000, "Ventas");

        e.mostrarInformacion();
        g.mostrarInformacion();
    }
}
