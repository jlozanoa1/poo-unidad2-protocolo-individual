public class Ejercicio2 {
    public static void main(String[] args) {
        Coche coche1 = new Coche("BMW", "M3 GTR", 300);
        coche1.acelerar(12);

        System.out.println(coche1.getVelocidadMaxima());
    }
}
