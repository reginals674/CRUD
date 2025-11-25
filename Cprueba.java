public class Cprueba {
    public static void main(String[] args) throws Exception {
        CLista productos = new CLista();
        CPila deshacer = new CPila();
        CPila rehacer = new CPila();
        CLog log = new CLog();
        
        CProducto p1 = new CProducto(1, "Producto1", 10.0, 6);
        CProducto p2 = new CProducto(2, "Producto2", 20.0, 7);
        
        productos.insertar(p1);
        productos.insertar(p2);
        
        int opcion;
        do {
            COpciones menu = new COpciones();
            opcion = menu.menu();
            
            switch (opcion) {
                case 1:
                    CProducto producto = menu.agregarProducto();
                    productos.insertar(producto);
                    deshacer.push(new COperacion("agregar", producto));
                    rehacer.vaciar();
                    log.agregar(new CTransaccion("alta", String.valueOf(producto.clave)));
                    System.out.println("Producto agregado exitosamente.");
                    break;
                    
                case 2:
                    int claveElim = menu.claveEliminar();
                    CProducto eliminado = productos.eliminar(claveElim);
                    if (eliminado != null) {
                        deshacer.push(new COperacion("eliminar", eliminado));
                        rehacer.vaciar();
                        log.agregar(new CTransaccion("baja", String.valueOf(eliminado.clave)));
                        System.out.println("Producto eliminado exitosamente.");
                    }
                    break;
                    
                case 3:
                    int claveAct = menu.claveEliminar();
                    CProducto productoAct = menu.actualizar(claveAct);
                    CProducto productoAnt = productos.actualizar(claveAct, productoAct);
                    if (productoAnt != null) {
                        deshacer.push(new COperacion("actualizar", productoAct, productoAnt));
                        rehacer.vaciar();
                        log.agregar(new CTransaccion("modif", String.valueOf(productoAct.clave)));
                        System.out.println("Producto actualizado exitosamente.");
                    }
                    break;
                    
                case 4:
                    if (deshacer.isEmpty()) {
                        System.out.println("No hay operaciones para deshacer.");
                        break;
                    }
                    
                    COperacion operacionDeshacer = deshacer.pop();
                    switch (operacionDeshacer.tipo) {
                        case "agregar":
                            productos.eliminar(operacionDeshacer.producto.clave);
                            System.out.println("Deshecho: agregado de producto " + operacionDeshacer.producto.clave);
                            break;
                        case "eliminar":
                            productos.insertar(operacionDeshacer.producto);
                            System.out.println("Deshecho: eliminacion de producto " + operacionDeshacer.producto.clave);
                            break;
                        case "actualizar":
                            productos.actualizar(operacionDeshacer.producto.clave, operacionDeshacer.productoAnterior);
                            System.out.println("Deshecho: actualizacion de producto " + operacionDeshacer.producto.clave);
                            break;
                    }
                    rehacer.push(operacionDeshacer);
                    break;
                    
                case 5:
                    if (rehacer.isEmpty()) {
                        System.out.println("No hay operaciones para rehacer.");
                        break;
                    }
                    
                    COperacion operacionRehacer = rehacer.pop();
                    switch (operacionRehacer.tipo) {
                        case "agregar":
                            productos.insertar(operacionRehacer.producto);
                            System.out.println("Rehecho: agregado de producto " + operacionRehacer.producto.clave);
                            break;
                        case "eliminar":
                            productos.eliminar(operacionRehacer.producto.clave);
                            System.out.println("Rehecho: eliminacion de producto " + operacionRehacer.producto.clave);
                            break;
                        case "actualizar":
                            productos.actualizar(operacionRehacer.producto.clave, operacionRehacer.producto);
                            System.out.println("Rehecho: actualizacion de producto " + operacionRehacer.producto.clave);
                            break;
                    }
                    deshacer.push(operacionRehacer);
                    break;
                    
                case 6:
                    System.out.println("\n--- Log de Transacciones ---");
                    log.imprimir();
                    break;
                    
                case 7:
                    System.out.println("\n--- Lista de Productos ---");
                    productos.imprimir();
                    break;
                    
                case 8:
                    System.out.println("Saliendo del sistema...");
                    break;
                    
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 8);
    }
}