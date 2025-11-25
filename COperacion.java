public class COperacion {
    String tipo;
    CProducto producto;
    CProducto productoAnterior;
    
    public COperacion(String tipo, CProducto producto) {
        this.tipo = tipo;
        this.producto = producto;
    }
    
    public COperacion(String tipo, CProducto producto, CProducto productoAnterior) {
        this.tipo = tipo;
        this.producto = producto;
        this.productoAnterior = productoAnterior;
    }
}