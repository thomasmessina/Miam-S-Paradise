package Equipe02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainApp {
    public static void main(String[] args) {
        String url = "jdbc:mysql://mysql-thomas-messina.alwaysdata.net:3306/thomas-messina_miamsparadise";
        String username = "194765";
        String password = "MiamSParadise";
        
        ActionEvent fenetrePrincipale = new ActionEvent();
		fenetrePrincipale.frame.setVisible(true);

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement statement = con.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from utilisateur where idutilisateur = 0");
            
            while (resultSet.next()) {
                System.out.println("id: " + resultSet.getInt("idutilisateur"));
                System.out.println("nom: " + resultSet.getString("nom_utilisateur"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}