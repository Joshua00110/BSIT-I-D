import java.util.Scanner;
public class DALIDA_ACTIVITY_V {
    public static void main (String []args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print( "ENTER AGE");
        int age = sc.nextInt();

        if (age<=64 && age >=18){
            System.out.println("ADULT");
        }else if (age<=17 && age >=12){
            System.out.println("TEEN");
        }else{
            System.out.println("CHILD");
        }
    }
}