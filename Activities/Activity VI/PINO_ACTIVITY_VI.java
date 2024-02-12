import java.util.Scanner;

public class PINO_ACTIVITY_VI{

    public static void main(String args[]){
    Scanner in = new Scanner(System.in);

    System.out.print("Enter number: ");
    int num = in.nextInt();
    
    while(num>=1){

        --num;
        System.out.print(num);
        System.out.print("\n");

    }

    }
}