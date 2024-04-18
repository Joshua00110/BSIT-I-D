import java.util.Scanner;

public class PIEDADB_ACTIVITY_II {

    public static void feetToInches(double feet){
        double inches = feet * 12;
        System.out.println("The result in inches is: " + inches);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of feet: ");
        double feet = sc.nextDouble();
        feetToInches(feet);
    }
}