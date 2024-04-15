import java.util.*;

public class GUTIB_ACTIVITY_II {

    static void FeettoInches(double feet) {

        double res = feet * 12;
        System.out.println(res);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your feet: ");
        double feet = sc.nextDouble();
        FeettoInches(feet);

        System.out.println("Enter the name of your crush");
    }

}