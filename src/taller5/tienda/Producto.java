package tienda;

class Producto {
    String nombre;
    double precio;
    int stock;

    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    void mostrarInfo() {
        System.out.printf("Nombre: %s | Precio: $%.2f | Stock: %d%n",
                this.nombre, this.precio, this.stock);
    }
}
