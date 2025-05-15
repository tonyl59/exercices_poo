package exercices_classe.exoList;

import java.util.ArrayList;
import java.util.List;

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
    public void ajout_entreprise(Entreprise entreprise){
        liste_entreprises.add(entreprise);
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
