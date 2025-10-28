
public class CNodo {
    int clave;
    String descripcion;
    double precio;
    int stock;
    CNodo sig;  

    @Override
    public String toString() {
        return "[" + clave +", "+ descripcion + ", " + precio +", "+ stock +']';
    }

    public CNodo(int clave, String descripcion, double precio, int stock){ 
        this.clave= clave;
        this.descripcion= descripcion;
        this.precio= precio;
        this.stock= stock;
        
        sig = null;
    }
     
    public int setClave(int clave){
        this.clave= clave;
        return clave;
    }


}