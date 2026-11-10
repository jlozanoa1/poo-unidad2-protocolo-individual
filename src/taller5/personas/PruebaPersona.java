package personas;

public class PruebaPersona {
    public static void main(String[] args) {
        Persona p = new Persona("Ana", 25);

        // System.out.println(p.nombre);
        // p.nombre = "Luis";

        System.out.println("Nombre: " + p.getNombre());
        p.setNombre("Luis");
        System.out.println("Nuevo nombre: " + p.getNombre());

        System.out.println("Edad: " + p.edad);
        p.edad = 30;
        System.out.println("Nueva edad: " + p.edad);
    }
}
