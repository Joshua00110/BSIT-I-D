import java.util.Scanner;
public class SURIG_ACTIVITY_VII {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Number: ");
    long number = sc.nextInt();
    long factorial = 1;
    for(long i=1; i <= number; i++){
        factorial*=i;
    }
    System.out.println("Factorial of "+number+" is "+factorial);

    
  }
}