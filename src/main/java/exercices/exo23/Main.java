package exercices.exo23;

public class Main {
    public static void main(String[] args) {
        Joueur hero = new Joueur("Jacques",1,85);

        hero.UneQuete();
        hero.niveausup();
        System.out.println(hero); // passe de 85 à 95 points d'expérience, ne peut toujours pas gagner de niveau

        hero.UneQuete();
        hero.niveausup();
        System.out.println(hero); // passe de 95 à 105 points d'expérience, a gagné un niveau, les pts d'exp sont à 5.

        hero.chgmt_nom("Pierre");
        System.out.println(hero);
    }
}
