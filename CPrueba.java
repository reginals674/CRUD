
import java.awt.Menu;

public class CPrueba extends CMenu{
    public static void main(String[] args)throws Exception {
        CLista productos = new CLista();

        
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
                    int clave = eliminarProducto(); 
                    productos.eliminar(clave);
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
