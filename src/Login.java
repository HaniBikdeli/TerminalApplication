import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import static java.lang.System.exit;


public class Login {
    public static void login(int numberOfTries){
        numberOfTries = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Username :");
        String username = scanner.nextLine();
        System.out.println("Enter password :");
        String password = scanner.nextLine();

        if (username.equals("admin") && password.equals("1234")){
            System.out.println("You are authorized");
        }else{
            numberOfTries+=1;
            System.out.println("Try again");
            if (numberOfTries<3){
                System.out.println("try again \nYou have "+(3-numberOfTries)+" tries left");
                login(numberOfTries);
            }
            System.out.println("You are not authorized");
        }
    }
}
