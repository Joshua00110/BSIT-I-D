import java.util.Scanner;
public class AGUILOS_ACTIVITY_I {
    public static void main(String []args){

        double length = inputL();
        double width = inputW();

        double Area = length * width;

        System.out.println("The Area of the rectangle is: " + Area);

    }

    public static double inputL(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        return sc.nextDouble();
    }
    public static double inputW(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Width: ");
        return sc.nextDouble();
    }


}