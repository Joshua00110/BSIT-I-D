import java.util.Scanner;

public class PINO_ACTIVITY_Vll{

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter num: ");
        int num = in.nextInt();
        long fact = 1;
        for(long a=1; a<=num; a++){
        fact*=a;
       
    }
    System.out.println("The factorial of "+" "+num+" is "+fact);

    }

}