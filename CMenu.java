import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CMenu{

    public static int menuPrincipal() throws Exception {
        int opcion;
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in)); 

        System.out.println("\n--- Menu Principal ---");
        System.out.println("[1] Agregar producto");
        System.out.println("[2] Eliminar producto");
        System.out.println("[3] Actualizar producto");
        System.out.println("[4] Deshacer productos");
        System.out.println("[5] Rehacer productos");
        System.out.println("[6] Log de transacciones");
        System.out.println("[7] imprimir productos");
        System.out.println("[8] Salir \n");
        System.out.print("Seleccione una opcion: ");
        
        opcion = Integer.valueOf(entrada.readLine());

        
        return opcion;
    }
    public static CNodo agregarProducto() throws Exception {
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in)); 

        System.out.println("\n--- Agregar Producto ---");
        System.out.print("Ingrese la clave del producto: ");
        int clave = Integer.valueOf(entrada.readLine());
        System.out.print("Ingrese la descripcion del producto: ");
        String descripcion = entrada.readLine();
        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.valueOf(entrada.readLine());
        System.out.print("Ingrese el stock del producto: ");
        int stock = Integer.valueOf(entrada.readLine());

        CNodo nodo = new CNodo(clave, descripcion, precio, stock);
        return nodo;
    }

    public static int eliminarProducto() throws Exception {
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in)); 

        System.out.println("\n--- Eliminar Producto ---");
        System.out.print("Ingrese la clave del producto a eliminar: ");
        int clave = Integer.valueOf(entrada.readLine());
        return clave;
    }   
}