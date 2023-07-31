 
package Prototype.Documento;
 
public abstract class Documento implements Cloneable{
    protected String contenido;

    public Documento(String contenido) {
        this.contenido = contenido;
    }

    public abstract void imprimir();

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
