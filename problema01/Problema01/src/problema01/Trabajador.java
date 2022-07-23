
package problema01;


public class Trabajador {

   private String cedula;
   private String nombres;
   private String correo;
   private double sueldo;
   private String mesSueldo;

    public Trabajador(String ced, String nom, String cor, double suel, 
            String mesSuel) {
        this.cedula = ced;
        this.nombres = nom;
        this.correo = cor;
        this.sueldo = suel;
        this.mesSueldo = mesSuel;
    }
   
    public void establecerCedula(String n) {
        this.cedula = n;
    }

    public void establecerNombres(String n) {
        this.nombres = n;
    }

    public void establecerCorreo(String n) {
        this.correo = n;
    }

    public void establecerSueldo(double n) {
        this.sueldo = n;
    }

    public void establecerMesSueldo(String n) {
        this.mesSueldo = n;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public String obtenerCorreo() {
        return correo;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    public String obtenerMesSueldo() {
        return mesSueldo;
    }
    
    @Override
    public String toString() {
        
        String cadena = String.format("Trabajador:\n"
                + "Cedula: %s\n"
                + "Nombre: %s\n"
                + "Correo: %s\n"
                + "Sueldo: %.2f\n"
                + "Mes del Sueldo: %s\n",
                cedula, nombres, correo, sueldo, mesSueldo);  
        
        return cadena;    
    }
}
