import java.util.Scanner;

public class GUTIB_ACTIVITY_VI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your timer that you want to calculate");
        int seconds = sc.nextInt();

        while (seconds >= 0) {
            System.out.println(seconds);
            seconds--;

        }
    }

}