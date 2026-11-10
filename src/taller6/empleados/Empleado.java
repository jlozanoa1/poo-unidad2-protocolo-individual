package empleados;

public class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarInformacion() {
        System.out.printf("Nombre: %s | Salario: $%.2f%n", nombre, salario);
    }
}
