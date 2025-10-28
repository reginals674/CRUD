


public class CLista {
    CNodo inicio;
    CNodo fin;
    int tamanio;

    CLista(){
        inicio = fin = null;
        tamanio = 0;
    }
    

    void imprimir(){

        System.err.println();
        if (tamanio == 0){
            System.out.println("Lista vacia");
            
        }else{
            CNodo  temp= inicio;
            while( temp != null){
                System.out.println(temp.toString()) ;
                temp = temp.sig;
            }

        }
        
    }
    void insertar(CNodo nodo){
        
        if( tamanio == 0){
            inicio = fin = nodo;
        }else{
            fin.sig = nodo;
            fin = nodo;
            
        }
        tamanio++;
    }  

    void eliminar(int clave){
        
        if( tamanio == 0){
            System.out.println("Lista vacia, no se puede eliminar un elemento");
        }

        // eliminar al inicio
        if (inicio.clave == clave){
            inicio = inicio.sig;
            if (inicio == null) {
                fin = null;
            }
            tamanio--;
            System.out.println("Elemento |" + clave + "| eliminado");
        }

        // buscar en el resto de la lista
        CNodo anterior = inicio;
        CNodo actual = inicio.sig;
        while( actual != null && actual.clave != clave){
            anterior = actual;
            actual = actual.sig;
        }

        if (actual != null){
           
            anterior.sig = actual.sig;
            if (actual == fin){
                fin = anterior;
            }
            tamanio--;
             System.out.println("Elemento |" + clave + "| eliminado");
        } else {
            System.out.println("Elemento no encontrado");
        }
    }  
}
