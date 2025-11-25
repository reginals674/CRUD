public class CNodoPila {
    COperacion operacion;
    CNodoPila sig;
    
    public CNodoPila(COperacion operacion) {
        this.operacion = operacion;
        this.sig = null;
    }
}
