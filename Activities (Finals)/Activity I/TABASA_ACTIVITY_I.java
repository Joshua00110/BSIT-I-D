import java.util.Scanner;
public class TABASA_ACTIVITY_I{
    
        static int length(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        return sc.nextInt();
        }
        static int width(){
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter the width of the rectangle: ");
            return sc.nextInt();
        }

        public static void main(String[] args){
            int lenght = length();
            int width = width();

            int area = lenght*width;

            System.out.println("Area:" +area);
        }
}