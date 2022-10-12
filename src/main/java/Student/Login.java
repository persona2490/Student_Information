/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author wangsiyi
 */
public class Login {

    private static Scanner sc = new Scanner(System.in);
    private static HashSet<User> set = new HashSet<>();
    boolean state = true;

    public boolean AddUser() {
        while (state) {
            System.out.println("Press 1: Sign in ");
            System.out.println("Press 2: Log in");
            System.out.println("Press 3; Exit");
            String i = sc.next();
            switch (i) {
                case "1":
                    UserRegister();
                    break;
                case "2":
                    UserLog();
                    break;
                case "3":
                    System.out.println("Exiting, please waiting ....");
                    System.out.println("Successfully exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Not the function you choose");
                    break;

            }

        }
        return false;

    }

    private void UserRegister() {// create the account
        boolean sr = false;
        System.out.println("Here is Register");
        System.out.println("Please enter your username");
        String username = sc.next();
        System.out.println("Please enter your password");
        String password = sc.next();
        sr = set.add(new User(username, password));
        if (!sr) {
            System.out.println("Your username have exsisted, please enter again");

        } else {
            System.out.println("Regiser Successfully");

        }
        operation();//if finish creating, the go to the login function
    }

    private boolean UserLog() { // let log in
        System.out.println("Welcome to login our system");

        while (true) {
            System.out.println("Enter your username");
            String LogUsername = sc.next();
            System.out.println("Enter your password");
            String LogPassword = sc.next();
            User user = new User(LogUsername, LogPassword);
            boolean sr = set.contains(user);
            if (!sr) {//if username does not exist then go to the register function to create account
                System.out.println("Username not exist! , Please register first.");
                operation();
                
            } else {
                Iterator<User> iterator = set.iterator();
                while (iterator.hasNext()) {
                    User MatchUser = iterator.next();

                    if (MatchUser.getUsername().equals(LogUsername) && MatchUser.getUserpassword().equals(LogPassword)) {
                        System.out.println("Login Successfully, Hello,  " + LogUsername + " Welcome to use our Information System");
                        state = false;
                        return false;
                    }
                }
                System.out.println("Wrong Password, Log fail");

            }

        }

    }

    private void operation() {// User could choose leave or continue to login or re
        System.out.println("Do you want to continue ? Press 1 Login, 2 Register ,3 exit");
        String Continue = sc.next();
        if (Continue.equals("1")) {
            UserLog();

        } else if (Continue.equals("2")) {
            UserRegister();
        } else if (Continue.equals("3")) {
            System.out.println("Successfully Exit");
            System.exit(0);
        } else {
            System.out.println("No this fuction, please enter again");
            
        }

    }

}
