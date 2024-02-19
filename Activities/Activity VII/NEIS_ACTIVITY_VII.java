import java.util.Scanner;
public class NEIS_ACTIVITY_VII{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your factorial number: ");
        int number = sc.nextInt();
        long fact = 1;
        for(int i=1; i<=number; i++){
            fact*=i;
        }
            System.out.print(fact);
        
    }

}