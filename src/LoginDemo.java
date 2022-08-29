import java.util.Scanner;

public class LoginDemo {
    public static final int MAXIMUM_LOGIN_TRY = 3;
    static String user;
    static int pass;
    public static void main(String[] args) {
//        this.user=user;
//        this.pass=pass;
        int numberOFTries = 0;
        login(numberOFTries);
    }
    public static void login(int numberOFTries){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your user name : ");
        String user = scan.nextLine();
        System.out.println("Enter your password : ");
        int pass = scan.nextInt();
        if (user.equals("admin") && pass == 123){
            System.out.println("wellcome " + user);
        }else{
            numberOFTries+=1;
            if (numberOFTries < 3) {
                System.out.println("try again \nYou have "+(3-numberOFTries)+" tries left");
                login(numberOFTries);
            }else
                System.out.println("You have reached maximum login tries");
        }
    }
}
