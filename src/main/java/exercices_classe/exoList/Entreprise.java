package exercices_classe.exoList;

public class Entreprise {

    /*private String nom;
    private String n_siret;
    private String adresse;
    private String site;*/

    public String nom;
    public String n_siret;
    public String adresse;
    public String site;

    public Entreprise(String nom, String n_siret, String adresse, String site) {
        this.nom = nom;
        this.n_siret = n_siret;
        this.adresse = adresse;
        this.site = site;
    }

    //méthodes

    @Override
    public String toString() {
        return String.format("%s{Numéro de siret: %s, Adresse: %s, Site internet : %s}", nom, n_siret, adresse, site);
    }



    //setters & getters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getN_siret() {
        return n_siret;
    }

    public void setN_siret(String n_siret) {
        this.n_siret = n_siret;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
}
