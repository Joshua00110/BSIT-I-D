import java.util.Scanner;
public class MAURIN_ACTIVITY_II {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter Feet: ");
        int num = sc.nextInt();

        convert(num);


    }
    public static void convert(int num){
        System.out.println("Enter Inches: "+num*12);

    }
    
}
    
       

