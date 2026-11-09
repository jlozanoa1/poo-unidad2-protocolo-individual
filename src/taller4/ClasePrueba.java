public class ClasePrueba {
    // Esta clase no dispone de métodos get y set para ejemplificar
    // la mala práctica de intentar acceder a propiedades privadas
    // directamente.
    private String propiedad1;
    private int propiedad2;
    private double propiedad3;

    public ClasePrueba(String propiedad1, int propiedad2, double propiedad3) {
        this.propiedad1 = propiedad1;
        this.propiedad2 = propiedad2;
        this.propiedad3 = propiedad3;
    }

}
