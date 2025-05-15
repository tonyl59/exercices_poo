package org.example.demo04Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        ClasseDemo classeDemo = new ClasseDemo();
//        ClasseDemo2 classeDemo2 = new ClasseDemo2();
//
//       // ClasseDemo2[] classesDemos = { classeDemo , classeDemo2};
//        DemoBaseInterface[] demoBaseInterfaces = { classeDemo2, classeDemo};
        IMessage message;
        Scanner scanner = new Scanner(System.in);

        System.out.println("taper 1 pour du fr et 2 pour du en :");
        int choix = scanner.nextInt();
        if(choix == 1){
            message = new MessageV1();
        } else{
            message = new EnglishMessage();
        }


        message.okMessage();
        message.warningMessage();
        message.errorMessage();



    }
}
