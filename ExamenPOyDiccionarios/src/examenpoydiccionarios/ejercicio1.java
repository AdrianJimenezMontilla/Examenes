package Examenpoydiccionarios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicio1 {

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
                        System.out.println("No conozco sinonimos de esa palabra.");
                    } else {
                        System.out.println("Sinonimos de " + palabra + ": ");
                        for (String pintaSinonimos : sinos) {
                            System.out.println(pintaSinonimos);
                        }
                    }
                } else { 
                    System.out.print("No conozco esa palabra.");
                }
            }
        } while (salida != 1);
    }
}
