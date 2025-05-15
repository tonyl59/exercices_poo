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

    Entreprise entreprise1 = new Entreprise("intel","111 111 111 11111","12 Rue du Truc, 10000 Lala","www.entreprise1.com");
    Entreprise entreprise2 = new Entreprise("untel", "222 222 222 22222","18 Rue de la Chose, 11000 Lolo", "www.entreprise2.com");
    Entreprise entreprise3 = new Entreprise("ontel", "333 333 333 33333","24 Rue du Bidule, 25000 Lili", "www.entreprise2.com");

    System.out.println(entreprise1.getNom());

    AnnuaireEntreprise annuaire = new AnnuaireEntreprise();
    annuaire.ajout_entreprise(entreprise1);
    annuaire.ajout_entreprise(entreprise2);
    annuaire.ajout_entreprise(entreprise3);

    annuaire.voir_noms();

    annuaire.voir_infos_entreprises();



    iEntreprise info_entreprise;
    Scanner scanner = new Scanner(System.in);

    System.out.println("taper 1 pour du fr et 2 pour du en :");
    int choix = scanner.nextInt();
    if(choix == 1){
        message = new MessageV1();
    }else{
        message = new EnglishMessage();
    }
    }


}



/*
Boite<String> boite = new Boite();
        boite.setContenu("coucou");
        System.out.println(boite.getContenu());

Boite <Chat> boiteAChat = new Boite<>();
        boiteAChat.setContenu(new Chat(9,"toto"));
        System.out.println(boiteAChat.getContenu()); */
//List<String> prenoms = new ArrayList<>();