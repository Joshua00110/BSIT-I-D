import java.util.Scanner;
    public class OBINQUE_ACTIVITY_VII {
    
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter your number:");
            long num = input.nextInt();

            long fact = 1;
            for(long i=1; i<=num; i++){
                fact*=i;
                System.out.println("The factorial of" + " "+ num + " is " + fact);
        }
    }
}


