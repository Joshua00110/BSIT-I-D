import java.util.Scanner;

public class CLIMACO_ACTIVITY_I {
    public static double inputLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Length: ");
        return scanner.nextDouble()
    }
    public static double inputWidth() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Width: ");
        return scanner.nextDouble()
    }
    public static double calculateArea(double length, double width){
        return length * width;
    }
    public static void displayArea(double area) {
        System.out.println("Area of the rectangle is: " + area);
    }

    public static void main(String[] args) {
        double length = inputLength();
        double width = inputWidth();

        double area = calculateArea(length, width);

        displayArea(area);
    }
}




