/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author pc21
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean salir = false;
        HashMap<String, String> paises = new HashMap<>();
        
        paises.put("españa", "madrid");
        paises.put("portugal", "lisboa");
        paises.put("francia", "paris");
        
        Scanner s = new Scanner(System.in);
        
        do {
            
        System.out.print("Escribe el nombre del pais y te dire la capital ");
        String palabraIntro = s.nextLine().toLowerCase();
        if (palabraIntro.toLowerCase().equals("salir")) {
            salir = true;
        } else if (paises.containsKey(palabraIntro)) {
            System.out.println(palabraIntro + " su capital es:  " + paises.get(palabraIntro));
        } else {
            System.out.print("Lo siento no conozco la capital de ese pais, cual es? ");
            String pais = palabraIntro;  
            String capital = s.nextLine().toLowerCase();
            paises.put(pais, capital); 
        }
        
        } while(!salir);
        // TODO code application logic here
    }
    
    
    
}
