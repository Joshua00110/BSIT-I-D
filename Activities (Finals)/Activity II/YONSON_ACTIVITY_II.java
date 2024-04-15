import java.util.Scanner;

public class YONSON_ACTIVITY_II {
    
  
    static void mic(double foot){
        System.out.println("foot*12");      
    }
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a num for your feet: ");
        int feet = sc.nextInt();
        System.out.println("inches : ");
        Foot(feet);
        
        sc.close();
       
    } 
}
