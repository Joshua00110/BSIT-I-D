import java.util.Scanner;
public class ESTUDILLO_ACTIVITY_VII{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        long factorial = 1;
     
        System.out.print("Enter your number: ");
        int num = input.nextInt();

        
        for(int i=1; i<=num; i++){
            factorial *=i;
            System.out.println("Factorial of " + num + " is " + factorial);
        }
    }
}