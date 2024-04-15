import java.util.Scanner;

public class CLIMACO_ACTIVITY_II {

    public static void feetToInches(double feet){
        double inches = feet * 12;
        System.out.println("The result in inches is: " + inches);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of feet: ");
        double feet = scanner.nextDouble();
        feetToInches(feet);
    }
}