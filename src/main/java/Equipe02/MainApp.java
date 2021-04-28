package Equipe02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import Equipe02.dao.StockDao;
import Equipe02.models.Stock;

import Equipe02.dao.ReservationDao;
import Equipe02.models.Reservation;

import Equipe02.dao.LoginDao;
import Equipe02.models.Login;

public class MainApp {

    public static void main(String[] args) {
        // ActionEvent fenetrePrincipale = new ActionEvent();
        // fenetrePrincipale.frame.setVisible(true);

        String url = "jdbc:mysql://mysql-thomas-messina.alwaysdata.net:3306/thomas-messina_miamsparadise";
        String user = "194765";
        String password = "MiamSParadise";

        Stock stock = new Stock();
        // stock.setName("Test");

        System.out.println("Ajout stock: ");

        Scanner userinput = new Scanner(System.in);
        System.out.println("Condiment: ");
        stock.setName(userinput.nextLine());
        System.out.println("Validation du condiment: " + stock.getName());

        System.out.println("Utilitaire: ");
        stock.setUtilitaires(userinput.nextLine());
        System.out.println("Validation de l'utilitaire: " + stock.getUtilitaires());

        System.out.println("Quantité: ");
        stock.setQuantite(userinput.nextLine());
        System.out.println("Validation du stock: " + stock.getQuantite());

        Reservation reservation = new Reservation();
        System.out.println("Reservation: ");

        System.out.println("Date: ");
        reservation.setDate(userinput.nextLine());
        System.out.println("Validation de la date: " + reservation.getDate());

        System.out.println("Heure: ");
        reservation.setHeure(userinput.nextLine());
        System.out.println("Validation de l'utilitaire: " + reservation.getHeure());

        System.out.println("Nom du client: ");
        reservation.setNomClient(userinput.nextLine());
        System.out.println("Validation du nom du client: " + reservation.getNomClient());

        Login login = new Login();
        System.out.println("Register: ");

        System.out.println("Nom: ");
        login.setnomutilisateur(userinput.nextLine());
        System.out.println("Validation du nom: " + login.getnomutilisateur());

        System.out.println("Password: ");
        login.setpasswordutilisateur(userinput.nextLine());
        System.out.println("Validation du password: " + login.getpasswordutilisateur());

        System.out.println("Login: ");

        System.out.println("Nom: ");
        login.setnomutilisateur(userinput.nextLine());
        System.out.println("Validation du nom: " + login.getnomutilisateur());

        System.out.println("Password: ");
        login.setpasswordutilisateur(userinput.nextLine());
        System.out.println("Validation du password: " + login.getpasswordutilisateur());

        System.out.println("----SALLE----");
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement
                    .executeQuery("SELECT idtable, couvert FROM salle WHERE dispo NOT LIKE 'NON'");
            while (resultSet.next()) {
                System.out.println("Numero de table :" + resultSet.getInt("idtable"));
                System.out.println("Nombre de couverts :" + resultSet.getInt("couvert"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        userinput.close();

        StockDao stockDao = new StockDao(url, user, password);
        stockDao.saveStock(stock);

        ReservationDao reservationDao = new ReservationDao(url, user, password);
        reservationDao.saveReservation(reservation);

        LoginDao LoginDao = new LoginDao(url, user, password);
        LoginDao.saveLogin(login);
    }

}
