public class CNodoLog {
    CTransaccion transaccion;
    CNodoLog sig;
    
    public CNodoLog(CTransaccion transaccion) {
        this.transaccion = transaccion;
        this.sig = null;
    }
}