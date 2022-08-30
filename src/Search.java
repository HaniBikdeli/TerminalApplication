import java.util.Scanner;

public class Search {
    public static void main(String[] args){
        Scanner scanner = new Scanner("C:\\ideaproject\\TerminalApplication\\src\\database.txt");
        String input = scanner.nextLine();
        String word = "admin";

        while (scanner.hasNext()) {
            String line = scanner.nextLine();

            if (line.contains(word)) {
                System.out.println();
            }
        }
    }
}
