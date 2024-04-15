import java.util.Scanner;
public class MAASIN_ACTIVITY_II {
    static void facelessvoid(double feet){
        double ursa = feet*12;
        System.out.println(ursa);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your feet: ");
        double feet = sc.nextInt();
        System.out.print("Inches: " );
        facelessvoid ( feet);
    }
}