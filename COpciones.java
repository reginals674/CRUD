public class COpciones {
    int opcion;
    
    public int menu(){
        System.out.println("\n--- Menu Principal ---");
        System.out.println("[1] Agregar producto");
        System.out.println("[2] Eliminar producto");
        System.out.println("[3] Actualizar producto");
        System.out.println("[4] Deshacer");
        System.out.println("[5] Rehacer");
        System.out.println("[6] Log de transacciones");
        System.out.println("[7] Imprimir productos");
        System.out.println("[8] Salir \n");
        System.out.print("Seleccione una opcion: ");
        opcion = Integer.parseInt(System.console().readLine());
        return opcion;
    }
    
    public CProducto agregarProducto(){
        System.out.println("\n--- Agregar Producto ---");
        System.out.print("Ingrese la clave del producto: ");
        int clave = Integer.parseInt(System.console().readLine());
        System.out.print("Ingrese la descripcion del producto: ");
        String nombre = System.console().readLine();
        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(System.console().readLine());
        System.out.print("Ingrese el stock del producto: ");
        int stock = Integer.valueOf(System.console().readLine());
        CProducto nuevoProducto = new CProducto(clave, nombre, precio, stock);
        return nuevoProducto;
    }
    
    public int claveEliminar(){
        System.out.print("Ingrese la clave del producto: ");
        int clave = Integer.parseInt(System.console().readLine());
        return clave;
    }
    
    public CProducto actualizar(int clave){
        System.out.println("\n--- Actualizar Producto ---");
        System.out.print("Ingrese la nueva descripcion del producto: ");
        String nombre = System.console().readLine();
        System.out.print("Ingrese el nuevo precio del producto: ");
        double precio = Double.parseDouble(System.console().readLine());
        System.out.print("Ingrese el nuevo stock del producto: ");
        int stock = Integer.valueOf(System.console().readLine());
        CProducto nuevoProducto = new CProducto(clave, nombre, precio, stock);
        return nuevoProducto;
    }
}
