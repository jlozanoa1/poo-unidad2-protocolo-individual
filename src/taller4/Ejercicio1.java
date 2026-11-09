public class Ejercicio1 {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Marcus", 20, 4.95);

        Estudiante estudiante2 = new Estudiante();

        estudiante2.setEdad(12);

        System.out.println(estudiante1.getEdad());
        System.out.println(estudiante2.getEdad());
    }
}
