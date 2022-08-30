import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import static java.lang.System.exit;

public class MainMenu {
    static File dataFile = new File("C:\\ideaproject\\TerminalApplication\\src\\database.txt");
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int numberOfTries = 0;
        Login login = new Login();
        login.login(numberOfTries);
        mainMenu();
        File dataFile = new File("C:\\ideaproject\\TerminalApplication\\src\\database.txt");
        if (dataFile.exists()){}else{
            System.out.println("Database does not exist!!!");
        }

    }
    static void menuInput(String[] elements){
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
        ReadData reader = new ReadData();
        Reader r = new Reader() {
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                return 0;
            }

            @Override
            public void close() throws IOException {

            }
        };
        BufferedReader br = new BufferedReader(r);
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
                case 4:
                    String userFind = input.nextLine();
                    try {
                        reader.deleteLine(br , dataFile ,userFind);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    try {
                        reader.readLine();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                case 6: exit(0); break;
            }
        }
    }
}
