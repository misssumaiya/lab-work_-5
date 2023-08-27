package ProblemE8_26;

import java.util.Scanner;

public class LoginFormRunner {
    public static void main(String[] args) {

        LoginForm form = new LoginForm("misssumaiya95","rucse30");
        Scanner sc = new Scanner(System.in);

        while (!form.LoggedIn()){
            System.out.println("login form");

            System.out.println("enter user name: ");
            String userName = sc.next();
            form.input("username",userName);

            System.out.println("enter password: ");
            String password = sc.next();
            form.input("Password",password);

            form.click("Submit");

        }

        System.out.println("login successful");

        sc.close();
    }
}
