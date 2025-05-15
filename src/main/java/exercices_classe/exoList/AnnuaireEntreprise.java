package exercices_classe.exoList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnnuaireEntreprise {
    // Attribut
    private List<Entreprise> liste_entreprises;

    // Constructeur
    public AnnuaireEntreprise(List<Entreprise> liste_entreprises) {
        this.liste_entreprises = liste_entreprises;
    }
    public AnnuaireEntreprise() {
        liste_entreprises = new ArrayList<>();
    }


    // Méthodes
    public void ajout_entreprise(String nom, String nb_siret, String adresse, String site){
        Scanner scanner = new Scanner(System.in);
        Entreprise entreprise = new Entreprise(nom, nb_siret, adresse, site);
        this.liste_entreprises.add(entreprise);
    }
    public void ajout_entreprise_interface(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le nom de l'entreprise");
        String nom = scanner.nextLine();
        System.out.println("Veuillez saisir le numéro de siret");
        String nb_siret = scanner.nextLine();
        System.out.println("Veuillez saisir l'adresse");
        String adresse = scanner.nextLine();
        System.out.println("Veuillez saisir le site");
        String site = scanner.nextLine();
        Entreprise entreprise = new Entreprise(nom, nb_siret, adresse, site);
        this.liste_entreprises.add(entreprise);
    }

    public void voir_noms(){
        System.out.println("Liste d'entreprises :");
        for (Entreprise nom_entreprise  : liste_entreprises){
            System.out.println(nom_entreprise.getNom());
        }
    }

    public void voir_infos_entreprises(){
        for (Entreprise entreprise : liste_entreprises){
            System.out.println(entreprise);
        }
    }

    // Setters & Getters

    public List<Entreprise> getListe_entreprises() {
        return liste_entreprises;
    }

    public void setListe_entreprises(List<Entreprise> liste_entreprises) {
        this.liste_entreprises = liste_entreprises;
    }

}
