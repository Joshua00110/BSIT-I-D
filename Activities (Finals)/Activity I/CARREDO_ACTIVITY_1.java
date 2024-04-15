import java.util.Scanner;
    public class CARREDO_ACTIVITY_1 {
        static double length() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Length: ");
            return sc.nextDouble();
        }
    
        static double width() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Width: ");
            return sc.nextDouble();
        }
    
        public static void main(String[] args) {
    
            double result = width() * length();
            System.out.println("The Area is " + result);
        }
    
    }