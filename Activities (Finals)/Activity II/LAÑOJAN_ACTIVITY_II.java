import java.util.*;
public class LAÑOJAN_ACTIVITY_II    {
 public static void main (String[] args) {

    double feet = getfeet ();
   double inches = feet * 12;
    System.out.println("The inches are " +inches);
 }

    static double getfeet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter feet:");
        return sc.nextDouble();
    }


    

    
    }

