package exercices.exo27;

public class Main {
    public static void main(String[] args) {
        Plante plante1 = new Plante("herbe",3,"vert");
        Arbre plante2= new Arbre("pommier",3,"marron", 0.11);

        System.out.println(plante1.affichage_info());
        System.out.println(plante2.affichage_info());


    }

}
