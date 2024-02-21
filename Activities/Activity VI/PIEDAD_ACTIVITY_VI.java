import java.util.Scanner;
public class PIEDAD_ACTIVITY_VI{
    public static void main(String []args){
        Scanner countdown = new Scanner(System.in);
        System.out.print("Input number: ");
        int count = countdown.nextInt();

        while(count >=0){
            System.out.println(count);  
            count--;
        }
    }
       
}