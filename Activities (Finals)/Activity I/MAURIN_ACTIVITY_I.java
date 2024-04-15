import java.util.Scanner;
public class MAURIN_ACTIVITY_I{



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double lenght = inputLenght();
        double width = inputWidth();

        double Area = lenght*width;

        System.out.println("Area of the Rectangle is: "+ Area);

        
    }
    public static double inputLenght(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Lenght: ");
        return sc.nextDouble();
    }
    public static double inputWidth(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Width: ");
        return sc.nextDouble();
    }   

}
