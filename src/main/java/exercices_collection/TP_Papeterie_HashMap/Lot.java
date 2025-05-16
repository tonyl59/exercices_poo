package exercices_collection.TP_Papeterie_HashMap;

public class Lot extends Article {

    private ArticleUnitaire article;
    private int qte;
    private double remise;

    public Lot(int ref_unique,ArticleUnitaire article, int qte, double remise) {
        super();
        this.article = article;
        this.qte = qte;
        this.remise = remise;
        getHashArticle().put(getRef_unique(), getArticle().getNom()); // ref_unique & nom de l'article unitaire
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
}
