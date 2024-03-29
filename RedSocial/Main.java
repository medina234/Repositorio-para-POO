public class Main {
    public static void main(String[] args) {
        // Crear usuarios
        Usuario usuario1 = new Usuario("Juan", "Perez", "juan@example.com", "contraseña123");
        Usuario usuario2 = new Usuario("Maria", "Gomez", "maria@example.com", "clave456");

        // Crear publicaciones y comentarios
        Publicacion publicacion1 = new Publicacion("Hola, ¿cómo están?", usuario1);
        Publicacion publicacion2 = new Publicacion("¡Hoy es un gran día!", usuario2);
        Comentario comentario1 = new Comentario("Estoy bien, gracias.", usuario2);
        Comentario comentario2 = new Comentario("Feliz de escuchar eso.", usuario1);

        // Agregar comentarios a las publicaciones
        publicacion1.agregarComentario(comentario1);
        publicacion2.agregarComentario(comentario2);

        // Mostrar las publicaciones y sus comentarios
        System.out.println("Publicación 1:");
        System.out.println(publicacion1.getUsuario().getNombre() + ": " + publicacion1.getContenido());
        System.out.println("Comentarios:");
        publicacion1.mostrarComentarios();
        
        System.out.println("\nPublicación 2:");
        System.out.println(publicacion2.getUsuario().getNombre() + ": " + publicacion2.getContenido());
        System.out.println("Comentarios:");
        publicacion2.mostrarComentarios();
    }
}
