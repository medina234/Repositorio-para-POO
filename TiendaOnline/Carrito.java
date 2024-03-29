import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Carrito {
    private List<Producto> productos;

    public Carrito() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        productos.remove(producto);
    }

    public void eliminarProductoPorNombre(String nombre) {
        Iterator<Producto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            Producto producto = iterator.next();
            if (producto.getNombre().equals(nombre)) {
                iterator.remove();
                System.out.println("Producto eliminado del carrito: " + nombre);
                return;
            }
        }
        System.out.println("Producto no encontrado en el carrito: " + nombre);
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    public void realizarCompra() {
        // Aquí puedes implementar la lógica para realizar la compra,
        // como actualizar el stock, procesar el pago, etc.
        System.out.println("Compra realizada por un total de: $" + calcularPrecioTotal());
        productos.clear(); // Limpiar el carrito después de la compra
    }

    @Override
    public String toString() {
        return "Carrito{" +
                "productos=" + productos +
                '}';
    }
}
