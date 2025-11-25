
public class CProducto {
    int clave;
    String nombre;
    double precio;
    int stock;
    
    public CProducto(int clave, String nombre, double precio, int stock) {
        this.clave = clave;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    
    @Override
    public String toString() {
        return "Clave: " + clave + " | Nombre: " + nombre + " | Precio: $" + precio + " | Stock: " + stock;
    }
}
