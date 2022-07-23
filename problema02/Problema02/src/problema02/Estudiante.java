
package problema02;


public class Estudiante {
    
    private String nombre;
    private String apellido;
    private double cal1;
    private double cal2;
    private double cal3;

    public Estudiante(String nom, String ape, double cal1, double cal2, 
            double cal3) {
        this.nombre = nom;
        this.apellido = ape;
        this.cal1 = cal1;
        this.cal2 = cal2;
        this.cal3 = cal3;
    }
    
    public void establecerNombre(String m) {
        this.nombre = m;
    }

    public void establecerApellido(String m) {
        this.apellido = m;
    }

    public void establecerCal1(double m) {
        this.cal1 = m;
    }

    public void establecerCal2(double m) {
        this.cal2 = m;
    }

    public void establecerCal3(double m) {
        this.cal3 = m;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public double obtenerCal1() {
        return cal1;
    }

    public double obtenerCal2() {
        return cal2;
    }

    public double obtenerCal3() {
        return cal3;
    }
    
    @Override
    public String toString() {
        
        String cadena = String.format("Estudiante\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Calificacion 1: %.2f\n"
                + "Calificacion 2: %.2f\n"
                + "Calificacion 3: %.2f\n",
                nombre, apellido, cal1, cal2, cal3);
        
        return cadena;
    }
}
