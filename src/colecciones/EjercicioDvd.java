package colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjercicioDvd {



    public static void main (String[] args) {
        List<Dvd> lista = listaPeliculas();
        for (Dvd dvd : lista) {
            System.out.println(dvd);
        }

        Collections.sort(lista);
        System.out.println(":::::::::::::");
        for(Dvd dvd : lista){
            System.out.println(dvd);
        }

        System.out.println(":::::::::::::");
        OrdenamientoPorGenero ordenamientoPorGenero = new OrdenamientoPorGenero();
        Collections.sort(lista, ordenamientoPorGenero);

        for(Dvd dvd : lista){
            System.out.println(dvd);
        }

        System.out.println(":::::::::::::");
        OrdenamientoPorProtagonista ordenamientoPorProtagonista = new OrdenamientoPorProtagonista();
        Collections.sort(lista, ordenamientoPorProtagonista);

        for(Dvd dvd : lista){
            System.out.println(dvd);
        }

        System.out.println(":::::::::::::");
        OrdenamientoPorDirector ordenamientoPorDirector = new OrdenamientoPorDirector();
        Collections.sort(lista, ordenamientoPorDirector);

        for(Dvd dvd : lista){
            System.out.println(dvd);
        }
    }

    private static List<Dvd> listaPeliculas() {

        Dvd peli1 = new Dvd ("Venom", "Accion", "Tom Hardy","Ruben Fleischer");
        Dvd peli2 = new Dvd ("Megalodon", "Accion","Jason statham", "Jon Turteltaub");
        Dvd peli3 = new Dvd ("Black Panther", "Accion", "Chadwick Boseman","Ryan Coogler");
        Dvd peli4 = new Dvd ("Juego de Gemelas", "Romantica", "Lindsay Lohan","Nancy Meyers");
        Dvd peli5 = new Dvd ("Interestelar", "Drama", "Vera Farmiga","Christopher Nolan");
        Dvd peli6 = new Dvd ("Juegos del Hambre", "Ficcion", "Jennifer Lawrence","Gary Ross");
        Dvd peli7 = new Dvd ("Una esposa de mentira", "Comedia", "Adam Sandler","Dennis Dugan");
        Dvd peli8 = new Dvd ("Son como niños", "Comedia", "Adam Sandler","Dennis Dugan");
        Dvd peli9 = new Dvd ("Harry Potter", "Ficcion", "Daniel","Alfonso Cuaron");
        Dvd peli10 = new Dvd ("Titanic", "Suspenso", "Leonardo DiCaprio","James Cameron");


        List<Dvd> listaDvd = new ArrayList<>();
        listaDvd.add(peli1);
        listaDvd.add(peli2);
        listaDvd.add(peli3);
        listaDvd.add(peli4);
        listaDvd.add(peli5);
        listaDvd.add(peli6);
        listaDvd.add(peli7);
        listaDvd.add(peli8);
        listaDvd.add(peli9);
        listaDvd.add(peli10);
        
        return listaDvd;


    }

}
