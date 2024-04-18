import java.util.Scanner;
public class PIEDADB_ACTIVITY_I {
    public static void main(String[]args){
        int length= getlength();
        int width= getwidth();
        int area = length * width;
        System.out.println("Area ="+ area);
    }
        static int getlength(){
            Scanner sc=new Scanner(System.in);
        System.out.print("Input the lenght of the rectangle: ");
        return sc.nextInt();
        }
        static int getwidth(){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the width of the rectangles: ");
            return sc.nextInt();
        }

    }