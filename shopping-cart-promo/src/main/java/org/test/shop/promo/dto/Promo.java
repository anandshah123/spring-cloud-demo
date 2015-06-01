package org.test.shop.promo.dto;

/**
 * Created by anand.shah on 6/1/2015.
 */
public class Promo {
    private String id;
    private String content;
    private int star;
    private long likes;

    @Override
    public String toString() {
        return "Promo{" +
                "id='" + id + '\'' +
                ", content='" + content + '\'' +
                ", star=" + star +
                ", likes=" + likes +
                '}';
    }

    public Promo(String id, String content, int star, long likes) {
        this.id = id;
        this.content = content;
        this.star = star;
        this.likes = likes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public long getLikes() {
        return likes;
    }

    public void setLikes(long likes) {
        this.likes = likes;
    }
}
