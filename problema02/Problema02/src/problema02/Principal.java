
package problema02;

public class Principal {
    
    public static void main(String[] args) {
        
        Enlace c = new Enlace();
        
        for (int i = 0; i < c.obtenerDataEstudiante().size(); i++) {
            System.out.printf("%s\n", c.obtenerDataEstudiante().get(i));
        } 
        
    }
    
}
