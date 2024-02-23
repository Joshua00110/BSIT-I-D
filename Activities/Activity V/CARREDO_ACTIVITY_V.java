import java.util.Scanner;
public class CARREDO_ACTIVITY_V {
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int age;    
        System.out.print("Enter age: ");
        age = sc.nextInt();
        if (age >= 12 && age <= 17 ){
            System.out.println("Teen");
        }else if (age >= 0 && age <= 11) {
                System.out.println("Child");
            }else{
                System.out.println("Adult"); 
         }
    }
}
