public class Libro {
    private String titulo;
    private String autor;
    private String editorial;
    private int añoPublicacion;
    private int numeroPaginas;

    public Libro(String titulo, String autor, String editorial, int añoPublicacion, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.añoPublicacion = añoPublicacion;
        this.numeroPaginas = numeroPaginas;
    }

    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editorial='" + editorial + '\'' +
                ", añoPublicacion=" + añoPublicacion +
                ", numeroPaginas=" + numeroPaginas +
                '}';
    }
}