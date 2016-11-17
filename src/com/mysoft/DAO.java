package com.mysoft;

import java.sql.*;

public class DAO {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
    }

    public static Post getPosts() throws SQLException, ClassNotFoundException {
        Post post;
        try (
                Connection c = getConnection();
                PreparedStatement ps = c.prepareStatement("SELECT id, txt FROM posts ORDER BY id DESC LIMIT 1");
                ResultSet resultSet = ps.executeQuery();
        ) {
            resultSet.next();
            post = new Post(resultSet.getInt(1), resultSet.getString(2));
        }
        return post;
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
