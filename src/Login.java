import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static java.lang.System.exit;


public class Login {
    private static int numberOfTries = 0;
    public static void login(int numberOfTries){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Username :");
        String username = scanner.nextLine();
        System.out.println("Enter password :");
        String password = scanner.nextLine();

        if (username.equals("admin") && password.equals("1234")){
            System.out.println("You are authorized");
        }else{
            numberOfTries+=1;
            if (numberOfTries<3){
                System.out.println("try again \nYou have "+(3-numberOfTries)+" tries left");
                login(numberOfTries);
            }else {
                System.out.println("You are not authorized");
                exit(0);
            }
        }
    }
}
