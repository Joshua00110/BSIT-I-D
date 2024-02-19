import java.util.Scanner;
public class JIMENEZ_ACTIVITY_VII{
    public static void main (String []args){
        Scanner sc= new Scanner(System.in);
        long factorial = 1;

        System.out.print("Enter Number: " );
        int num= sc.nextInt();

    for(long i=1; i <= num; i++){
        factorial *=i;
    }
           System.out.println(factorial);
        
        }
    }

        
    