package tutoria.pkg2;

import java.util.ArrayList;

class Tutoria2 {
    
    //Eliminar la lista
    public static ArrayList<Mascota> mascotas;
    
    public static void main(String[] args) {
        // TODO code application logic here
        mascotas = new ArrayList<Mascota>();
        
        Dueno dueno1 = new Dueno("Xavi", 49675480);
        
        Mascota mascota1 = new Mascota("Rocket", "Perro", "Huskey", 4, dueno1);
        
        mascotas.add(mascota1);
        
        MenuPrincipal menu = new MenuPrincipal();
        
        menu.setVisible(true);
    }
    
}
