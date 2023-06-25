package shop.db;

import java.io.*;
import java.util.Properties;

public class DataBaseProperties extends Properties {

    private static DataBaseProperties dbp;
    private DataBaseProperties(){}

    public static DataBaseProperties get(){
        if(dbp==null) {
            dbp = new DataBaseProperties();
            File file = new File("/Users/as.selezneva/repos/shop/src/main/resources/shopdb.properties");
            try {
                if (!file.exists()) {
                    file.createNewFile();
                    try (OutputStream output = new FileOutputStream(file)) {
                        Properties properties = new Properties();
                        properties.setProperty("url", "jdbc:mysql://localhost:3306/mysql");
                        properties.setProperty("username", "root");
                        properties.setProperty("password", "rootpass");
                        properties.store(output, null);
                    }
                }
                dbp.load(new FileInputStream(file));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return dbp;
    }
}