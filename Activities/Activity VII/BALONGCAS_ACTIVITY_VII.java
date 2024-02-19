import java.util.Scanner;
public class BALONGCAS_ACTIVITY_VII {

    public static void main(String[] args) {
        Scanner fc = new Scanner(System.in);
        System.out.print("Input your number: ");
        long num = fc.nextLong();
        long factorial = 1;

        for(long i = 1; i<= num; i++){

            factorial *=i;            
        }
        System.out.println("Factorial of "+num+" is "+factorial);



    }
}