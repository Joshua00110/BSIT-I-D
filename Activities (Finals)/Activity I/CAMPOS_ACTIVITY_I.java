import java.util.Scanner;

public class CAMPOS_ACTIVITY_I {
    public static void main(String[]args){
        int length = getLength();
        int width = getWidth();
        int area = length * width;
        System.out.println("Enter the area: " +area);
    }
    public static int getLength() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        return sc.nextInt();
    }
  
    public static int getWidth() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Width of the rectangle: ");
        return sc.nextInt();
      
    }
}

