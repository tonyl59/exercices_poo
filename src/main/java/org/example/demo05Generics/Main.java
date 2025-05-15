package org.example.demo05Generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Boite boite = new Boite();
        //boite.setContenu("coucou");
        //System.out.println(boite.getContenu());


        // pb de ma boite c'est que je peux mettre que des chaines de caractères avant dans l'attribu Contenu. Donc je peux difficilement mettre un objet Chat avec. Le generic <T> qu'on vient de
        // mettre en remplaçant String va nous permettre de prendre les types dont j'ai aucune idée. Ca fait que j'ai une classe qui travaille avec tout type

        Boite <String> boite = new Boite();
        boite.setContenu("coucou");
        System.out.println(boite.getContenu());

        Boite <Chat> boiteAChat = new Boite<>();
        boiteAChat.setContenu(new Chat(9,"toto"));
        System.out.println(boiteAChat.getContenu());

        List<Chat> maListeDeChats = new ArrayList<>();// on voit le petit (i) en déroulé... "List" est une interface. On utilise l'interface pour cliquer sur Link et on prend l'objet Chat.
        // 99% du temps on utilise new arraylist. On peut pas mettre de primitifs dans les generiques. Les generics c'est pour REMPLACER UNE CLASSE.


    }
}
