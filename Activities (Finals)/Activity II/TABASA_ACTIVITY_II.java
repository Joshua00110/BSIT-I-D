import java.util.Scanner;
public class TABASA_ACTIVITY_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your feet: ");
        double feet = sc.nextDouble();
        System.out.println("Inches: ");
        FeettoInches(feet);
    }
   
   static void FeettoInches (double feet){
        double res = feet * 12;
        System.out.println(res);
    }
   
}
