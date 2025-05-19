package exercices_collection.TP_Papeterie_HashMap;

public class Ligne {

    // Attributs
    private ArticleUnitaire article;
    private int qte;

    // Constructeur

    public Ligne(ArticleUnitaire article, int qte) {
        this.article =  article;
        this.qte = qte;
    }


    // Setters & Getters

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = (ArticleUnitaire) article;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    // Méthodes

    /*public String info(){
        String info = Article.getHashArticle();
                //article.getHashArticle().get(this.getArticle().getRef_unique()); // this.getArticle.getRefunique represente la ref unique TODO ici j'utilise la ref unique pour appeler le nom d'article
    } */
    public String AfficheLigne(){
        return article.toString(); // String.format("%s - %s - %s - %s - %s",qte, article.getRef_unique(), article.getNom(), article.getPrix(),qte*article.getPrix());
        //TODO Faire une methode (info) qui va aggreger les .get.get.get puis finir la méthode facture
    }


}



/*
        if (article != null){
            return String.format("%s - %s - %s - %s - %s",qte, article.getRef_unique(), article.getNom(), article.getPrix(),qte*article.getPrix());
        }else{
            return String.format("%s - %s - %s - %s - %s",qte, lot.getRef_unique(), lot.getArticle(), lot.getArticle().getPrix(),qte*lot.getArticle().getPrix());
        }*/










