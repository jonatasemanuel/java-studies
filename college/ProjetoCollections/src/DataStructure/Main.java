package DataStructure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> pessoas = new ArrayList<>();

        pessoas.add("Mario");
        pessoas.add("Luigi");
        pessoas.add("Peach");
        pessoas.add("Yoshi");

        System.out.println(pessoas.get(0));
//        pessoas.remove(1);

        System.out.println("Ordem original");
        System.out.println(pessoas);

        Collections.sort(pessoas);
        System.out.println("Ordenado");

        System.out.println(pessoas);

//        HASH MAP
//        HashMap<String, String> capitais = new HashMap<>();
//        capitais.put("Brasil", "Brasilia");
//        capitais.put("Argentina", "Buenos Aires");
//        capitais.put("Paraguai", "Assução");
//        capitais.put("Uruguai", "Montevidéu");
//
//        System.out.println(capitais);
//        System.out.println(capitais.get("Uruguai"));
    }
}