public class CLog {
    CNodoLog inicio;
    CNodoLog fin;
    int tamanio;
    
    CLog() {
        inicio = fin = null;
        tamanio = 0;
    }
    
    void agregar(CTransaccion transaccion) {
        CNodoLog nodo = new CNodoLog(transaccion);
        if (tamanio == 0) {
            inicio = fin = nodo;
        } else {
            fin.sig = nodo;
            fin = nodo;
        }
        tamanio++;
    }
    
    void imprimir() {
        if (tamanio == 0) {
            System.out.println("No hay transacciones registradas");
        } else {
            CNodoLog temp = inicio;
            while (temp != null) {
                System.out.println(temp.transaccion);
                temp = temp.sig;
            }
        }
    }
}
 