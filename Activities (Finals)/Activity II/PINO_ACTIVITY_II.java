import java.util.Scanner;

public class PINO_ACTIVITY_II{

    public static void main(String[] args) {

        double feet = getfeet();
        double inches =feet*12;
        
        System.out.println("Total inches is "+inches);

    }
    static double getfeet(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter foot");
        return in.nextDouble();

    }

}