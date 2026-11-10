public class Ejercicio2 {
    public static void main(String[] args) {
        Coche coche1 = new Coche("BMW", "M3 GTR", 300);
        System.out.println(coche1.getVelocidadMaxima());

        coche1.acelerar(1);

        // coche1.velocidadMaxima = 500;

        System.out.println(coche1.getVelocidadMaxima());
    }
}
