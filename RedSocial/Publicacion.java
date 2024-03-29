import java.util.ArrayList;
import java.util.List;

public class Publicacion {
    private String contenido;
    private Usuario usuario;
    private List<Comentario> comentarios;

    public Publicacion(String contenido, Usuario usuario) {
        this.contenido = contenido;
        this.usuario = usuario;
        this.comentarios = new ArrayList<>();
    }

    public void agregarComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

    public void mostrarComentarios() {
        for (Comentario comentario : comentarios) {
            System.out.println(comentario.getUsuario().getNombre() + ": " + comentario.getContenido());
        }
    }

    // Otros getters y setters

    public String getContenido() {
        return this.contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Comentario> getComentarios() {
        return this.comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }
}
