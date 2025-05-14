package exercices.exo22;

public class Main {
    public static void main(String[] args) {
        Film film1 = new Film("La Haine", "Mathieu Kassovitz", "1995-05-31", "Drama");
        Film film2 = new Film("Avatar 2", "James Cameron", "2022-12-14", "Action");
        System.out.println(film1.afficher());
        System.out.println(film2.afficher());

    }
}
