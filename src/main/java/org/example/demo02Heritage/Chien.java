package org.example.demo02Heritage;

public class Chien extends Canide{

    public String race;

    public Chien(int age, String nom, String race) {
        super(age, nom);  // Lié à la classe parent Canide. Super prend son heritage
        this.race = race; // La race est propre à la classe chien
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override // l'option existe dans Canide, mais le chien en particulier va abboyer
    public void crier(){
        super.crier();
        System.out.println("Le chien aboie !!!");
    }

    @Override
    public String toString(){
        return super.toString() + " est un chien de race "+this.race;
    }

}
