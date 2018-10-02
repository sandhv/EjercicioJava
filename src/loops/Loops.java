package loops;

import java.util.ArrayList;

public class Loops {

    public void iterarConFor() {
        for (int i = 0; i < 10; ++i) {
            System.out.println("Dentro del ciclo FOR " + i);
        }

        //Iteración co ciclo FOR EACH
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(0);
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        for (Integer numero: numeros){
            System.out.println("Dentro de FOREACH " + numero);
        }

        //Iteración con ciclo WHILE
        int x = 0;
        while (x < 5) {
            System.out.println("Dentro de WHILE " + x++);
        }
         //Iteración con ciclo DO WHILE

         do {
             System.out.println("Dentro de DO WHILE + " + x++);
         } while(x == 0);
         }

        }

