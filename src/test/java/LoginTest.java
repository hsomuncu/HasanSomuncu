import org.junit.Test;
import Ödev.Login;

import static org.junit.Assert.assertTrue;
/**
 * Created by Hasan on 25.04.2017.
 */
public class LoginTest {

    @Test
    public void GirilenDeger() {
        final Login login = new Login();
        boolean response = new Login().UserNamePassword("Hasan", 12345);
        assertTrue(response == true);
        System.out.println("Login Successful");

    }
}