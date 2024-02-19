import java.util.Scanner;

public class MAAMBONG_ACTIVITY_VII {
    public static void main(String[] args) {
           Scanner sc = new Scanner (System.in);
           long factorial = 1;
           System.out.println("Enter Factorial number : ");
           long fac = sc.nextLong();
           for (long i = 1; i<=fac; i++){
        factorial*=i;
     }
    System.out.println("The Factorial of "+fac+" is "+factorial);
    sc.close();

    }
}