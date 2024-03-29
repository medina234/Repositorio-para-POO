import java.util.Date;

public class Comentario {
    private String contenido;
    private Date fechaPublicacion;
    private Usuario usuario;

    public Comentario(String contenido, Usuario usuario) {
        this.contenido = contenido;
        this.fechaPublicacion = new Date();
        this.usuario = usuario;
    }

    // Getters y Setters

    public String getContenido() {
        return this.contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFechaPublicacion() {
        return this.fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
