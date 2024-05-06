import java.util.Scanner;

public class CAPACITE_ACTIVITY_I {
    public static void main(String[] args){
     int length  = getLength();
     int area  = length * width;
     int width  = getWidth();
     System.out.println("Area = : " + area);    
   }
     static int getLength () {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the leght of the rectangle: ");
     return sc.nextInt();
    }
     static int getWidth();
     Scanner sc = new Scanner(System.in);   
     System.out.print("Enter the width of the rectangle: ");
     return sc.nextInt();
    }
}