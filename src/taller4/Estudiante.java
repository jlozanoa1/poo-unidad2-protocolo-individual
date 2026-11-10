public class Estudiante {
    private String nombre;
    private int edad;
    private double notaPromedio;

    // ------------- CONSTRUCTORES -------------
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
        this.nombre = nombre;
        this.edad = edad;
        this.notaPromedio = notaPromedio;
    }

    public Estudiante() {
        this("Desconocido", 1, 0);
    }
    // ------------- FIN - CONSTRUCTORES -------------

    // ------------- GETTERS -------------
    @Override
    public String toString() {
        return String.format("Nombre: %s | Edad: %d | Nota promedio: %.2f",
                this.nombre, this.edad, this.notaPromedio);
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public double getNotaPromedio() {
        return this.notaPromedio;
    }
    // ------------- FIN - GETTERS -------------

    // ------------- SETTERS -------------
    public void setNombre(String nombre) {
        if ((nombre != null && nombre.trim().isEmpty()) ||
                (nombre != null && nombre.trim().isBlank())) {
            throw new IllegalArgumentException("El nombre del estudiante no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad < 1) {
            throw new IllegalArgumentException("La edad no puede ser menor a 1.");
        }
        this.edad = edad;
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio < 0) {
            throw new IllegalArgumentException("La nota promedio no puede ser menor a 0.");
        }
        this.notaPromedio = notaPromedio;
    }
    // ------------- FIN - SETTERS -------------
}
