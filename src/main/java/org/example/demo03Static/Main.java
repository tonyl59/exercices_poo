package org.example.demo03Static;

public class Main {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Chien.getNombreChiens());
        System.out.println(Chien.getEspece()); // Je n'ai pas crée d'objets... et pourtant la méthode statique fonctionne

        Chien chien1 = new Chien("Rex", 5, "Labrador");
        Chien chien2 = new Chien("Poupette", 2, "PitBull");
        System.out.println(Chien.getNombreChiens()); // J'ai 2 chiens... parce que j'en ai crée au-dessus
        //chien1.getNombreChiens()... fonctionne pas car c'est une methode statique dans la classe Chien, mais ne s'applique pas sur un objet de type chien

        Chien.lesChiensPeuventVoler();
    }
}
