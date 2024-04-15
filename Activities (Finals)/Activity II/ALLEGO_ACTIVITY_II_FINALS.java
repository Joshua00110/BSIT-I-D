import java.util.Scanner;
public class ALLEGO_ACTIVITY_II_FINALS {
    static void conversion (int feet){
    int res = feet * 12;
    System.out.println("Conversion of feet to Inches: " + res);
    }

public static void main (String []args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the feet: ");
    int feet =sc.nextInt();
    conversion(feet);
}   

}
