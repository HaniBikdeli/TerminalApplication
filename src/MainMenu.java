import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.exit;
import java.io.File;

public class MainMenu {
    public static void main(String[] args) {
        Login login = new Login();
        int numberOfTries = 0;
        login.login(numberOfTries);

        File dataFile = new File("C:\\ideaproject\\TerminalApplication\\src\\database.txt");
        if (dataFile.exists()){}else{
            System.out.println("Database does not exist!!!");
        }

    }
    static void menuInput(String @NotNull [] elements){
        for (String element : elements){
            System.out.println(element);
        }
    }
    static void mainMenu() {
        Add add = new Add();
        String[] elements = {
                "1. List",
                "2. Add",
                "3. Edit",
                "4. Delete",
                "5. Search",
                "6. Logout"
        };

        Scanner scanner = new Scanner(System.in);
        ListUsers list = new ListUsers();
        int menuOption;
        while (true){
            menuInput(elements);
            System.out.println("Choose your option from the menu above : ");
            menuOption = scanner.nextInt();
            if(menuOption>6 || menuOption<1)
                System.out.println("Enter a number from 1 to 6 \nTry again :");
            switch (menuOption) {
                case 1:
                    try {
                        list.listUsers();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        add.addUser();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 6: exit(0); break;
            }
        }
    }
}
