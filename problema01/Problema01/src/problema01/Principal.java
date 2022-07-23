
package problema01;

import java.sql.SQLException;
import java.util.Scanner;


public class Principal {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws SQLException {
        
        Enlace c = new Enlace();       
        
        int n = 1;
           
        while(n != 0) {
            
            System.out.println("Ingres su cedula: ");         
            String cedula = sc.nextLine();
            
            System.out.println("Ingrese su nombre: ");
            String nombre = sc.nextLine();
            
            System.out.println("Ingrese su correo: ");
            String correo = sc.nextLine();
            
            System.out.println("Ingrese el sueldo: ");
            double sueldo = sc.nextDouble();
            
            System.out.println("Ingrese el mes del sueldo: ");
            sc.nextLine();
            String mes = sc.nextLine();
            
            Trabajador t1 = new Trabajador(cedula, nombre, correo, sueldo, mes);
            c.insertarTrabajador(t1);
            
            System.out.println("Ingrese 0 para terminar el proceso: ");
            n = sc.nextInt();
            sc.nextLine();
             
        }
        
    }
    
}
