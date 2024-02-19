import java.util.Scanner;
public class DIVIVAR_ACTIVITY_VII {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);

        long factorial= 1;

    System.out.println("Enter number:");
    int num= sc.nextInt();

    for(int i = 1; i <num;i++){
    factorial*=i;
}
    System.out.println("Factorial of "+num+" is " +factorial);

    }
}
    

