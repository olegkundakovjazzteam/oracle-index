import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by JazzTeamUser on 20.11.2015.
 */
public class TestCase {
    @BeforeClass
    public static void initClass() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private Connection connection;

    @Before
    public void init() {
        try {
            connection =
                    DriverManager.getConnection(
                            "jdbc:oracle:thin:@localhost:1521:xe", "system", "admin");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test() {

    }
}
