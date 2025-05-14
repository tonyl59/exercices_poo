package exercices.exo22;

public class Film {

    //Attributs
    private String titre;
    private String realisateur;
    private String sortie;
    private String genre;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public String getSortie() {
        return sortie;
    }

    public void setSortie(String sortie) {
        this.sortie = sortie;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Film(String titre, String realisateur, String sortie, String genre) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.sortie = sortie;
        this.genre = genre;
    }

    public String afficher(){
        return String.format("Film{titre='%s', realisateur='%s', dateSortie=%s, genre='%s'}",titre ,realisateur, sortie, genre);


    }
}
