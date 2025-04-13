package tutoria.pkg2;

public class Mascota {
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private Dueno dueno;

    public Mascota(String nombre, String especie, String raza, int edad, Dueno dueno) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.dueno = dueno;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public Dueno getDueno() {
        return dueno;
    }
}
