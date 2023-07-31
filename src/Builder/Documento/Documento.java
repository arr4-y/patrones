 
package Builder.Documento; 
public class Documento {
    private String titulo;
    private String contenido;
    private String formato;
    private int paginas;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
     
     public void describir() {
        System.out.println("Documento: " + titulo);
        System.out.println("Formato: " + formato);
        System.out.println("Número de páginas: " + paginas);
    }
    
}
