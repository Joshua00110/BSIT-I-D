import java.util.Scanner;

public class DELFIN_ACTIVITY_II {
    static void getfeet(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the feet: ");
        double feet = sc.nextDouble();
        double inches = feet * 12;
        System.out.println(inches);
    }
    public static void main(String []args){
        getfeet();
    }
}
