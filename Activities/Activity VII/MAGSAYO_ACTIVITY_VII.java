import java.util.Scanner;
public class MAGSAYO_ACTIVITY_VII {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long factorial =1;
        do{
        System.out.print("Enter any number: ");
        long num = sc.nextInt();
        for(long i=1; i <= num; i++){
            factorial *=i;
        }
            System.out.println("The factorial of "+ num + " is " + factorial);
    }while(factorial != 0);  
}
}