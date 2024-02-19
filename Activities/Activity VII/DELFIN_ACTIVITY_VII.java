import java.util.*;
public class DELFIN_ACTIVITY_VII {
    public static void main(String [] args){
       
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your number: ");
        
        int number = sc.nextInt();
        long factorial = 1;
        
        for(long x=1; x<= number; x++){
            factorial*=x;
        }
        System.out.println(factorial);
        sc.close();
    }    
}

