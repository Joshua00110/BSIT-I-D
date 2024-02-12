import java.util.Scanner;

public class GUTIB_ACTIVITY_V {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = input.nextInt();

        if (age <= 50 && age >= 18) {
            System.out.println("Adult");
        } else if (age >= 12 && age <= 17) {
            System.out.println("Teen");
        } else if (age >= 0 && age <= 11) {

            System.out.println("Child");

        } else {
            System.out.println("Not their usual age");
        }
    }

}
}