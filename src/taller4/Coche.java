public class Coche {
    private String marca;
    private String modelo;
    private double velocidadMaxima;

    // ------------- CONSTRUCTORES -------------
    public Coche(String marca, String modelo, double velocidadMaxima) {
        if ((marca != null && marca.trim().isEmpty()) ||
                (marca != null && marca.trim().isBlank())) {
            throw new IllegalArgumentException("La marca del coche no puede estar vacía.");
        }

        if ((modelo != null && modelo.trim().isEmpty()) ||
                (modelo != null && modelo.trim().isBlank())) {
            throw new IllegalArgumentException("El modelo del coche no puede estar vacío.");
        }

        if (velocidadMaxima < 0) {
            throw new IllegalArgumentException("La velocidad máxima no puede ser menor a 0.");
        }
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public Coche() {
        this("Desconocido", "Desconocido", 0);
    }
    // ------------- FIN - CONSTRUCTORES -------------

    // ------------- GETTERS -------------
    @Override
    public String toString() {
        return String.format("Marca: %s | Modelo: %d | Velocidad máxima: %.2f",
                this.marca, this.modelo, this.velocidadMaxima);
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public double getVelocidadMaxima() {
        return this.velocidadMaxima;
    }
    // ------------- FIN - GETTERS -------------

    // ------------- SETTERS -------------
    public void setMarca(String marca) {
        if ((marca != null && marca.trim().isEmpty()) ||
                (marca != null && marca.trim().isBlank())) {
            throw new IllegalArgumentException("La marca del coche no puede estar vacía.");
        }
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        if ((modelo != null && modelo.trim().isEmpty()) ||
                (modelo != null && modelo.trim().isBlank())) {
            throw new IllegalArgumentException("El modelo del coche no puede estar vacío.");
        }
        this.modelo = modelo;
    }

    public void acelerar(double velocidad) {
        if (velocidad < 1) {
            throw new IllegalArgumentException("La velocidad para acelerar debe ser positiva.");
        }
        this.velocidadMaxima += velocidad;
    }
    // ------------- FIN - SETTERS -------------
}
