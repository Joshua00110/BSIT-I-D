import java.util.Scanner;
public class ALLEGO_ACTIVITY_I_FINALS {
    static int width(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        return sc.nextInt();
      }

    static int length(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle:");
        return sc.nextInt();
    }
  
    public static void main(String []args){

     int result = width() * length();
     System.out.print("Area of the rectangle is " + result);

    }




}
