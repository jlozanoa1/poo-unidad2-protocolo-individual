package empleados;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInformacion() {
        System.out.printf("Gerente: %s | Salario: $%.2f | Departamento: %s%n",
                nombre, salario, departamento);
    }
}
