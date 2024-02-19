import java.util.Scanner;
public class MACAPAZ_ACTIVITY_VII{
 
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Factorial Number: ");
        long number = sc.nextInt();
        long fact = 1;
        for (long i=1; i<= number;i++){
            fact*=i;
        }
        System.out.println(fact);
        sc.close();
        
        
     }
}

