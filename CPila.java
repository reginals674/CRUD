public class CPila {
    CNodoPila primero;
    CNodoPila ultimo;
    int tamano;
    
    CPila() {
        primero = ultimo = null;
        tamano = 0;
    }
    
    void push(COperacion operacion) {
        CNodoPila nuevoNodo = new CNodoPila(operacion);
        if (tamano == 0) {
            primero = ultimo = nuevoNodo;
        } else {
            ultimo.sig = nuevoNodo;
            ultimo = nuevoNodo;
        }
        tamano++;
    }
    
    COperacion pop() {
        if (tamano == 0) {
            return null;
        } else {
            COperacion operacion = primero.operacion;
            primero = primero.sig;
            tamano--;
            return operacion;
        }
    }
    
    boolean isEmpty() {
        return tamano == 0;
    }
    
    void vaciar() {
        primero = ultimo = null;
        tamano = 0;
    }
}