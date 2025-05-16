package exercices_collection.TP_Papeterie_HashMap;

public class Facture {

    // Attributs
    private String client;
    //private Ligne ligne;
    private int num_facture;
    private String date;
    private String qte_achat;

    // Constructeurs
    public Facture(String client, String qte_achat, String date) {
        this.client = client;
        this.num_facture ++;
        this.qte_achat = qte_achat;
        this.date = date;
    }

    // Méthodes
    public void ajouter_ligne(int ref_unique, int qte_article){

    }

    public double getPrixTotal(){
            ;   //
        return 0;
    }







    // Setters & Getters
    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public int getNum_facture() {
        return num_facture;
    }

    public void setNum_facture(int num_facture) {
        this.num_facture = num_facture;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getQte_achat() {
        return qte_achat;
    }

    public void setQte_achat(String qte_achat) {
        this.qte_achat = qte_achat;
    }
}
