import java.util.Scanner;
public class ALIBONG_Activity_II {
    public static void main (String []args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter your first number: ");
            int firstNumber = sc.nextInt();
            System.out.print("Enter your second number: ");
            int secondNumber = sc.nextInt();

            int sum = firstNumber + secondNumber;
            int difference = firstNumber - secondNumber;
            int product = firstNumber * secondNumber;

            System.out.println("Sum = " + sum);
            System.out.println("Difference = " + difference);
            System.out.println("Product = " + product);
    
    }
      
}
