import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Crear un libro
        Libro libro = new Libro("El principito", "Antoine de Saint-Exupéry", "Salvatore Fierro", 1943, 96);

        // Crear un socio
        Socio socio = new Socio("Juan", "Pérez", "12345678A");

        // Crear un préstamo
        Date fechaPrestamo = new Date();
        Date fechaDevolucion = new Date(); // Fecha de devolución pendiente
        Prestamo prestamo = new Prestamo(fechaPrestamo, fechaDevolucion, libro, socio);

        // Mostrar información del préstamo
        System.out.println("Información del préstamo:");
        System.out.println("Fecha de préstamo: " + prestamo.getFechaPrestamo());
        System.out.println("Fecha de devolución: " + prestamo.getFechaDevolucion());
        System.out.println("Libro prestado: " + prestamo.getLibro());
        System.out.println("Socio: " + prestamo.getSocio().getNombre() + " " + prestamo.getSocio().getApellido());
    }
}
