package org.example.demo04Interface;

public class ClasseDemo2 implements org.example.demo04Interface.DemoBaseInterface {
    @Override
    public int giveMeANumber() {
        return 999;
    }

    @Override
    public void direBonjour(String nom) {
        System.out.println("HEllo "+nom);
    }
}
