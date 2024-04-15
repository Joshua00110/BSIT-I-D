import java.util.Scanner;

public class YONSON_ACTIVITY_I {
    public static void main(String[]args) {
        int length = getLength();
        int width = getWidth();
        int area = getArea();
        System.out.println("Area: " + area);
    }
    static int getLength(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        return sc.nextInt();
    
    }
    static int getWidth(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the rectrangle: ");
        return sc.nextInt();
    }
    

         
}