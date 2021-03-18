package Equipe02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainApp {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/miams_paradise?serverTimezone=UTC";
        String username = "root";
        String password = "root";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement statement = con.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from stock where idstock = 1");

            while (resultSet.next()) {
                System.out.println("id: " + resultSet.getInt("idstock"));
                System.out.println("nom: " + resultSet.getString("condiments"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}