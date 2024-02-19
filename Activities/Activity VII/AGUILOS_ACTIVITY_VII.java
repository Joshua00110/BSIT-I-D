import java.util.Scanner;
public class AGUILOS_ACTIVITY_VII {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        long factorial= 1;

    System.out.println("Enter a number");
    int num= sc.nextInt();

    for(int i = 1; i <=num;i++){
    factorial*=i;
}
    System.out.println("The factorial of "+num+" is "+ factorial);

    }
}