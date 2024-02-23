import java.util.Scanner;
public class PAUSTOR_ACTIVIT_VII {

    public static void main(String[] args) {
        Scanner fc = new Scanner(System.in);

         System.out.print("Input ");
         long num = fc.nextLong();
         long factorial = 1;

         for(long i = 1; i<=num;i++){
            factorial *=i;
         }
         System.out.print(factorial);
    }
}
            
            
        

        
    
