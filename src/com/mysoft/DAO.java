package com.mysoft;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Игорь on 19.09.2016.
 */
public class DAO {

    public static List<Post> posts;

    static {
        posts = new ArrayList<Post>();
        posts.add(new Post(1, "Статья №1"));
        posts.add(new Post(2, "Статья №2"));
        posts.add(new Post(3, "Статья №3"));
        posts.add(new Post(4, "Статья №4"));
        posts.add(new Post(5, "Статья №5"));
    }

    public static List<Post> getPosts() {
        return posts;
    }

    public static void deletePost(int id) {
        for (Post p : posts) {
            if (p.id == id) {
                posts.remove(p);
            }
        }
    }
}
