import java.util.ArrayList;
import java.util.List;

public class RedSocial {
    private List<Publicacion> publicaciones;

    public RedSocial() {
        this.publicaciones = new ArrayList<>();
    }

    public void agregarPublicacion(Publicacion publicacion) {
        publicaciones.add(publicacion);
    }

    public void verPublicaciones() {
        for (Publicacion publicacion : publicaciones) {
            System.out.println(publicacion.getUsuario().getNombre() + ": " + publicacion.getContenido());
        }
    }
}
