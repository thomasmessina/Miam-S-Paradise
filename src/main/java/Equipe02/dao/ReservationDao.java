package Equipe02.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Equipe02.models.Reservation;

public class ReservationDao {

    private String url;
    private String username;
    private String password;

    public ReservationDao(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public void saveReservation(Reservation reservation) {
        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            if (reservation.getIdreservation() != null) {
                PreparedStatement statement = connection.prepareStatement(
                        "update reservation set date = ? AND heure = ? AND nom_client = ? AND table_idtable = ? where id = ?;");

                statement.setString(1, reservation.getDate());
                statement.setString(2, reservation.getHeure());
                statement.setString(3, reservation.getNomClient());
                statement.setLong(4, reservation.getIdtable());
                statement.setLong(5, reservation.getIdreservation());

                statement.execute();
            } else {
                PreparedStatement statement = connection
                        .prepareStatement("insert into reservation (date, heure, nom_client) values (?, ?, ?);");
                statement.setString(1, reservation.getDate());
                statement.setString(2, reservation.getHeure());
                statement.setString(3, reservation.getNomClient());
                statement.execute();
            }

            System.out.println(reservation.getIdreservation() + "saved into database");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Y a une erreur LOL");
        }
    }

    public Reservation getReservationById(Long idreservation) {
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement statement = connection
                    .prepareStatement("select * from reservation where idreservation = ?");
            statement.setLong(1, idreservation);

            ResultSet resultSet = statement.executeQuery();

            Reservation reservation = new Reservation();

            while (resultSet.next()) {
                reservation.setIdreservation(resultSet.getLong("idreservation"));
                reservation.setDate(resultSet.getString("date"));
                reservation.setHeure(resultSet.getString("heure"));
                reservation.setNomClient(resultSet.getString("nom_client"));
                reservation.setIdtable(resultSet.getLong("table_idtable"));
            }
            return reservation;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
}
