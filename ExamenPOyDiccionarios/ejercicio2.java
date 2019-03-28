package examenpoydiccionarios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        HashMap<String, String> sinonimos = new HashMap<>();
        sinonimos.put("caliente", "hot");
        sinonimos.put("rojo", "red");
        sinonimos.put("ardiente", "hot");
        sinonimos.put("verde", "green");
        sinonimos.put("agujetas", "stiff");
        sinonimos.put("abrasador", "hot");
        sinonimos.put("hierro", "iron");
        sinonimos.put("grande", "big");

    
        int salida = 0;

        do {
            System.out.print("Introduzca una palabra y le dare los sinonimos: ");
            String palabra = sc.nextLine();
  
            if (palabra.equals("salir")) {
                salida = 1;
            } else {
          
                if (sinonimos.containsKey(palabra)) {
               
                    ArrayList<String> sinos = new ArrayList<String>();
               
                    String valor = sinonimos.get(palabra);

               
                    for (Map.Entry par : sinonimos.entrySet()) {
                        if ((par.getValue().equals(valor)) && (!par.getKey().equals(palabra))) {
                            String sino = par.getKey().toString();
                            sinos.add(sino);
                        }
                    }
             
                    if (sinos.isEmpty()) {
                        System.out.print("No conozco sinonimos de esa palabra, ¿quiere añadir alguno? (s o n): ");
                        String opcion = sc.nextLine();
                        if (opcion.equals("s")) {
                            System.out.print("Introduzca un sinonimo de " + palabra + ": ");
                            String nuevoSinonimo = sc.nextLine();
                            sinonimos.put(nuevoSinonimo, sinonimos.get(palabra));
                            System.out.println("Nuevo sinonimo aprendido.");
                        }
                    } else { 
                        System.out.println("Sinonimos de " + palabra + ": ");
                        for (String resultado : sinos) {
                            System.out.println(resultado);
                        }
                    }
                } else { 
                    System.out.print("No conozco esa palabra, ¿quiere añadirla? (s o n): ");
                    String opcion2 = sc.nextLine();
                    if (opcion2.equals("s")) {
                        System.out.print("Introduzca la traduccion de " + palabra + " en ingles: ");
                        String nuevatrad = sc.nextLine();
                        sinonimos.put(palabra, nuevatrad);
                    }
                }
            }
        } while (salida != 1);
    }
}
