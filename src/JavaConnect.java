


import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ravir
 */
public class JavaConnect {

//    private static final String DB_NAME = "attendencesystem";
//    private static final String DB_URL = "jdbc:mysql://localhost:3306/";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "7530";

    public static Connection ConnectDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms",DB_USERNAME,DB_PASSWORD);
//            System.out.println("hiii" + con);
            return con;
        }catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}