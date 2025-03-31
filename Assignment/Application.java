package Assignment;

import Assignment.control.*;

public class Application {
    Thread t1;
    Thread t2;

    public static void main(String[] args) {
        Login loginForm = new Login();
        loginForm.setVisible(true);
    }
}
