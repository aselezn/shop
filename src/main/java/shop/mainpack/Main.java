package shop.mainpack;

import shop.db.DataBaseConnector;
import shop.gui.ShopApp;

import javax.swing.*;
import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

//        DataBaseConnector connector = new DataBaseConnector();
//        connector.connect();
//        Connection connection = connector.getConnection();


//      1. Вывести коллекцию продуктов
//        List<Product> products = Repository.findAllProducts(connection);
//        products.forEach(System.out::println);

//      2. Вывести наименование товаров, по id заказа (если цвет есть - выводим, если нет - не выводим (проверить на id=1))
//        List<String> products_2 = Repository.findProductsWithByOrderId(connection,1);
//        products_2.forEach(System.out::println);

//      3. Регистрация заказа
//        String customerFullName = "John Doe";
//        String phone = "123456789";
//        String email = "john.doe@example.com";
//        String customerAddress = "123 Main Street";
//        List<String> productIds = Arrays.asList("3251615", "3251616", "3251617");
//        List<Integer> quantities = Arrays.asList(2, 1, 3);
//
//        Repository.registerOrder(connection, customerFullName, phone, email, customerAddress, productIds, quantities);
//
//        System.out.println("Order registered successfully.");

//        4. GUI. В папке реусросов есть скрипт по созданию моей БД, а так же файл с пропертями для подключения к БД
        SwingUtilities.invokeLater(() -> new ShopApp().shopApp());



    }
}