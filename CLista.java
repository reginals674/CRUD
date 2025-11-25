public class CLista {
    CNodo inicio;
    CNodo fin;
    int tamanio;
    
    CLista(){
        inicio = fin = null;
        tamanio = 0;
    }
    
    void imprimir(){
        if (tamanio == 0){
            System.out.println("Lista vacia");
        }else{
            CNodo temp= inicio;
            while( temp != null){
                System.out.println(temp.getProducto()) ;
                temp = temp.sig;
            }
        }
    }
    
    void insertar(CProducto producto){
        CNodo nodo= new CNodo(producto);
        if( tamanio == 0){
            inicio = fin = nodo;
        }else{
            fin.sig = nodo;
            fin = nodo;
        }
        tamanio++;
    }
    
    CProducto eliminar (int clave){
        CNodo temp = inicio;
        CNodo temp2 = null;
        if (tamanio == 0){
            System.out.println("No hay elementos en la lista!");
            return null;
        } else {
            if (temp.producto.clave == clave) {
                CProducto eliminado = temp.producto;
                inicio = inicio.sig;
                tamanio--;
                return eliminado;
            } else {
                while (temp != null && temp.producto.clave != clave) {
                    temp2 = temp;
                    temp = temp.sig;
                }
                if (temp != null) {
                    CProducto eliminado = temp.producto;
                    temp2.sig = temp.sig;
                    if (temp == fin) {
                        fin = temp2;
                    }
                    tamanio--;
                    return eliminado;
                } else {
                    System.out.println("Elemento no encontrado");
                }
            }
        }
        return null;
    }
    
    CProducto actualizar(int clave, CProducto nuevoProducto) {
        CNodo temp = inicio;
        
        while (temp != null && temp.producto.clave != clave) {
            temp = temp.sig;
        }
        if (temp != null){
            CProducto actualizado = temp.producto;
            temp.producto = nuevoProducto;
            return actualizado;
        } else{
            System.out.println("Elemento no encontrado");
        }
        return null;
    }
}