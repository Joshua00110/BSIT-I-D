import java.util.Scanner;
public class MAGSAYO_ACITIVITY_VI {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int sec;
        System.out.print("Enter time in seconds: ");
         sec = sc.nextInt();
        while (sec >= 0) {
            System.out.println(sec);
             sec= sec - 10;
            
        }
    }

}
