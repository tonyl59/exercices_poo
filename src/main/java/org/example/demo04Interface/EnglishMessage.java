package org.example.demo04Interface;

public class EnglishMessage implements IMessage{
    @Override
    public void okMessage() {
        System.out.println("This is OK");
    }

    @Override
    public void warningMessage() {
        System.out.println("This is a warning");
    }

    @Override
    public void errorMessage() {
        System.out.println("We have a problem !!!");
    }


}
