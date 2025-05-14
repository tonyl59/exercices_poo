package org.example.demo03Static;

public class Chien {

    // Attributs de classes
    private String nom;
    private int age;
    private String race;

    // Attributs de classes (static)
    private static String espece = "Canis Lupus Familiaris";
    private static int nombreChiens = 0;

    // constructeur
    public Chien(String nom, int age, String race){
        this.nom = nom;
        this.age = age;
        this.race = race;
        nombreChiens++; // Chien.nombreChiens++;
    }

    public static String getEspece() { // on remarque que les getter setter sont en static pour attributs statics
        return espece;
    }

    public static void setEspece(String espece) {
        Chien.espece = espece;
    }

    public static int getNombreChiens() {
        return nombreChiens;
    }

    public static void setNombreChiens(int nombreChiens) {
        Chien.nombreChiens = nombreChiens;
    }

    public static void lesChiensPeuventVoler(){
        System.out.println("Les chiens ne peuvent pas voler.");
    }

    @Override
    public String toString(){
        return "Chien " +
                "nom =" + nom +
                ", race = '" + race +
                ", age = " + age +
                ".";
    }
}
