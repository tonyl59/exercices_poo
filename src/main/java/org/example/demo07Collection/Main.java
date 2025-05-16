package org.example.demo07Collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Démo pour SortedSet (HashSet)
        HashSet<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("C++"); // Le 2eme c++ est pas ajouté car set refuse les doublons
        set.add("Python3");
        System.out.println("Hashset : "+set); // Affiche à l'ordre d'ajout

        // Démo pour SortedSet (TreeSet)
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("Java");
        sortedSet.add("Python");
        sortedSet.add("C++");
        sortedSet.add("C++"); // Le 2eme c++ est pas ajouté car set refuse les doublons
        sortedSet.add("Python3");
        sortedSet.add("Javascript");
        System.out.println("Sortedset : "+sortedSet); // Affiche à l'ordre alphabetique croissant.

        // Méthode pour SortedSet
        System.out.println("Premier element : "+sortedSet.first());
        System.out.println("Dernier element : "+sortedSet.last());
        SortedSet<String> headset = sortedSet.headSet("Python");
        System.out.println("Sous ensemble avant Python :"+headset);
        SortedSet<String> tailset = sortedSet.tailSet("Javascript");
        System.out.println("Sous ensemble après Javascript "+tailset);

        // Démo pour le HashMap
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Java", 20);
        hashMap.put("Python", 10);
        hashMap.put("C++", 30);
        System.out.println("mon hashmap : "+hashMap );

        if(hashMap.containsKey("Java")){
            System.out.println("La clé Java existe deja");
        }
        if(hashMap.containsKey("Toto")) {
            System.out.println("La cle Toto existe déja");
        }else{
            hashMap.put("Toto",58);
        }

        System.out.println("mon hashmap : "+hashMap );

        // Methodes pour le hashmap
        System.out.println("Nombre d'element dans mon hashmap : "+hashMap.size());
        System.out.println("Valeur associé à la clé Java : "+hashMap.get("Java"));
        System.out.println("Supprimer l'élément avec la clé Toto");
        hashMap.remove("Toto");
        System.out.println("Après suppression : "+hashMap);

    }
}
