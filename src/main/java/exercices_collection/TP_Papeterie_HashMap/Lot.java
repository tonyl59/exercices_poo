package exercices_collection.TP_Papeterie_HashMap;

public class Lot extends Article {

    private ArticleUnitaire article;
    private int qte;
    private double remise;
    private static int compte_lot;

    public Lot(ArticleUnitaire article, int qte, double remise) {
        super();
        compte_lot ++;
        this.setRef_unique("LO"+compte_lot);
        this.article = article;
        this.qte = qte;
        this.remise = remise;

        getHashArticle().put(getRef_unique(), this); // ref_unique & nom de l'article unitaire
    }

    public ArticleUnitaire getArticle() {
        return article;
    }

    public void setArticle(ArticleUnitaire article) {
        this.article = article;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    //Méthodes


    @Override
    public String toString() {
        return "Lot{" +
                "ref_unique='" + getRef_unique() +
                "', article='" + article +
                "', qte=" + qte +
                ", remise=" + remise +
                "%}";
    }
}
