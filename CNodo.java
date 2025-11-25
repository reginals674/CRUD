public class CNodo {
    CProducto producto;
    CNodo sig;
    
    public CNodo(CProducto producto) {
        this.producto = producto;
        this.sig = null;
    }
    
    public CProducto getProducto() {
        return producto;
    }
}