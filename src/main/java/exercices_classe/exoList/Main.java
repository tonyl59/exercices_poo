package exercices_classe.exoList;

import org.example.demo04Interface.EnglishMessage;
import org.example.demo04Interface.IMessage;
import org.example.demo04Interface.MessageV1;
import org.example.demo05Generics.Boite;
import org.example.demo05Generics.Chat;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

    /*
        Exercice Annuaire Entreprise :
        Creer une application qui permet d'enregistrer des entrepises
        puis d'afficher leurs informations.
        Une entreprise sera constitué au moins de :
        - Un nom
        - Un numero de siret
        - Une Adresse
        - Un site web
        On creera une classe Annuaire entreprise qui contiendra au moins :
        - Une liste d'entreprises
        Cette classe (Annuaire entreprise) permettra de :
        - Ajouter une entreprise
        - Voir toutes les entrprises (juste leur nom)
        - Voir les details d'une entrprise (toutes les infos d'une entreprise)
        On testera ces classes dans notre programme principal.
        Bonus :
        - Une classe IHM (Interface Homme Machine)
        qui contiendra un menu du type :
            Bienvenue sur l'annuaire d'entreprise :
                - 1) Ajouter une entreprise
                - 2) Voir toutes les entreprises (leurs noms)
                - 3) Voir les details d'une entreprise
                - 4) Quitter
         */


    AnnuaireEntreprise annuaire = new AnnuaireEntreprise();
    annuaire.ajout_entreprise("intel","111 111 111 11111","12 Rue du Truc, 10000 Lala","www.entreprise1.com");
    annuaire.ajout_entreprise("untel", "222 222 222 22222","18 Rue de la Chose, 11000 Lolo", "www.entreprise2.com");
    annuaire.ajout_entreprise("ontel", "333 333 333 33333","24 Rue du Bidule, 25000 Lili", "www.entreprise3.com");

    annuaire.voir_noms();

    annuaire.voir_infos_entreprises();

        System.out.println("Bienvenue sur l'annuaire d'entreprise");
        Scanner scanner = new Scanner(System.in);
        int choix = 0;
        while (choix != 4){
            System.out.println("""
        - 1) Ajouter une entreprise
        - 2) Voir tout les noms d'entreprises
        - 3) Voir le détail de toutes les entreprises
        - 4) quitter
Veuillez saisir un chiffre entre 1 à 4
    """);
            choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    annuaire.ajout_entreprise_interface();
                    break;
                case 2:
                    annuaire.voir_noms();
                    break;
                case 3:
                    annuaire.voir_infos_entreprises();
                    break;
                default:
                    System.out.println("Sortie de l'interface, bonne journée à vous");
                    break;
        };
        }
    }
}

