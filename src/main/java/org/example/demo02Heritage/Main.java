package org.example.demo02Heritage;

public class Main {
    public static void main(String[] args) {

        Chien chien = new Chien(7, "Rex","labrador");
        Chien chien1 = new Chien(7, "Rax","labrador");
        chien.crier(); // Chien herite de l'action crier de Canide et aussi son cri en plus. L'override avec le code du cri de chien prend le dessus
        Hyene hyene = new Hyene(12,"tata");
        Hyene hyene1 = new Hyene(12,"toto");
        hyene.crier(); // Hyene herite de l'action crier de Canide, mais comparé à Chien y'a pas d'override.

        System.out.println(chien);
        System.out.println(hyene);

        Chien[] chiens = {chien, chien1}; // on peut pas mettre l'objet de type Hyene dessus
        Hyene[] hyenes = {hyene, hyene1}; // on peutp as mettre l'objet de type Chien dessus
        Canide[] canides = {chien, hyene, chien1, hyene}; // On peut mettre les deux vu que canides est la classe parent

        Object[] test_enfants = {chien, hyene};

        for (Canide canide : canides){ // Objet canide, chaque elements s'appelle canide, on parcours la liste canides
            System.out.println("#----------------------#");
            System.out.println(canide);
            System.out.println("#----------------------#");
            if (canide instanceof Chien){
                Chien chien2 = (Chien) canide;
                System.out.println("il s'agit d'un chien !!!");
                canide.crier();// instance permet de savoir si je suis dans le bon type
            }
            System.out.println("#-----------------------#");
        }
        System.out.println(hyene1.getClass().getSimpleName());

    }
}
