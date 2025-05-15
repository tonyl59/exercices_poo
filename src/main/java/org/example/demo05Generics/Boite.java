package org.example.demo05Generics;

public class Boite <T> { // <T> = type; le T est une convention
    private T contenu;

    public T getContenu() {
        return contenu;
    }

    public void setContenu(T contenu) {
        this.contenu = contenu;
    }
}
