package Equipe02;

import java.util.Scanner;

import Equipe02.dao.StockDao;
import Equipe02.models.Stock;

public class MainApp {

    public static void main(String[] args) {

        String url = "jdbc:mysql://mysql-thomas-messina.alwaysdata.net:3306/thomas-messina_miamsparadise";
        String user = "194765";
        String password = "MiamSParadise";

        Stock stock = new Stock();
        // stock.setName("Test");

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

        userinput.close();

        StockDao stockDao = new StockDao(url, user, password);
        stockDao.saveStock(stock);
    }

}
