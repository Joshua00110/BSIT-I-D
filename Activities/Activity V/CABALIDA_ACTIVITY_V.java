import java.util.*;
public class CABALIDA_ACTIVITY_V {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Age:");
         int ages = sc.nextInt();
        if  (ages >=0 && ages <=11){
        System.out.println("Child");
        } else if ( ages >=12 && ages <=17){
        System.out.println("Teen");
         }
          else {
        System.out.println("Adult");
    }
        } 
            
        }
