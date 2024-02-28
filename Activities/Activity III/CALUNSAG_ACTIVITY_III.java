import java.util.Scanner;
public class CALUNSAG_ACTIVITY_III{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Celcius: ");

        int temp = sc.nextInt();
        if (temp >= 100){
            System.out.print(" Boiling");
            
        }else{
            System.out.print("Not Boing");            
        }
    
    
    }

}
