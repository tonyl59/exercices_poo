package org.example.demo01BasesPoo;

public class Main {
    public static void main(String[] args) {
        /*Compte c1 = new Compte(55, 56.2f);
        Compte c2 = new Compte(84, 45.6f);

        System.out.println("comptes avant versement et retrait : ");
        System.out.println(c1);
        System.out.println(c2);

        c1.retirer(100f);

        c2.verser(52f);

        System.out.println(c1.toString());
        System.out.println(c2.toString()); // le tostring est gris... ca veut dire qu'on peut faire sans

        Personne personne = new Personne();
        personne.setNom("toto");
        System.out.println(personne.getNom());

        Personne personne1 = new Personne();
        personne1.setNom("Cnoa");
        System.out.println(personne1.getNom());

        System.out.println(personne.getPrenom());

        System.out.println("age de la personne1 : "+personne1.age);
        personne1.age = 42;
        System.out.println("age de la personne1 : "+personne1.age);
        */
        // Personne personne1 = new Personne();
        Personne personne2 = new Personne(45, "toto","tata", 45);
        // On a ecrasé le constructeur par defaut... donc erreur
        System.out.println(personne2); // le sout me retourne un truc incomprehensible pour nous avant le getter.

    }

}