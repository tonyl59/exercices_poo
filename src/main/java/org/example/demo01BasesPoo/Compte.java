package org.example.demo01BasesPoo;

public class Compte {

    // Attributs
    private int code;
    protected float solde;

    // Constructeur

    public Compte(int code, float solde) {
        this.code = code;
        this.solde = solde;
    }

    // Methodes
    public void verser(float montant){
        solde += montant;
    }

    public void retirer(float montant){
        solde -= montant;
    }

    @Override
    public String toString(){
        return "Compte : " +
                "solde = " + this.solde +
                ", code = " + this.code + '.';

    }
}
