package exercices_classe.exobonus1;

import java.util.Scanner;

public class Pendu {
    // Attributs
    private String masque;
    private int nb_essais;
    private String mot_cible;

    public Pendu(int nb_essais, String mot_cible) {
        this.nb_essais = nb_essais;
        this.mot_cible = mot_cible;

        this.masque = "*".repeat(mot_cible.length());
    }

    public Pendu(String mot_cible) {
        this.nb_essais = 10;
        this.mot_cible = mot_cible;

        this.masque = "*".repeat(mot_cible.length());
    }

    // Setters & Getters

    public String getMasque() {
        return masque;
    }

    public void setMasque(String masque) {
        this.masque = masque;
    }

    public String getMot_cible() {
        return mot_cible;
    }

    public void setMot_cible(String mot_cible) {
        this.mot_cible = mot_cible;
    }

    public int getNb_essais() {
        return nb_essais;
    }

    public void setNb_essais(int nb_essais) {
        this.nb_essais = nb_essais;
    }

    // Méthodes
    public Object[] TestChar(char lettre) {
        Object[] results = new Object[mot_cible.length() + 1];

        for (int i = 0; i < mot_cible.length(); i++) {
            if (lettre == mot_cible.charAt(i)) {
                ;
                results[0] = true;
                results[1] = i;
                // dès qu'elle est trouvé une fois, on alerte qu'elle est incluse
            }
        }
        if ((boolean) results[0]){
            System.out.printf("La lettre %s est incluse dans le mot\n", lettre);
        }else{
            System.out.printf("La lettre %s n'est pas incluse dans le mot\n", lettre);
            results[0] = false;
        };
        return results;
    }


    public String TestWin() {
        String demasque = masque;
        Scanner scanner = new Scanner(System.in);
        this.TestChar('a');
        for (int i = 0; i < nb_essais; i++) {
            System.out.println("Saisir une lettre (si la saisie est supérieur à un caractère, ne prends en compte que la première lettre)");
            char lettre = scanner.next().charAt(0);
            /*if (this.TestChar(lettre)[0]==true{
                demasque = demasque.replace('*', lettre);
                System.out.println(demasque);


            }else{
                nb_essais -=1;
                System.out.printf("Lettre erronée");
        } */
        }
        return "bonjour";
    }
}


