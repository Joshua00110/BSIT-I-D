import java.util.Scanner;
public class LARVIO_ACTIVITY_I {
    public static void main(String[] args) {
        double length= getlength();
        double width= getwidth();
        double area = length*width;
        System.out.println("Area="+area);
    }
    static double getlength () {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Length:");
        return sc.nextDouble();
    }
    static double getwidth () {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter a width:");
        return sc.nextDouble();
    }
}
    

