package org.example.demo06List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // syntaxe pour la collection List
        //List<String> prenoms = new ArrayList<String>();
        List<String> prenoms = new ArrayList<>();

        //List<Double>> // tjr une liste d'objets => Pour les primitifs qui on utilise les classes wrappers

        // La méthode add() pour ajouter un élement

        prenoms.add("toto");
        prenoms.add("tata");
        prenoms.add("tutu");
        prenoms.add("titi");

        // La méthode de get pour acceder a un element par son indice
        System.out.println(prenoms.get(0));
        System.out.println(prenoms.get(1));
        System.out.println(prenoms.get(2));
        System.out.println(prenoms.get(3));

        // La méthode set permet de modifier un element à son index précis
        prenoms.set(2,"tyty");
        System.out.println(prenoms.get(2));

        // La méthode remove permet de supprimer un element
        prenoms.remove(0);
        System.out.println("Liste apres suppression");
        System.out.println(prenoms);
        System.out.println(prenoms.get(0)); // La liste est dynamique... on enlève Toto mais le reste va etre réaffecté,
        // chaque valeur aura un index -1 puis que toto etait le tout premier index.
        System.out.println(prenoms); // Il faut que les elements qu'on veut afficher sont des caractères... ou peuvent être tostring-able

        // La méthode permettant de retourner la taille de la liste
        System.out.println(prenoms.size());

        // Parcourir avec la boucle for each
        for (String p : prenoms){
            System.out.println(p.toUpperCase());
        }

        // parcourir avec i
        for (int i = 0; i < prenoms.size();i++){
            System.out.println(prenoms.get(i));
        }

        // Parcourir avec. Quand on a besoin d'un tableau d'une taille fixe on prefaire faire un tableau. En terme d'espace mémoire c'est bp plus efficient. Mais
        // En général c'est bien plus agréable de le faire en array list car il est dynamique. Pas genant d'utiliser un arraylist 100% du temps.

    }
}
