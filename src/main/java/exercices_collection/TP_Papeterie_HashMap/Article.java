package exercices_collection.TP_Papeterie_HashMap;

import java.util.HashMap;
import java.util.Map;

public abstract class Article {
    // Attribut
    private static String ref_unique;
    private static Map<String, Article> hashArticle = new HashMap<>();


    // Setter & Getter
    public String getRef_unique() {
        return ref_unique;
    }

    public void setRef_unique(String ref_unique) {
        Article.ref_unique = ref_unique;
    }

    public static Map<String, Article> getHashArticle() {
        return hashArticle;
    }

    public static void setHashArticle(Map<String, Article> hashArticle) {
        Article.hashArticle = hashArticle;
    }

}

