import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData {
    public static void readLine() throws FileNotFoundException {
        File file = new File("C:\\ideaproject\\TerminalApplication\\src\\database.txt");
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(file);
        System.out.println("Enter target user's Username :");
        String userFind = input.nextLine();
        int lineCount = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            lineCount++;
            if(line.contains(userFind)) {
                System.out.println(line);
            }
        }
    }
}
