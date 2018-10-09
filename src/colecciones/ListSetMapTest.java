package colecciones;

import java.util.*;
import java.util.Map.Entry;

public class ListSetMapTest {


    public static void main(String[] args)
    {
        List<String> lista = new ArrayList<>();
        lista.add("Israel");
        lista.add("Dann");
        lista.add("Serch");
        lista.add("Josman");
        lista.add("Gera");

        Set<String> set = new HashSet<>();
        set.add("Israel");
        set.add("Dann");
        set.add("Serch");
        set.add("Josman");
        set.add("Gera");



        Map<String, String> mapa = new HashMap<>();
        mapa.put("Isra" , "Israel Segundo");
        mapa.put("Dann", "Dann Hernandez");
        mapa.put("Serch", "Sergio Rivera");
        mapa.put("Josman","Jose Manuel Moreno");
        mapa.put("Gera","Gerardo Rincon");

        System.out.println("Iterando lista...");
        for(String nickname :lista){
            System.out.println(nickname);
        }
        System.out.println(":::::::::::::");

        System.out.println("Iterando set...");
        for(String nickname : set){
            System.out.println(nickname);
        }
        System.out.println(":::::::::::::");

        System.out.println("Iterando mapa...");
        for(Entry<String,String> entry: mapa.entrySet()){
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        System.out.println("::::::::::::::");

        System.out.println(new ListSetMapTest().hashCode());

    }
}
