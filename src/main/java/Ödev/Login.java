package Ödev;

/**
 * Created by Hasan on 25.04.2017.
 */
public class Login {
    String userName = "Hasan";
    int password = 12345;

    public  boolean UserNamePassword(String userName, int pass)
    {
        if(this.userName.equals(userName) && this.password == pass)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}