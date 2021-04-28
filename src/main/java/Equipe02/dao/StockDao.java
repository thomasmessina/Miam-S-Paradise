package Equipe02.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Equipe02.models.Stock;

public class StockDao {

    private String url;
    private String username;
    private String password;

    public StockDao(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public void saveStock(Stock stock) {
        try {
            Connection connection = DriverManager.getConnection(url, username, password);

            if (stock.getId() != null) {
                PreparedStatement statement = connection
                        .prepareStatement("update stock set name = ? AND utilitaires = ? AND number = ? where id = ?;");

                statement.setString(1, stock.getName());
                statement.setString(2, stock.getUtilitaires());
                statement.setString(3, stock.getQuantite());
                statement.setLong(4, stock.getId());

                statement.execute();
            } else {
                PreparedStatement statement = connection
                        .prepareStatement("insert into stock (condiments, quantite, utilitaires) values (?, ?, ?);");
                statement.setString(1, stock.getName());
                statement.setString(2, stock.getQuantite());
                statement.setString(3, stock.getUtilitaires());
                statement.execute();
            }

            System.out.println(stock.getName() + "saved into database");

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Y a une erreur LOL");
        }
    }

    public Stock getStockById(Long id) {
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            PreparedStatement statement = connection.prepareStatement("select * from stock where idstock = ?");
            statement.setLong(1, id);

            ResultSet resultSet = statement.executeQuery();

            Stock stock = new Stock();

            while (resultSet.next()) {
                stock.setId(resultSet.getLong("idstock"));
                stock.setName(resultSet.getString("condiments"));
                stock.setUtilitaires(resultSet.getString("utilitaires"));
                stock.setQuantite(resultSet.getString("quantite"));
            }
            return stock;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
}
