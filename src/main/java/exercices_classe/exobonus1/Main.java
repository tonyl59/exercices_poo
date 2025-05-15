package exercices_classe.exobonus1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pendu mot1 = new Pendu(10, "bonjour");
        //System.out.println(mot1.TestChar('a'));
        Object [] test1 = mot1.TestChar('b');
        System.out.println(Arrays.toString(test1));
        //mot1.TestWin();

    }
}
