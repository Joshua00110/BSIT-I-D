import java.util.Scanner;
    public class DALIDA_ACTIVITY_II {
        static void convert(int feet){
            int res = feet*12;
            System.out.println("Inches: "+res);
        }
        public static void main(String []args){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the feet: ");
            int feet = input.nextInt();
            convert(feet);
        }
        
    }