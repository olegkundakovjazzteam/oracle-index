import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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

    @Before
    public void init() {

    }

    @Test
    public void test() {

    }
}
