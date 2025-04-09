package tutoria.pkg1;

public class Usuario {
    private int pin;
    private String nombre;
    private String apellido;
    private int edad;
    private int dpi;
    private float dinero;
    
    public Usuario(int pin, String nombre, String apellido, int edad, int dpi){
        this.pin = pin;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dpi = dpi;
        
        this.dinero = 0;
    }
}
