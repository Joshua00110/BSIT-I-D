import java.util.Scanner;

public class PINO_ACTIVITY_I{

    public static void main(String[] args) {

        int length = getLength();
        int width = getWidth();
        int area = length*width;
        System.out.println("Area = "+area);



    }


    static double width() {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Width: ");
        return in.nextDouble();
    }
    static double length(){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Length");
        return in.nextDouble();



    }

}
    