import java.util.Scanner;
public class JIMENEZ_ACTIVITY_1 {


    public static double rectangleL(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        return sc.nextDouble();
    }
    public static double rectangleW(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Width: ");
        return sc.nextDouble();
    }

    public static void main(String []args){

        double length = rectangleL();
        double width = rectangleW();

        double Area = length * width;

        System.out.println("The Area of the rectangle is: " + Area);

    }

  

}