import java.util.Scanner;
public class TABASA_ACTIVITY_VII {
    public static void main(String []args ){
        
        Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter your number: ");
            int num = sc.nextInt();
            
            long factorial = 1;
            for(long i=1; i <= num; i++){
                factorial *=i;
            }  
                
                System.out.println(factorial);
            

    }
}
