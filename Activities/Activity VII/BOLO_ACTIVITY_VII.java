import java.util.Scanner;
class BOLO_ACTIVITY_VII{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        long num = sc.nextInt();

        long factor = 1;
        for(long i = 1; i <=num; i++){
            factor *=i;

        }    
        System.out.print(factor);    

    }
}