public class Estudiante {
    String nombre;
    int edad;
    double notaPromedio;

    public Estudiante(String nombre, int edad, double notaPromedio) {
        if ((nombre != null && nombre.trim().isEmpty()) ||
                (nombre != null && nombre.trim().isBlank())) {
            throw new IllegalArgumentException("El nombre del estudiante no puede estar vacío.");
        }

        if (edad <= 0) {
            throw new IllegalArgumentException("La edad del estudiante no puede ser menor o igual a 0.");
        }

        if (notaPromedio < 0) {
            throw new IllegalArgumentException("La nota promedio del estudiante no puede ser menor a 0.");
        }
    }

    public Estudiante() {
        this("Desconocido", 1, 0);
    }
}
