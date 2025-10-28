



public class CPrueba extends CMenu{
    public static void main(String[] args)throws Exception {
        CLista productos = new CLista();

        CNodo n1 = new CNodo(111, "Estufa", 10050, 12);
        productos.insertar(n1);
        CNodo n2 = new CNodo(115, "Reloj ", 2000, 5);
        productos.insertar(n2);
        
        int opcion;
        CNodo nodoA;
        do {
            opcion= menuPrincipal();
            switch (opcion) {
                case 1:
                    System.out.println("Agregar producto");
                    nodoA = agregarProducto();
                    productos.insertar(nodoA);
            
                    break;
                case 2:
                    System.out.println("Eliminar productos");

                    if (productos.tamanio == 0){
                        System.out.println("Lista vacia, no se puede eliminar un elemento");
                        
                    }else{
                        int clave = eliminarProducto(); 
                        productos.eliminar(clave);
                    }
                    
                    break;
                case 3:
                    System.out.println("Actualizar productos");
                    break;
                case 4:
                    System.out.println("Deshacer productos");
                    break;  
                case 5:
                    System.out.println("Rehacer productos");
                    break;
                case 6:
                    System.out.println("Log de transacciones");
                    break;
                case 7:
                    System.out.println("Mostrar productos");
                    productos.imprimir();
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }


        } while(opcion != 8);




        
        

    }

}
