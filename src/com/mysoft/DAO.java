package com.mysoft;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Игорь on 19.09.2016.
 */
public class DAO {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
    }

    public static List<Post> getPosts() throws SQLException, ClassNotFoundException {
        ArrayList<Post> posts;
        try (
                Connection c = getConnection();
                PreparedStatement ps = c.prepareStatement("SELECT id, txt FROM posts");
                ResultSet resultSet = ps.executeQuery();
        ) {
            posts = new ArrayList<Post>();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String txt = resultSet.getString(2);
                posts.add(new Post(id, txt));
            }
        }
        return posts;
    }

    public static void deletePost(int id) {
        try (
                Connection c = getConnection();
                PreparedStatement ps = c.prepareStatement("DELETE FROM posts WHERE id=?");
                ) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addPost(String txt) {
        try (
                Connection c = getConnection();
                PreparedStatement ps = c.prepareStatement("INSERT INTO posts (txt) VALUES (?)");
        ) {
            ps.setString(1, txt);
            ps.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
