import java.io.*;
import java.util.Scanner;

public class ReadData {
    static File file = new File("C:\\ideaproject\\TerminalApplication\\src\\database.txt");
    static Scanner input = new Scanner(System.in);
    private static int lineCount;
    static Scanner scanner;
    {
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }



    static BufferedWriter bw;

    static {
        try {
            bw = new BufferedWriter(new FileWriter(file , true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readLine() throws FileNotFoundException {
        String line = scanner.nextLine();
        System.out.println("Enter target user's Username for searching :");
        String userFind = input.nextLine();
        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            lineCount++;
        }
        if(line.contains(userFind)) {
            System.out.println(line);
        }
        //adsdad
    }
    public static void deleteLine(BufferedReader br , File f,  String Line) throws IOException {
        System.out.println("Enter target user's Username for deleting :");
        String currentLine;
        String trimmedLine = null;
        while ((currentLine = br.readLine()) != null) {
            lineCount++;
            trimmedLine = currentLine.trim();
        }
        if(trimmedLine.equals(Line)) {
            currentLine = "";
            System.out.println("User's credentials have been deleted from the database");
        }else{
            System.out.println("there is no such user in the database");
        }
        bw.write(currentLine + System.getProperty("line.separator"));
        bw.close();
        br.close();
        boolean delete = f.delete();
        boolean b = file.renameTo(f);
    }

}
