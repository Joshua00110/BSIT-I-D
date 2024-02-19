import java.util.Scanner;
    public class CALUNSAG_ACTIVITY_VII {
        public static void main(String []args){
            Scanner sc = new Scanner (System.in);
            long factorial = 1;
            System.out.println("Enter your Factorial: ");
            long num = sc.nextInt();
            long i=1;

            for(int x=1 ;x<=num; x++){
                i=i*x;

            }
            System.out.println("Factorial:"+i);


        }
        }
        
          
          