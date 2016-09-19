package com.mysoft;

/**
 * Created by Игорь on 19.09.2016.
 */
public class Post {
    int id;
    String text;

    public Post() {
    }

    public Post(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
