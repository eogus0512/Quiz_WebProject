package util;
import java.sql.Connection;
import java.sql.DriverManager;

public class databaseUtil {

    public static Connection getConnection() {
        try{
            String dbURL = "jdbc:mysql://203.152.163.65:3306/quiz";
            String dbID = "webProj";
            String dbPassword = "quizgame123";
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(dbURL, dbID, dbPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}