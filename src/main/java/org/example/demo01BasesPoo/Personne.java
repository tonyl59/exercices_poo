package org.example.demo01BasesPoo;

public class Personne {

    // Les Attributs
    private int code = 10;
    private String nom = "toto";
    private String prenom = "tata";
    public int age = 15;

    // Constructeurs

    public Personne(int code, String nom, String prenom, int age) {
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }


    // 2e forme du constructeur , il est polymorphe (plusieurs forme)
    public Personne(){

    }

    // 3e forme du cosntructeur
    public Personne( String nom, String prenom, int age) {
        this.code = 999;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }


    // Les Méthodes
    public void setNom(String nom){
        if (nom.toLowerCase().startsWith("c")){
            System.out.println("Les prénoms commençant par c ne sont pas acceptés !!");
        }else{
            this.nom = nom;
        }
    }

    public String getNom(){
        return nom;
    }

    public String getPrenom(){
        return prenom;
    }
    @Override
    public String toString() {
        return "Personne{" +
                "code=" + code +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                '}';
    }

}



