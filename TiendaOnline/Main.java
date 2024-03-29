import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Crear algunos productos
        Producto producto1 = new Producto("Camiseta", 20.0, 10);
        Producto producto2 = new Producto("Pantalón", 30.0, 8);
        Producto producto3 = new Producto("Zapatos", 50.0, 5);

        // Crear un carrito
        Carrito carrito = new Carrito();

        Scanner scanner = new Scanner(System.in);

        // Menú de interacción
        int opcion;
        do {
            System.out.println("===== Tienda Online =====");
            System.out.println("1. Agregar producto al carrito");
            System.out.println("2. Eliminar producto del carrito");
            System.out.println("3. Mostrar carrito");
            System.out.println("4. Mostrar precio total");
            System.out.println("5. Realizar compra");
            System.out.println("6. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    System.out.println("Seleccione el producto a agregar:");
                    System.out.println("1. Camiseta");
                    System.out.println("2. Pantalón");
                    System.out.println("3. Zapatos");
                    System.out.print("Ingrese su opción: ");
                    int productoSeleccionado = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer del scanner

                    Producto producto;
                    switch (productoSeleccionado) {
                        case 1:
                            producto = producto1;
                            break;
                        case 2:
                            producto = producto2;
                            break;
                        case 3:
                            producto = producto3;
                            break;
                        default:
                            System.out.println("Opción no válida");
                            continue;
                    }
                    carrito.agregarProducto(producto);
                    System.out.println("Producto agregado al carrito: " + producto.getNombre());
                    break;
                case 2:
                    System.out.println("Productos en el carrito:");
                    System.out.println(carrito);
                    System.out.print("Ingrese el nombre del producto a eliminar: ");
                    String nombreProductoEliminar = scanner.nextLine();
                    carrito.eliminarProductoPorNombre(nombreProductoEliminar);
                    break;
                case 3:
                    System.out.println("Productos en el carrito:");
                    System.out.println(carrito);
                    break;
                case 4:
                    System.out.println("Precio total: $" + carrito.calcularPrecioTotal());
                    break;
                case 5:
                    carrito.realizarCompra();
                    break;
                case 6:
                    System.out.println("¡Gracias por visitar nuestra tienda online!");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 6);

        scanner.close();
    }
}
