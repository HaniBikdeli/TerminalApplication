import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Add {
    public static void addUser() throws IOException {
        Scanner scanner = new Scanner(System.in);
        FileWriter writer = new FileWriter("C:\\ideaproject\\TerminalApplication\\src\\database.txt" ,true);
        BufferedWriter nextLine = new BufferedWriter(writer);
        System.out.println("In order to add user credentials ,");

        String addUsername;
        System.out.println("Enter Username : ");
        addUsername = scanner.nextLine();

        String addPassword;
        System.out.println("Enter Password :");
        addPassword = scanner.nextLine();
        if (addPassword.length() < 4) {
            System.out.println("Your password must have at least 4 characters \n Try again :");
            addPassword = scanner.nextLine();
        }

        int addAge;
        System.out.println("Enter Age : ");
        addAge = scanner.nextInt();

        nextLine.newLine();
        writer.write(addUsername + " | " + addPassword + " | " + addAge);
        writer.close();
        }
    }


