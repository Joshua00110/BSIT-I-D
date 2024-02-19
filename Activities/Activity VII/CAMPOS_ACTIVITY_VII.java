import java.util.Scanner;
public class CAMPOS_ACTIVITY_VII {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your factorial: ");
        long num = sc.nextInt();
        long factorial=1;
        

        for (int x=1 ;x<=num; x++){
            factorial*=x;
        }
        System.out.println ("Factorial of  " +num+ " is " +factorial);
    
        


    }
}
