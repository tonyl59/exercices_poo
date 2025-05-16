package exercices_collection.TP_Papeterie_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Article {
    // Attribut
    private int ref_unique;
    private Map<Integer, String> hashArticle = new HashMap<>();


    // Constructeur
    public Article() {
        this.ref_unique++;
    };

    // Setter & Getter
    public int getRef_unique() {
        return ref_unique;
    }

    public void setRef_unique(int ref_unique) {
        this.ref_unique = ref_unique;
    }

    public Map<Integer, String> getHashArticle() {
        return hashArticle;
    }

    public void setHashArticle(Map<Integer, String> hashArticle) {
        this.hashArticle = hashArticle;
    }
}

