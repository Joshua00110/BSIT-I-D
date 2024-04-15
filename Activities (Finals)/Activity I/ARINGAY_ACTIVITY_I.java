import java.util.Scanner;

public class ARINGAY_ACTIVITY_I {

    static double inputlength(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the length of the rectangle: ");
        return sc.nextDouble();
    }

    static double inputwidth() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the width of the rectangle: ");
        return sc.nextDouble;
    }

    static double calculatearea(double length, double width){
        return length * width;
    }
    static void Area(double area){
        System.out.println("Area of the rectangle:" + Area);
        double Area = calculatearea(length, widdth);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = inputlength();
        double width = inputwidth();

    double area = calculatearea(length, widdth);

}
}



