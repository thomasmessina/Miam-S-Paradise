package Equipe02.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Equipe02.models.Login;

public class LoginDao {

    private String url;
    private String username;
    private String password;

    public LoginDao(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public void saveLogin(Login login) {
        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            if (login.getIdlogin() != null) {
                PreparedStatement statement = connection.prepareStatement(
                        "update utilisateur set nom_utilisateur = ? AND password_utilisateur = ? where id = ?;");

                statement.setString(1, login.getnomutilisateur());
                statement.setString(2, login.getpasswordutilisateur());
                statement.setLong(3, login.getIdlogin());

                statement.execute();
            } else {
                PreparedStatement statement = connection.prepareStatement(
                        "insert into utilisateur (nom_utilisateur, password_utilisateur) values (?, ?);");
                statement.setString(1, login.getnomutilisateur());
                statement.setString(2, login.getpasswordutilisateur());
                statement.execute();
            }

            System.out.println(login.getIdlogin() + "saved into database");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Y a une erreur LOL");
        }
    }

    public Login getUtilisateurById(Long idutilisateur) {
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement statement = connection
                    .prepareStatement("select * from utilisateur where idutilisateur = ?");
            statement.setLong(1, idutilisateur);

            ResultSet resultSet = statement.executeQuery();

            Login login = new Login();

            while (resultSet.next()) {
                login.setIdlogin(resultSet.getLong("idutilisateur"));
                login.setnomutilisateur(resultSet.getString("nom_utilisateur"));
                login.setpasswordutilisateur(resultSet.getString("password_utilisateur"));
            }
            return login;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
}