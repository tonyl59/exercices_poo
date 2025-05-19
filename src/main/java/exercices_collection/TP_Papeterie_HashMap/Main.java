package exercices_collection.TP_Papeterie_HashMap;

public class Main {
    public static void main(String[] args) {
        Stylo stylo1 = new Stylo("bic", 0.5, "bleu");
        System.out.println(stylo1);
        Stylo stylo2 = new Stylo("superbic", 0.7, "jaune");
        System.out.println(stylo2);
        Ramette ramette1 = new Ramette("A4", 0.1, 120);
        System.out.println(ramette1);
        Lot lot1 = new Lot(stylo2, 10,10 );
        System.out.println(lot1);
        Ramette ramette2 = new Ramette("A3", 0.2, 110);
        System.out.println(ramette2);

        System.out.println("Catalogue des article: " +Article.getHashArticle());
        //Ligne ligne = new Ligne(stylo1,5);
        //System.out.println(ligne.AfficheLigne());


        // Test abstract
        /*
        Article article = new Article(reference:"toto"; // Je veux eviter d'instancer les classes Article & Article unitaire, ca sera plutot lot, ramette & stylo... Abstract va me permettre d'empecher de creer article et articleunitaire directement.
                                                          // Faudra override les methodes abstracts declaré dans article, par exemple depuis Ramette override je lance une methode existante dans Article*/

    }


}
