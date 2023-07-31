 
package Factory.FactoryFrutas;
 
public class Mango implements Fruta{

    @Override
    public void comer() {
        System.out.println("comer");
    }

    @Override
    public void lavar() {
        System.out.println("lavar");
    }
    
}
