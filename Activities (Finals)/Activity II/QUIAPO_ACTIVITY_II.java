import java.util.Scanner;
public class QUIAPO_ACTIVITY_II {

    static void conversion(int feet){
        int res = feet * 12;
        System.out.println("Inches: "+ res);

    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter feet: ");
        int feet = sc.nextInt();
        conversion (feet);
    }
    
}