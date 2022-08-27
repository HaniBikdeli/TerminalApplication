import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class ListUsers {
    public static void listUsers() throws FileNotFoundException {
        File database = new File("C:\\ideaproject\\TerminalApplication\\src\\database.txt");
        Scanner databaseReader = new Scanner(database);
        while (databaseReader.hasNextLine()){
            String credentials = databaseReader.nextLine();
            System.out.println(credentials);
        }
    }
}
