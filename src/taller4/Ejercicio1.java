public class Ejercicio1 {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Marcus", 20, 0);

        Estudiante estudiante2 = new Estudiante();

        estudiante2.setEdad(1);
        estudiante2.setNombre("Marco");

        System.out.println(estudiante1.getEdad());
        System.out.println(estudiante2.getEdad());

        System.out.println(estudiante2.getNombre());

        System.out.println(estudiante1.getNotaPromedio());
    }
}
