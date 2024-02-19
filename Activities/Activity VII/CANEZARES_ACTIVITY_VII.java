import java.util.Scanner;
public class CANEZARES_ACTIVITY_VII {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your non-negative integer:");
        int num =sc.nextInt();

        long fact = 1;
        for(int i = 1; i <= num; i++){
            fact *=i;
        }
        System.out.print(fact);
      
    }
}