
package problema01;

public class Principal2 {
    
    public static void main(String[] args) {
        
        Enlace c = new Enlace();
        
        for (int i = 0; i < c.obtenerDataTrabajador().size(); i++) {
            System.out.printf("%s", c.obtenerDataTrabajador().get(i));
        } 
        
    }
    
}
