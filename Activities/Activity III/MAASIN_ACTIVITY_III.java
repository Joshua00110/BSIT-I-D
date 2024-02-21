import java.util.Scanner;
public class MAASIN_ACTIVITY_III {
    public static void main(String[] args) {
        int temp;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the temperature (in celcius): ");
        temp = input.nextInt();
         if (temp >= 100){
            System.out.println("Boiling");
         }else 
         System.out.println("Not boiling");
         
        
    }
}