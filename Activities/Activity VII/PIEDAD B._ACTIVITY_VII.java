import java.util.Scanner;
public class PIEDAD_ACTIVITY_VII {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your factorial number: ");
        long num = input.nextInt();
        long factorial= 1;
        for(long x=1; x<=num;  x++){
        factorial *=x;  
        System.out.println(factorial);
        }
      
    }
}