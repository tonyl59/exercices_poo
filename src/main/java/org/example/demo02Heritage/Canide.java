package org.example.demo02Heritage;

public class Canide {
    protected int age; // accessible librement dans les classes enfants
    protected String nom; // le private peut pas être accédé hors de la classe, le protected pareil mais peut l'être par heritage.

    public Canide(int age, String nom){
        this.age = age;
        this.nom = nom;
    }

    public void crier(){
        System.out.println("cri du canidé !!!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString(){
        return "Canide de nom : "+this.nom+" et d'âge : "+this.age;
    }
}
