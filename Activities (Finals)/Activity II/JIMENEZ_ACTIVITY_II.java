import java.util.Scanner;
public class JIMENEZ_ACTIVITY_II{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        

           System.out.print("Enter Feet: ");
           int Feet = sc.nextInt();

           inches(Feet);


    }
    static void inches(int Feet){
        System.out.println("Your inches is :"+ Feet * 12);
    }
}