import java.util.Scanner;
public class BOLO_ACTIVITY_II {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter The Inches Of Your Feet: ");
        int num = sc.nextInt();

        
        mul(num);

    }
    public static void mul(int num){
        System.out.print("The Inches Of Your Feet is: "+ num * 12);        
    }
    
}
