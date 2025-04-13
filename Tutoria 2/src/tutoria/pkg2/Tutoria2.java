package tutoria.pkg2;

import java.util.ArrayList;

class Tutoria2 {
    
    //Eliminar la lista
    public static ArrayList<Mascota> mascotas;
    
    public static void main(String[] args) {
        // TODO code application logic here
        mascotas = new ArrayList<Mascota>();
        
        MenuPrincipal menu = new MenuPrincipal();
        
        menu.setVisible(true);
    }
    
}
